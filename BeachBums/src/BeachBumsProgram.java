// this program takes in information about sales on a beach and prints a receipt.
//David Amos 12/27/2019
import java.util.Scanner;

public class BeachBumsProgram {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        Beach myBeach = new Beach();

        input(myBeach);

        myBeach.calcs();

        System.out.println(myBeach.output());

    }

    private static void input(Beach myBeach){

        System.out.println("Enter Beach Name: ");
        myBeach.setBeachName(myScanner.nextLine());

        System.out.println("Enter Snow Cones: ");
        myBeach.setScQty(Integer.parseInt(myScanner.nextLine()));
        //takes the input, parses it into an integer, then gives that to the setter.

        System.out.println("Enter Snow Cone Price: ");
        myBeach.setScPrice(Double.parseDouble(myScanner.nextLine()));

        System.out.println("Enter Corn Dogs: ");
        myBeach.setCdQty(Integer.parseInt(myScanner.nextLine()));

        System.out.println("Enter Corn Dog Price: ");
        myBeach.setCdPrice(Double.parseDouble(myScanner.nextLine()));



    }

}
