package com.string.assignmentsIiNeuron;

import java.util.Scanner;

public class SortAlphabetically {
    public static void main(String[] args) {
        System.out.println("enter only small or only capital letters.....");
        Scanner ip = new Scanner(System.in);

        String StrToSort = ip.nextLine();

        int[] counter = new int[52];
        String result = "" ;
//        thinking of a logic that is for first 26 numbers it will count small letter 26 for capital  letters
        for (int i = 0; i < StrToSort.length(); i++) {
            if ((char)65 <= StrToSort.charAt(i) && StrToSort.charAt(i) <= (char)90) {
                counter[StrToSort.charAt(i) - 39]++;
            } else if ((char)97 <= StrToSort.charAt(i) && StrToSort.charAt(i) <= (char)123) {
                counter[StrToSort.charAt(i) - 97]++;
            }
        }
        for (int i = 0; i < counter.length; i++) {
            if (i <= 25) {
                while (counter[i] > 0) {
                    result += ((char) (i + 97));
                    counter[i]--;
                }
            } else {
                while (counter[i] > 0) {
                    result += ((char) (i + 39));
                    counter[i]--;
                }
            }

        }
        System.out.println(result);
    }
}

