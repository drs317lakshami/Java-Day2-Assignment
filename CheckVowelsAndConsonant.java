package com.bridgelabz.firstday;

import java.util.Scanner;

public class CheckVowelsAndConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char c = sc.next().charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + " is a vowel.");
                break;
            default:
                System.out.println(c + " is a consonant.");
        }
    }
}