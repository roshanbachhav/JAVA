// package com.simple.example;

import java.util.Locale;
import java.util.Scanner;
public class string{
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);

        //print string
       String name="String";
       System.out.println(name);
       
        //print lenght
       int value = name.length();
       System.out.println(value);

        //print a string as uppercase character
       String value1=name.toUpperCase();
       System.out.println(value1);

        //print a string as lowercase character
       String value2=name.toLowerCase();
       System.out.println(value2);

        //remove white spaces in string.
       String nts = "      String     ";
       System.out.println(nts.trim());

        //create a smaller string
       String value3 = "String";
       System.out.println(value3.substring(3));

        //replace a new character it means replacing word.
       System.out.println(value3.replace('S','M'));

       //check last character end by n character.
       System.out.println(value3.endsWith("n"));

        //print Element at which index
       System.out.println(value3.charAt(0));

        //compare two string without using uppercase and lowercase.
       System.out.println(value3.equalsIgnoreCase("String"));

         String value4 = "String is easy";
         String value5 = "String is hard";

         //print element as Lowercase character.
       System.out.println(value4.toLowerCase());
         //print element as UPPERCASE character.
       System.out.println(value5.toUpperCase());

//       value3=value3.replace(" " , "_");
//       System.out.println(value3);
//        String text = "Dear <|name|> . Thanks lot";
//        text=text.replace("<|name|>", "String" );
//        System.out.println(text);

    }
}
