package com.company;

import java.util.Scanner;

public class Calculations {


    public static void Add(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?: ");
        int num1 = input.nextInt();

        System.out.println("What is the number you would like to add to it?: ");
        int num2 = input.nextInt();

        System.out.println("Your answer is "+(num1+num2));
    }
    public static void Subtract(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?: ");
        int num1 = input.nextInt();

        System.out.println("What is the number you would like to subtract to it?: ");
        int num2 = input.nextInt();

        System.out.println("Your answer is "+(num1-num2));
    }
    public static void Multiply(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?: ");
        int num1 = input.nextInt();

        System.out.println("What is the number you would like to multiply to it?: ");
        int num2 = input.nextInt();

        System.out.println("Your answer is "+(num1*num2));
    }
    public static void Divide(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?: ");
        int num1 = input.nextInt();

        System.out.println("What is the number you would like to divide it by?: ");
        int num2 = input.nextInt();

        System.out.println("Your answer is "+(float)(num1/num2));
    }
}
