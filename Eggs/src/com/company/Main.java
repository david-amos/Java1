package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    static int cEggs;
    static int cDus;
    static int cLoose;
    static double cTotal;

    public static void main(String[] args) {

        String iEggs;
        iEggs = JOptionPane.showInputDialog(null,"Enter number of eggs: ");
        cEggs = Integer.parseInt(iEggs);

        cDus = cEggs / 12;
        cLoose = cEggs%12;

        cTotal = cDus * 3.25 + cLoose * .45;

        JOptionPane.showMessageDialog(null, "Your total is: " + cTotal +
                        " You ordered " + cDus + " dozen eggs at 3.25 And " + cLoose +
                        " Loose eggs for 45 cents each", "Egg Total", JOptionPane.INFORMATION_MESSAGE);

        //System.out.println("Your total is: " + cTotal);
        //System.out.println("You ordered " + cDus + " dozen eggs at 3.25");
        //System.out.println("And " + cLoose + " Loose eggs for 45 cents each");


    }
}
