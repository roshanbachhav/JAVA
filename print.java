package com;  //Is optional.
import java.util.Scanner;   //Scanner is use for Give input as end user.

public class first
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in); // Use make scanner object.

    /* ---------------------STRING------------------------*/
    System.out.println("Hello world");    //No user define
    System.out.println("Enter String");
    String First = scan.nextLine();  // Initialized the String.
    System.out.println(First);

    /* ---------------------INT------------------------*/
    System.out.println(10+10);    //No user define function
    System.out.println("Enter First digit");
    int first = scan.nextInt();  // Initialized the First digit.
    System.out.println("Enter Second digit");
    int second = scan.nextInt();  // Initialized the Second digit.
    int ans = first + second;
    System.out.println(ans);
  }
}
