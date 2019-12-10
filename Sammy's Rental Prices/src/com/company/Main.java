package com.company;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
    String pattern = "$###,###.00";
    DecimalFormat moneyFormat = new DecimalFormat(pattern);
    String iData;
    Integer iMinutes;
    Integer cHours;
    Integer cMinutes;
    Double cTotal;
    String oTotal;
    iData = JOptionPane.showInputDialog(null,"Enter Minutes of rental: ",
            "Rental Minutes", 1);
    iMinutes = Integer.parseInt(iData);
    cHours = iMinutes / 60;
    cMinutes = iMinutes % 60;
    cTotal = cMinutes + cHours * 40.00;
    oTotal = moneyFormat.format(cTotal);
    System.out.println("ssssssssssssssssssssssssssssssssssssssssssss");
    System.out.println("s Hours          Minutes       Total       s");
    System.out.printf("%2s%5s%10s%7s%7s%7s%6s \n" , "s ", cHours, " ", cMinutes, " ", oTotal, "     s" );
    System.out.println("ssssssssssssssssssssssssssssssssssssssssssss");
    }
}
