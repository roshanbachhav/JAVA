package com.simple.example;
import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //----------------------------- IF ELSE --------------------------------------

        int a,b;
        //intillize the amount.
        System.out.println("Enter number for a");
        a = scn.nextInt();
        System.out.println("Enter number for b");
        b = scn.nextInt();
        //if else start...
        if (a>b){
            System.out.println("Given  a  is greater than b :: " + a);
        }
        else{
            System.out.println("Given b is greater than a :: " + b);
        }


        //----------------------------- NESTED IF ELSE --------------------------------------

        int age;
        System.out.println("Enter age");
        age = scn.nextInt();

        if (age >=18){
            if (age >= 18 && age <= 25){
                System.out.println("You are eligible for voting");
            }
            else {
                System.out.println("You are good citizen");
            }
        }
        else {
            System.out.println("You are children now");
        }

        //----------------------------- IF ELSE LADDER --------------------------------------


        int n;
        System.out.println("Enter number");
        n = scn.nextInt();

        if (n >= 0 && n <= 10){
            System.out.println("The number under 0 to 10");
        }
        else if (n >= 11 && n <= 20){
            System.out.println("The number under 11 to 20");
        }
        else if (n >= 21 && n <= 30) {
            System.out.println("The number under 21 to 30");
        }
        else if (n >= 31 && n <= 40){
            System.out.println("The number under 31 to 40");
        }
        else if (n >= 41 && n <= 50){
            System.out.println("The number under 41 to 50");
        }
        else{
            System.out.println("The given number is above 50");
        }
    }
}
