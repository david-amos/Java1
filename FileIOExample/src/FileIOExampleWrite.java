import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOExampleWrite {

    static String iString;
    static String iFirstName, iLastName;
    static int iHours;
    static double iRate;
    static Scanner myScanner;
    static char inputAgain = 'Y';
    static PrintWriter pw;

    public static void main(String[] args){
        init();

        while(inputAgain == 'Y'){
            input();

            output();

            System.out.println("Enter another employee? Y or N: ");
            inputAgain = myScanner.next().toUpperCase().charAt(0);
        }

        pw.close();

        System.out.println("Program complete");
    }
    public static void init(){
        myScanner = new Scanner(System.in);

        try{
            pw = new PrintWriter(new File("payroll.dat"));
        }catch (FileNotFoundException e){
            System.out.println("Output file error");
        }
    }
    public static void input(){
        System.out.println("Enter First Name: ");
        iFirstName = myScanner.nextLine();
        while(iFirstName.trim().length() < 1 || iFirstName.trim().length() > 25){
            System.out.println("First Name must be between 1 and 25 characters, re enter");
            System.out.println("Enter first name: ");
            iFirstName = myScanner.nextLine();
        }
        System.out.println("Enter Last Name: ");
        iLastName = myScanner.nextLine();
        while(iLastName.trim().length() < 1 || iLastName.trim().length() > 25){
            System.out.println("Last Name must be between 1 and 25 characters, re enter");
            System.out.println("Enter last name: ");
            iLastName = myScanner.nextLine();
        }

        do{
            try {
                System.out.print("Enter hours: ");
                iString = myScanner.nextLine();
                iHours = Integer.parseInt(iString);
                if(iHours < 0 || iHours > 999){
                    System.out.println("Hours must be 0 - 999, re-enter");
                }
            }
            catch (Exception e){
                System.out.println("Hours must be 0 - 999, re-enter");
                iHours = -1;
            }
        }while(iHours < 0 || iHours > 999);

        do{
            try{
                System.out.print("Enter Rate: ");
                iString = myScanner.nextLine();
                iRate = Double.parseDouble(iString);
                if(iRate < 7.25 || iRate > 99.99){
                    System.out.println("Rate must be 7.25 - 99.99, re-enter");
                }
            }
            catch(Exception e){
                System.out.println("Rate must be 7.25 - 99.99, re-enter");
            }
        }while(iRate < 7.25 || iRate > 99.99);

    }

    public static void output(){
        String record;
        record = String.format("%-25s%-25s%03d%05.2f", iFirstName, iLastName, iHours, iRate);//5.2 means 99.99 5 total and decimal counts
        pw.println(record);
        //pw.format("%-25s%-25%03d%05.2f", iFirstName, iLastName, iHours, iRate);
    }
}
