package com.company;

import java.util.Scanner;

public class Main {
    static int iEggs;
    static int cDus;
    static int cLoose;
    static double cTotal;
    static Scanner myScanner;
    public static void main(String[] args) {
        myScanner = new Scanner(System.in);

	    System.out.println("Enter number of eggs: ");
        iEggs = myScanner.nextInt();

        cDus = iEggs / 12;
        cLoose = iEggs%12;

        cTotal = cDus * 3.25 + cLoose * .45;

        System.out.println("Your total is: " + cTotal);
        System.out.println("You ordered " + cDus + " dozen eggs at 3.25");
        System.out.println("And " + cLoose + " Loose eggs for 45 cents each");


    }
}
