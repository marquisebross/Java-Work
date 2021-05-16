package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner pop = new Scanner(System.in);
        System.out.println("Please Enter 5 Numbers: ");
        int array[] = new int[5];

       for (int i = 0; i < 5; i++) {
           array[i] = pop.nextInt();
       }

        System.out.print("Your Numbers Are: ");
       for (int i =0; i < 5; i++) {
           System.out.print(array[i] + " ");
       }


            System.out.println();
           int sum = 0;
           int i;
           for (i = 0; i < array.length; i++)
               sum += array[i];

            System.out.println("Sum of Given Numbers: " + sum);



            int product = 1;
            for (i = 0; i < array.length; i++)
                product *= array[i];

            System.out.println("Product of Given Numbers: " + product);


       int largest = array[0];
       for (i =1; i < array.length; i++)
           if (array[i] > largest)
               largest = array[i];
        System.out.println("Largest Number from Given Numbers: " + largest);

        int smallest = array[0];
        for (i =1; i < array.length; i++)
            if (array[i] < smallest)
                smallest = array[i];
        System.out.println("Smallest Number from Given Numbers: " + smallest);


        




    }
}
