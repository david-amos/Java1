import java.util.Scanner;

/**
 * This class promts for name, phone and rental minutes.
 * Calculates hours, extra minutes and cost, then displays it.
 */
public class SammysProgram {
    //global variable
    static Scanner scannyMcScanner = new Scanner(System.in);

    public static void main(String[] args){
        String iName = inputName();
        String iPhone = inputPhone();
        int iMinutes = inputMinutes();

        //Construct a Rental object with the input data (instantiation)
        Rental myRental = new Rental(iName, iPhone, iMinutes);

        //call the calc method
        myRental.calc();

        //display data
        System.out.println(myRental.display());

        iName = inputName();
        iPhone = inputPhone();
        iMinutes = inputMinutes();
        myRental = new Rental(iName, iPhone, iMinutes);
        myRental.calc();
        System.out.println(myRental.display());

    }
    public static String inputName(){
        System.out.println("Enter your name: ");
        return scannyMcScanner.nextLine();
    }
    public static String inputPhone(){
        System.out.println("Enter your phone number: ");
        return scannyMcScanner.nextLine();
    }
    public static int inputMinutes() {
        System.out.println("Enter Minutes of rental: ");
        return scannyMcScanner.nextInt();
    }
}
