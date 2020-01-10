import java.util.Scanner;

public class SammysNoObjects {
    //global variables
    static Scanner scannyMcScanner = new Scanner(System.in);


    public static void main(String[] args){
        // local variables
        String iName, iPhone;
        int iMinutes;
        int cHours;
        int cExMins;
        double cTotal;
        iName = inputName();
        iPhone = inputPhone();
        iMinutes = inputMinutes();
        cHours = calcHours(iMinutes);
        cExMins = calcExMins(iMinutes);
        cTotal = calcTotal(cExMins, cHours);
        output(cHours, cExMins, cTotal);

    }

    public static String inputName(){
        System.out.println("Enter your name: ");
        return scannyMcScanner.nextLine();
    }
    public static String inputPhone(){
        System.out.println("Enter your phone number: ");
        return scannyMcScanner.nextLine();
    }
    public static int inputMinutes(){
        System.out.println("Enter Minutes of rental: ");
        return scannyMcScanner.nextInt();
    }
    public static int calcHours(int minutes){
        return minutes / 60;
    }
    public static int calcExMins(int totMins){
        return totMins % 60;
    }
    public static int calcTotal(int minutes, int hours){


        return hours * 40 + minutes;

    }
    public static void output(int hours, int exMin, double total){
        System.out.println("Whole hours rented: " + hours);
        System.out.println("Extra minutes rented: " + exMin);
        System.out.println("Total cost: " + total);
    }
}
