import java.util.Scanner;

public class CalcSample {
    static String iName;
    static int iHours;
    static double iRate;
    static double cNetPay;
    static String oHours, oRate, oNetPay;
    static Scanner myScanner;
    public static void main(String[] args){
        myScanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        iName = myScanner.nextLine();

        System.out.println("Enter Hours: ");
        iHours = myScanner.nextInt();

        System.out.println("Enter rate: ");
        iRate = myScanner.nextDouble();

        cNetPay = iHours * iRate;

        System.out.println("Wage info for: " + iName);
        System.out.println("    Hours: " + iHours);
        System.out.println("    Rate: " + iRate);
        System.out.println("    Net Pay: " + cNetPay);

        System.out.println("    Program Complete");
    }
}
