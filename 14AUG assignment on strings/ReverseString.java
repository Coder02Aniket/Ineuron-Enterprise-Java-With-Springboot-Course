package com.string.assignmentsIiNeuron;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("enter string to reverse.....");
        String input , result = "" ;
        Scanner sc = new Scanner(System.in) ;
        input = sc.nextLine() ;
        for(int i = input.length() - 1 ; i >= 0 ; i--){
//            for doing first letter of reversed string as capital
            if(i == input.length()-1 && input.charAt(i) >= 'a'){
                result = result +  (char)(input.charAt(i) - 32);
                continue;
            }
// for making last letter of reversed string small ...........
            else if (i == 0 && input.charAt(i) <= 'Z'){
                result = result + (char)(input.charAt(i) + 32 );
                continue;
            }
            result = result + input.charAt(i) ;
        }
        System.out.println("Reversed string is : " + result  ) ;
    }
}
