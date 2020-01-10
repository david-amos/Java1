import java.util.Scanner;

/**
 * This class promts for name, phone and rental minutes.
 * Calculates hours, extra minutes and cost, then displays it.
 */
public class SammysProgramRevised {
    //global variable
    static Scanner scannyMcScanner = new Scanner(System.in);

    public static void main(String[] args) {


        //Construct a Rental object with the input data (instantiation)
        RentalRevised myRental = new RentalRevised();
        input(myRental);
        //call the calc method
        myRental.calc();

        //display data
        System.out.println(myRental.display());



    }

    public static String input(RentalRevised myRental) {
        String iName, iPhone;
        int cMinutes, iMinutes;
        System.out.println("Enter your name: ");
        iName = scannyMcScanner.nextLine();
        myRental.setName(iName);

        System.out.println("Enter your phone number: ");
        iPhone = scannyMcScanner.nextLine();
        myRental.setPhone(iPhone);

        System.out.println("Enter minutes rented: ");
        iMinutes = scannyMcScanner.nextInt();

        myRental.setTotMinutes(iMinutes);

        return scannyMcScanner.nextLine();
    }
}

