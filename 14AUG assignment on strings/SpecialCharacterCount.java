package com.string.assignmentsIiNeuron;

import java.util.Scanner;

public class SpecialCharacterCount {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in) ;
        StringBuilder str = new StringBuilder(ip.nextLine()) ;
        int SpeCharCount = 0 ;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) >= 33 && str.charAt(i) <= 47 || str.charAt(i) >=58 && str.charAt(i) <= 64 || str.charAt(i) >= 91 && str.charAt(i) <= 96 || str.charAt(i) >= 123 ){
                SpeCharCount++ ;
            }
        }
        System.out.println("no of special characters in string are :\t" + SpeCharCount);
    }
}
