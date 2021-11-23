package com.company;

/*
 * @author Arman Karapetyan
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(50));
        System.out.println(isEvenNumber(51));
        System.out.println(convertOpposite("I love Java."));
        System.out.println(Arrays.toString(getNotRepeatElements(new int[]{4, 5, 1, 2, 9, 4, 1, 2})));
        System.out.println(getFirstBit(18));


    }

    // check if a number is even
    public static boolean isEvenNumber(int number) {
        return number > 0 && number % 2 == 0;
    }

    // convert to opposite
    public static String convertOpposite(String word) {

        String upperCase = word.toUpperCase();
        String lowerCase = word.toLowerCase();

        StringBuilder finallyWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == upperCase.charAt(i)) {
                finallyWord.append(lowerCase.charAt(i));
            } else if (word.charAt(i) == lowerCase.charAt(i)) {
                finallyWord.append(upperCase.charAt(i));
            }
        }
        return finallyWord.toString();
    }

    // find not repeated elements in array
    // dont use Collections
    public static int[] getNotRepeatElements(int[] array) {

        boolean term;
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < array.length - 1; i++) {
            term = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    term = false;
                    break;
                }
            }
            if (term) {
                stringBuilder.append(array[i]);
            }
        }

        int[] notRepeatArray = new int[stringBuilder.length()];

        for (int i = 0; i < notRepeatArray.length; i++) {
            notRepeatArray[i] = Character.getNumericValue(stringBuilder.charAt(i));
        }

        return notRepeatArray;
    }

    //find the position of the first set-bit
    public static String getFirstBit(int number) {
        String bits = intToBinary(number);
        int bitPosition = 0;

        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                bitPosition = bits.indexOf('1') + 1;
                break;
            }
        }
        return "First bit position: " + String.valueOf(bitPosition);
    }


    // convert int to binary and reserve
    private static String intToBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number != 0) {
            binary.append(number % 2 == 0 ? "0" : "1");
            number = number / 2;
        }
        return binary.toString();
    }

}
