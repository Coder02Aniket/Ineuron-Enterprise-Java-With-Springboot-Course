package com.ineuton.assignments;

public class Writeineuron {

    public static void main(String[] args) {
//        1.Write a program(WAP) to print INEURON using pattern programming logic.
        int n = 10 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j == (n-1) / 2 || i == 0 || i == n - 1 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ") ;
                }
            }
            System.out.print(" ");
            for(int j = 0 ; j < n ; j++ ){
                if (j == 0 || i == j  || j == n -1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0 ; j < n ; j++){
                if (j == 0 || (i == 0 && j < n -2 ) ||( i == n -1 && j < n - 2) || i == (n-1)/2 && j <= (n-1)/2) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0 ; j < n ; j++){
                if( j == 0 || i == n - 1 || j == n -1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0 ; j < n ; j++){
                if(j == 0 || i == 0 || j == n -1 && i < (n-1) / 2  || i == (n-1) / 2  || i - j == (n -1 ) / 2 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0 ; j < n ;j++ ){
                if(j == 0 || j == n - 1 || i == 0 || i == n-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0 ; j < n ; j++ ){
                if (j == 0 || i == j  || j == n -1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            System.out.println();
        }

    }
}
