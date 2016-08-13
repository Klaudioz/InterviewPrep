package Hackerrank;

/**
 * Created by Klaudioz on 13-Aug-16.
 */
import java.io.*;
import java.util.*;

public class W22s6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int num=0;
        List<Integer> list = new ArrayList();
        for(int i=0;i<times;i++){
            String type=sc.next();
            if(type.equals("+")){
                num = sc.nextInt();
                list.add(num);
                System.out.println(prefixFunction(list));
                //System.out.println("+"+num);
            }
            if(type.equals("-")){
                list.remove(list.size()-1);
                System.out.println(prefixFunction(list));
                //System.out.println("-"+num);
            }
            //System.out.println(list);
        }
        sc.close();
    }
    public static int prefixFunction(List<Integer> list){
        int maxK=0,n=list.size();
        if(n<=1)
            return 0;
        else{
            for(int k=1;k<=n-1;k++){
                System.out.println("a: "+String.valueOf(list.subList(0,k)));
                System.out.println("b: "+String.valueOf(list.subList(n-k,n)));
               if(list.subList(0,k).equals(list.subList(n-k,n)))
                   maxK=k;
            }
        }
        return maxK;
    }
}