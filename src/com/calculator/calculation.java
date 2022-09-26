package com.calculator;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class calculation {
    public static void main(String[] args) {
        int A, B, C;
        System.out.println("enter two numbers");
        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();
        while (true) {
            System.out.println("select an option");
            System.out.println("1. Addition ");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
C=s.nextInt();


            switch (C) {
                case 1:
                    System.out.println("sum=" + (A = B));
                    break;
                case 2:
                    System.out.println("Sub=" + (A - B));
                    break;
                case 3:
                    System.out.println("mult=" + (A * B));
                    break;
                case 4:
                    System.out.println("div=" +  (A / B));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                System.out.println("invalid option");
                break;

            }

        }

    }


    }






