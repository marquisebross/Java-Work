package com.company;

public class Main {

    public static void main(String[] args) {


int [] arr = new int [] {4, 5, 11, 7, 33};

int sum = 0;

for (int i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
}

        System.out.println("Sum of all the values of an array: " + sum);

        double[] arr2 =  {4, 5, 11, 7, 33};

        double maximum = arr2[0];

        int index = 0;

        for (int i = 1; i <arr2.length; i++) {
            if (arr2[i] > maximum) {
                maximum = arr2[i];
                index = i;
            }
        }
        System.out.println(index);


//    public static int toPower(Integer[] power, int size){
//
//        int[] result = null;
//        for(int i = 0; i < size; i++) {
//            result[i] = (int)Math.pow(i, size);
//
//        }
//
//        }




    }
}
