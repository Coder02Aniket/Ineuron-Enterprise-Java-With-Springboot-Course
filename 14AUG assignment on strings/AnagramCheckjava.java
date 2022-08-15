package com.string.assignmentsIiNeuron;

import java.util.Scanner;

public class AnagramCheckjava {
    public static void main(String[] args) {
        System.out.println("."+10);
        String input1,input2 ;
        Scanner ip = new Scanner(System.in) ;
        System.out.println("enter first string...");
        input1 = ip.nextLine();
        System.out.println("enter second string...");
        input2 = ip.nextLine() ;
        if(input2.length() != input1.length()){
            System.out.println("NOT AN ANAGRAM.....");
        }
        else{
            char[] fip1 = input1.toCharArray();
            char[] fip2 = input2.toCharArray();
            boolean checker = false ;
            for (char value : fip1) {
                for (char c : fip2) {
                    if (value == c) {
                        checker = true;
                        break;
                    } else {
                        checker = false;

                    }
                }
                if (!checker) {
                    System.out.println("NOT AN ANAGRAM.....");
                    break;
                }
            }
            if(checker){
                System.out.println("THE STRING IS AN ANAGRAM....");
            }

        }

//        double declaratrion no need



    }
}
