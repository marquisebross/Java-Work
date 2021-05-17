package com.company;

import java.util.Scanner;

public class Numbers {

    public static void numbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add, subtract, multiply, divide?");
        String answer = input.nextLine();


        if (answer.equals("add")) {
            Calculations.Add();
        } else if (answer.equals("subtract")) {
            Calculations.Subtract();
        } else if (answer.equals("multiply")) {
            Calculations.Multiply();
        } else if (answer.equals("divide")) {
            Calculations.Divide();

        } else {
            System.out.println("Sorry, but you have entered an incorrect input. Please try again");
            Numbers.numbers();
        }
    }
}