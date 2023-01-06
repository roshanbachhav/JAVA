package com;
import java.util.*;

public class armstrong {
    public static void main(String[] args){
        int number , realno , result = 0 , reminder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digit number");
        number = sc.nextInt();
        realno = number;
        while(realno!=0){
            reminder = realno % 10;
            result += reminder*reminder*reminder;
            realno=realno/10;
        }
        if (result==number){
            System.out.println("given number is Armstrong " + number);
        }
        else{
            System.out.println("given number is not Armstrong");
        }
    }
}
