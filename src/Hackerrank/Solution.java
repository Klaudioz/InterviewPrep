package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int cont=0;
        Scanner in = new Scanner(System.in);
        String S = in.next();
        for(int i=0;i<S.length()/3;i++)
            if (!(S.charAt(3*i)=='S' && S.charAt(3*i+1)=='O' && S.charAt(3*i+2)=='S'))
                cont++;
        System.out.println(cont);
    }
}
