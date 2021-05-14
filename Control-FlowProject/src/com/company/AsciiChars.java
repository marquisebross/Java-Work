package com.company;

public class AsciiChars {


        public static void printNumbers(){
            System.out.println("Valid Number Inputs");
            char ch;
            for(ch = 48; ch <= 57; ch++){

                System.out.print(ch+" ");

            }
            System.out.println();
        }

    public static void printUpperCaseLetters(){
        System.out.println("Valid Uppercase Letter Inputs");
        char ch;
        for(ch = 65; ch <= 90; ch++){

            System.out.print(ch+" ");

        }
        System.out.println();
    }

    public static void printLowerCaseLetters(){
        System.out.println("Valid Lowercase Letter Inputs");
        char ch;
        for(ch = 97; ch <= 122; ch++){

            System.out.print(ch+" ");

        }
        System.out.println();
    }



    }




