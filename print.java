package com.simple.example; // optional 
import java.util.Scanner; // use for user input like scanf function in c programming


public class print {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //printing elements without using user input`s.
        System.out.println("Hello World ");

        //printing elements with user input`s.
        String Print_string;
        System.out.println("Enter name");
        Print_string = sc.next();
        System.out.println(Print_string);
    }
}
