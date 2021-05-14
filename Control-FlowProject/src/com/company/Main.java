package com.company;



import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        AsciiChars.printNumbers();
        AsciiChars.printUpperCaseLetters();
        AsciiChars.printLowerCaseLetters();



        char again = 'y';
        while (again == 'y') {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Your Name: ");
            String yourName = scanner.next();
            System.out.println("Hello " + yourName);


            System.out.println("Would you like to continue the survey? ");
            System.out.println(" (yes, no)");
            String contSurvey = String.valueOf(scanner.next());


            switch (contSurvey) {

                case "Y":
                case "y":
                case "yes":
                    System.out.println("Let's Continue!");


                    break;

                case "N":
                case "n":
                case "no":
                    System.out.println("OK ByeBye Now");
                    System.exit(0);

            }


            System.out.print("Do you have a red car?");
            System.out.print(" (yes, no)");
            String redCar = scanner.next();
            switch (redCar) {
                case "Y":
                case "y":
                case "yes":
                    System.out.println("Nice!");

                    break;

                case "N":
                case "n":
                case "no":
                    System.out.println("Get a new car now!");

                    break;

                default:
                    System.out.println("Incorrect Input");


            }

            System.out.println("What is your favorite pets name? ");
            String favPetName = scanner.next();
            System.out.println(favPetName + " is an awesome name!");


            boolean validPetAge = false;
            int favPetAge = 0;

            while (!validPetAge) {
                System.out.println("How old is your favorite pet?");
                favPetAge = scanner.nextInt();
                if (favPetAge >= 1) {
                    validPetAge = true;

                    if (favPetAge <= 2) {
                        System.out.println("Aww it's still a baby");

                    } else if (favPetAge >= 3) {
                        System.out.println("Cool");

                    } else {
                        System.out.println("Invalid");
                    }
                }
            }


            System.out.println("What is your lucky number? ");
            int favNum = scanner.nextInt();

            System.out.println("Do you have a favorite QB? ");
            System.out.print(" (yes, no)");
            String favQB = scanner.next();
            switch (favQB) {
                case "Y":
                case "y":
                case "yes":
                    System.out.println("What's they're jersey number? ");
                    Integer jerseyNum = scanner.nextInt();

                    break;

                case "N":
                case "n":
                case "no":
                    System.out.println("Ok, no problem.");


            }

            System.out.println("What is the 2-digit model year of your car? ");
            String carYear = scanner.next();

            System.out.println("What is the first name of your favorite actor? ");
            String favActor = scanner.next();


            boolean validRandomNum = false;
            int randomNum = 0;

            while (!validRandomNum) {
                System.out.println("Enter a random number between 1 and 50");
                randomNum = scanner.nextInt();
                if (randomNum > 0 && randomNum <= 50) {
                    validRandomNum = true;

                } else {
                    System.out.println("Invalid Number");
                }
            }


            Random random = new Random();
            int someNumber = random.nextInt(5);

            Random random2 = new Random();
            int someNumber2 = random2.nextInt(75);

            int[] lottery = new int[5];
            int randNum;
            for (int i = 0; i < 5; i++) {
                randNum = (int) (Math.random() * randomNum);
                if (randNum == 0) {
                    continue;
                }
                for (int x = 0; x < i; x++) {


                    if (lottery[x] == randNum) {

                        randNum = (int) (Math.random() * randomNum);
                        x = -1;


                    }
                }
                lottery[i] = randNum;
                if (lottery[i] == 0) {
                    continue;
                }

            }


            System.out.print("Lottery Numbers: ");
            for (int i = 0; i < lottery.length; i++)

                System.out.print(lottery[i] + " ");


            int magicBall = favNum * someNumber;
while (magicBall > 75) {
    magicBall -= 75;
}



                if (magicBall > 0 && magicBall <= 75) {
                    System.out.println("Magic Ball: " + magicBall);

                }
                    else {
                        System.out.println("Magic Ball: " +  someNumber2);

                }



            System.out.println("Would you like to play again? (y/n)");
            again = scanner.next().charAt(0);

        }

        System.out.println("OK Thanks ByeBye");
        System.exit(0);


    }
        }


