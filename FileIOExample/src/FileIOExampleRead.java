import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FileIOExampleRead {
    static String iString;
    static String iFirstName, iLastName;
    static int iHours;
    static double iRate;
    static double cPay;
    static String oPay;
    static Scanner payrollScanner;
    static PrintWriter pw;
    static boolean eof = false;
    static int cEmpCtr = 0;
    static double cEmpPayTot = 0;

    public static void main(String[] args){
        init();

        while(!eof){
            calcs();

            output();

            input();
        }
        totals();
        pw.close();
    }
    public static void init(){
        try{
            payrollScanner = new Scanner(new File("payroll.dat"));
        }
        catch (FileNotFoundException e1){
            System.out.println("File error");
            System.exit(1); // end the program
        }

        try{
            pw = new PrintWriter(new File("payroll_report.prt"));
        }
        catch(FileNotFoundException e){
            System.out.println("Output file error");
            System.exit(1);
        }

        pw.format("%-25s%5s%-25s%5s%5s%5s%5s%5s%10s%n%n", "First Name", " ", "Last Name", " ", "Hours", " ", "Rate", " ",
                    "Pay Amount");
        input();
    }
    public static void input(){
        String record;

        if (payrollScanner.hasNext()){
            record = payrollScanner.nextLine();
            iFirstName = record.substring(0,25);
            iLastName = record.substring(25,50);
            iString = record.substring(50,53);
            iHours = Integer.parseInt(iString);
            iString = record.substring(53,58);
            iRate = Double.parseDouble(iString);
        }
        else{
            eof = true;
        }

    }
    public static void calcs(){
        cPay = iHours * iRate;
        cEmpCtr ++;
        cEmpPayTot += cPay;

    }
    public static void output(){
        pw.format("%-25s%5s%-25s%5s%5d%5s%5.2f%5s%10.2f%n%n", iFirstName, " ", iLastName, " ",
                iHours, " ", iRate, " ", cPay);
    }

    public static void totals(){
        DecimalFormat dfEmpCtr = new DecimalFormat("#,##0");
        DecimalFormat dfEmpPayTot = new DecimalFormat("$##,###.00");

        String oEmpCtr = dfEmpCtr.format(cEmpCtr);
        String oEmpPayTot = dfEmpPayTot.format(cEmpPayTot);

        pw.format("%n%21s%5s%54s%10s%n", "Number of Employees: ", oEmpCtr, " ", oEmpPayTot);
    }
}
