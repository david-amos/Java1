package com.company;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static String iData;
    public static Double cTip, cTax, cTotal, iCharge;
    public static String oTip, oTax, oTotal, oCharge;

    public static void main(String[] args) {

    init();
	input();
	calcs();
	output();
    }
    public static void init(){
        JOptionPane.showMessageDialog(null,"Hello Welcome", "David's Resturante",
                1);

    }
    public static void input(){

        iData = JOptionPane.showInputDialog(null,"Enter the food cost.",
                "Food cost", 1);
        iCharge = Double.parseDouble(iData);
    }
    public static void calcs(){
        cTip = .15 * iCharge;
        cTax = iCharge * .07;
        cTotal = cTip + cTax + iCharge;
    }
    public static void output(){
    String pattern =  "$###,###.00";
    DecimalFormat moneyFormat = new DecimalFormat(pattern);

    oTip = moneyFormat.format(cTip);
    oTax = moneyFormat.format(cTax);
    oTotal = moneyFormat.format(cTotal);
    oCharge = moneyFormat.format(iCharge);

    System.out.println("Charge: " + oCharge);
    System.out.println("Your tip is: " + oTip);
    System.out.println("Sales tax is: " + oTax);
    System.out.println("Total is: " + oTotal);
    }
}
