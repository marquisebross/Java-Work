package com.company;

public class PowerTo {

    public static int[] toPower(int size, int power) {

        int[] result = null;
        for (int i = 0; i < size; i++) {
            result[i] = (int) Math.pow(i, size);

        }
        return result;

    }

}


