package com;
import java.util.*;

class arithmetic_operation
{
    void AP(int ch)
    {
        int a,b,result;
        Scanner sc = new Scanner(System.in);
        switch (ch) {
            case 1:
                System.out.println("Enter a");
                a = sc.nextInt();
                System.out.println("Enter b");
                b = sc.nextInt();
                result = (a + b);
                System.out.println("Addition of a + b -> " + result);
                break;
            case 2:
                System.out.println("Enter a");
                a = sc.nextInt();
                System.out.println("Enter b");
                b = sc.nextInt();
                result = (a - b);
                System.out.println("Subtraction of a - b -> " + result);
                break;
            case 3:
                System.out.println("Enter a");
                a = sc.nextInt();
                System.out.println("Enter b");
                b = sc.nextInt();
                result = (a * b);
                System.out.println("Multiplication of a * b -> " + result);
                break;
            case 4:
                System.out.println("Enter a");
                a = sc.nextInt();
                System.out.println("Enter b");
                b = sc.nextInt();
                result = (a / b);
                System.out.println("Division of a / b -> " + result);
                break;
            case 5 : System.exit(0);
            default:
                System.out.println("Enter Valid input");
        }
    }
}
public class switch_case {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {


            System.out.println("1:addition");
            System.out.println("2:subtraction");
            System.out.println("3:multiplication");
            System.out.println("4:Division");
            System.out.println("5:Exit");
            System.out.println("Enter choice -> ");
            choice = sc.nextInt();
            arithmetic_operation ap = new arithmetic_operation();
            ap.AP(choice);
        }while (choice!=5);
    }
}
