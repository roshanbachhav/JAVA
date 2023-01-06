package com;
import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        char ch;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter character");
        ch=scan.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
            System.out.println("Given character are vowel "+ch);
        }
        else {
            System.out.println("Given char are consonant ");
        }

    }
}
