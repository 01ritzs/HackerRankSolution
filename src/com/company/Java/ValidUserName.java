package com.company.Java;

import java.util.Scanner;

public class ValidUserName {

    public static final String regularExpression = "([a-zA-Z])(\\w){7,29}";
}


class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(ValidUserName.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}