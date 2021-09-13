/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;
import java.text.*;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        //p
        System.out.print("What is the principal amount? ");
        String s1 = x.nextLine();
        Double num1 = null;
        try {
            num1 = Double.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        //r
        System.out.print("What is the rate? ");
        String s2 = x.nextLine();
        Double num2 = null;
        try {
            num2 = Double.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        //t
        System.out.print("What is the number of years? ");
        String s3 = x.nextLine();
        Double num3 = null;
        try {
            num3 = Double.valueOf(s3);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        //n
        System.out.print("What is the number of times the interest is compounded per year? ");
        String s4 = x.nextLine();
        Double num4 = null;
        try {
            num4 = Double.valueOf(s4);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        double n1 = num1;
        double n2 = num2/100;
        double n3 = num3;
        double n4 = num4;
        double exp = n3*n4;
        double a1 = (1+(n2/n4));
        double a1e = Math.pow(a1,exp);
        double a1ex = n1*a1e;
        double a2 = Math.ceil(a1ex*100);
        double a3 = a2/100;

        System.out.println("$"+n1+" invested at "+num2+"% for "+n3+" years compounded "+n4+" times per year is $"+a3);

        System.exit(0);
    }
}
