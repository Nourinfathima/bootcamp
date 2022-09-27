package com.emp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class employes {
    public static void main(String[] args) {
        String name;
        ArrayList<String> s=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int c;
        while (true)
        {
            System.out.println("1. enter the employe details");
            System.out.println("2. view employe");
            System.out.println("3. Exit");
            c=sc.nextInt();
                    switch(c)
                    {
                case 1:
                    System.out.println("enter the employe name");
                    name=sc.next();
                    s.add(name);
                    break;
                case 2:
                    System.out.println(s);
                    break;
                    case 3:
                    System.exit(0);
                    break;
                        default:
                        System.out.println("invalid option");
                        break;

            }

        }




    }
}


