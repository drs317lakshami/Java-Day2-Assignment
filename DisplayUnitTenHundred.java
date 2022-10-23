package com.bridgelabz.firstday;

import java.util.Scanner;

public class DisplayUnitTenHundred {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        
        int a = sc.nextInt();

        if (a < 10) {
            System.out.println("Entered number's unit is ones");
        } else if (a < 100) {
            System.out.println("Entered number's unit is tens");
        } else if (a < 1000) {
            System.out.println("Entered number's unit is hundred");
        } else if (a < 10000) {
            System.out.println("Entered number's unit is thousands");
        } else {
            System.out.println("Sorry try again.");
        }
    }
} 