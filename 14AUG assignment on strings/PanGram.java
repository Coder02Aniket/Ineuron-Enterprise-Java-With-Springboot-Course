package com.string.assignmentsIiNeuron;

import java.util.Scanner;

public class PanGram {
    public static void main(String[] args) {

        boolean[] checker = new boolean[26];
        Scanner ip = new Scanner(System.in) ;
        String input = ip.nextLine() ;
        String[] inputArr = input.split(" ") ;
        for (String s : inputArr) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                    checker[s.charAt(j) - 97] = true;
                } else if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
                    checker[s.charAt(j) - 65] = true;
                }
            }
        }
        for (boolean b : checker) {
            if (!b) {
                System.out.println("NOT A PANAGRAM.....");
                System.exit(0);
            }
        }
        System.out.println("THE STRING IS PANAGRAM...");

    }
}
