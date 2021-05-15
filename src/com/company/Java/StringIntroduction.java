package com.company.Java;

import java.util.Scanner;
public class StringIntroduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
        String result = (A.substring(0,1).toUpperCase() + A.substring(1));
        String result1 = (B.substring(0,1).toUpperCase() + B.substring(1));
        System.out.println(result + " " + result1);

    }
}