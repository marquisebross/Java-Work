package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner pop = new Scanner(System.in);
        HashMap<String, String> modelMake = new HashMap<String, String>();

        modelMake.put("Maxima", "Nissan");
        modelMake.put("Challenger", "Dodge");
        modelMake.put("Commander", "Jeep");
        modelMake.put("Suburban", "Chevrolet");
        modelMake.put("4Runner", "Toyota");
//        System.out.println(modelMake);

        System.out.println("What kind of car(model) are you looking for?");
        String input = pop.nextLine();



        String make = modelMake.get(input);

        if(modelMake.containsKey(input)) {

            System.out.println("Oh, you're looking for a " + input + "? " + " Our " + make + " selection is right over here.");
        } else{
            System.out.println("Sorry " + input + " is not in our inventory.");
        }

    }
}
