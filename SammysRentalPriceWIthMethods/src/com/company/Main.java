package com.company;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	SammysMotto.Sammys();
	int inum;
	inum = input();
	procedure(inum);
    }

    private static void procedure(int num1) {
        int cHours, cMinutes;
        double cTotalCost;
        cHours = num1 / 60;
        cMinutes = num1 % 60;
        cTotalCost = cMinutes + cHours * 40;
        output(cHours, cMinutes, num1, cTotalCost);
    }

    private static void output(int hour, int exMin, int totMin, double cost) {
        System.out.println("Total Minutes Rented: " + totMin);
        System.out.println("Total Full Hours: " + hour);
        System.out.println("Extra Additional Minutes: " + exMin);
        System.out.println("Total Cost of Rental: " + cost);
    }

    public static int input() {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.println("Enter Minutes of Rental:");
       return myScanner.nextInt();
    }
}
