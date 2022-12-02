package com.simple.example;
import java.util.Scanner;

public class arrayMatrix {
    public static void main(String[] args) {
        int i,j;
        int a[][] = new int[5][5];
        int b[][] = new int[5][5];
        int sum[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows you want");
        int r = sc.nextInt();
        System.out.println("Enter columns you want");
        int c = sc.nextInt();

        System.out.println("Print first matrix");
        for (i=0;i<r;i++){
            System.out.println("");
            for (j=0;j<r;j++){
                System.out.printf("a :: [%d][%d]  " , i , j);
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix");
        for (i=0;i<r;i++){
            System.out.println("");
            for (j=0;j<r;j++){
                System.out.printf("b :: [%d][%d]  " , i , j);
                b[i][j] = sc.nextInt();
            }
        }
        for (i=0;i<r;i++){
            System.out.println("");
            for (j=0;j<r;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Printing Sum Matrix");
        for (i=0;i<r;i++){
            System.out.println("");
            for (j=0;j<r;j++){
                System.out.printf("%d \t",sum[i][j]);
            }
        }
    }
}
