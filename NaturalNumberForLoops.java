package com.bridgelabz.firstday;

import java.util.Scanner;

public class NaturalNumberForLoops {
    public static void main(String[] args) {

        int n, sum = 0;
        System.out.println("Enter a Natural Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println("The result is: " +sum);
    }
}