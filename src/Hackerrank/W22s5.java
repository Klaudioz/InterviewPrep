package Hackerrank;

import java.io.*;
import java.util.*;

public class W22s5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        Map<Set<Integer>, Integer> map = new HashMap<>();
        int n = sc.nextInt(); //size set U
        for (int i = 1; i <= n; i++)
            set.add(i);
        sets = powerSet(set);
        for (Set varSet : sets)
            map.put(varSet,0);
        int times = sc.nextInt(); //number queries
        for (int i = 0; i < times; i++) {
            int numberCase1;
            String numberCase2;
            char[] charArray = new char[16];
            Set<Integer> tempSet = new HashSet<Integer>();
            Set<Set<Integer>> tempSets = new HashSet<Set<Integer>>();
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    numberCase1 = sc.nextInt(); //value
                    numberCase2 = sc.next(); //set binary representation
                    charArray = numberCase2.toCharArray();
                    for(int k=0;k<charArray.length;k++){
                        if(charArray[k]=='1')
                            tempSet.add(k+1);
                    }
                    tempSets = powerSet(tempSet);
                    for (Set varSet : tempSets) {
                        if (sets.contains(varSet))
                            map.put(varSet,numberCase1);
                    }
                    //System.out.println(map);
                    break;
                case 2:
                    numberCase1 = sc.nextInt(); //value
                    numberCase2 = sc.next(); //set binary representation
                    charArray = numberCase2.toCharArray();
                    for(int k=0;k<charArray.length;k++){
                        if(charArray[k]=='1')
                            tempSet.add(k+1);
                    }
                    tempSets = powerSet(tempSet);
                    for (Set varSet : tempSets) {
                        if (sets.contains(varSet))
                            map.put(varSet,numberCase1^map.get(varSet));
                    }
                    //System.out.println(map);
                    break;
                case 3:
                    numberCase2 = sc.next(); //set binary representation
                    charArray = numberCase2.toCharArray();
                    for(int k=0;k<charArray.length;k++){
                        if(charArray[k]=='1')
                            tempSet.add(k+1);
                    }
                    tempSets = powerSet(tempSet);
                    for (Set varSet : tempSets) {
                        if (sets.contains(varSet) && varSet.size()>0)
                            System.out.println(map.get(varSet));
                    }
                    break;
            }
        }
    }

    public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}