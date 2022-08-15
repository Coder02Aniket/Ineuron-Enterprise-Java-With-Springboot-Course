package com.string.assignmentsIiNeuron;

import java.util.Scanner;

public class ReverseStringPreservePosition {
    public static void main(String[] args) {
        System.out.println("Enter String to reverse preserving its position .....");
        Scanner it = new Scanner(System.in) ;
        String input = it.nextLine() ;
        String result = "" ;
        String[] ex = input.split(" ") ;
        for (String s : ex) {
            for (int j = s.length() - 1; j >= 0; j--) {
                result += s.charAt(j);
            }
            result += " ";
        }
        System.out.println(result);
    }
}
