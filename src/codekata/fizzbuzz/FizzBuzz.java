package codekata.fizzbuzz;

import java.util.Scanner;

/**
 * Created by Klaudioz on 03-Aug-16.
 */
public class FizzBuzz {
    public static void main(String args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("FizzBuzz");
        System.out.print("Insert Number: ");
        int number = sc.nextInt();
        System.out.println(of(number));
    }

    public static String of(int i) {
        String s="";
        if(i==0)
            return "0";
        if(i%3==0)
            s += "Fizz";
        if(i%5==0)
            s += "Buzz";
        return s.isEmpty() ? String.valueOf(i) : s;
    }
}
