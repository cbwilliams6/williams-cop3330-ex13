package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static double calculateCompoundInterest(double principal, double roi, int years, int compound)
    {
        double finalAmount = principal * Math.pow((1 + (roi / compound)), (compound * years));
        return finalAmount;
    }
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the principal amount? ");
        double principal = input.nextDouble();
        System.out.println("What is the rate? ");
        double roi = input.nextDouble() / 100;
        System.out.println("What is the number of years? ");
        int years = input.nextInt();
        System.out.println("What is the number of times the interest is compounded per year? ");
        int compound = input.nextInt();

        double finalAmount = calculateCompoundInterest(principal, roi, years, compound);
        System.out.println("$" + String.format("%.2f", principal) + " invested at " + (roi * 100) + "% for " + years + " years compounded " + compound + " times per year is $" +
                String.format("%.2f", finalAmount));
    }
}
