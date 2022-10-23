package com.bridgelabz.firstday;

import java.util.Scanner;

public class NaturalNumberWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Natural Number: ");
        int a = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= a) {
            sum = sum + i;
            i++;
        }
        System.out.println("The result is: " +sum);
    }
}