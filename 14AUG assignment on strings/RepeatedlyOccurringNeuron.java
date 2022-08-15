package com.string.assignmentsIiNeuron;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedlyOccurringNeuron {
    public static void main(String[] args) {
        String input ;
        Scanner ip = new Scanner(System.in) ;
        input = ip.nextLine();
        char[] charArr =  input.toCharArray() ;
        int[] counter = new int[26] ;
        for(char i : charArr){
            if('A' <= i &&   i <= 'Z'){
                counter[i - 65] ++ ;
            } else if('a' <= i && i <= 'z'){
                counter[i - 97]++;
            }
        }
        for(int i = 0 ; i < counter.length ; i++ ){
            if(counter[i]>0){
                System.out.println("character\t"+ (char)(i+65) + "\t repeated\t" + counter[i] + "\ttimes...." );
            }

        }

    }
}
