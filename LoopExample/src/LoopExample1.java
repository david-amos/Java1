import javax.swing.*;
import java.util.Scanner;

public class LoopExample1 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args){
        String input = "y";
        while (input.toUpperCase() .equals("Y")) {
            int num = enterNum();
            output(num);
            System.out.println("Would you like to go again (y or n)");
            input = myScanner.nextLine();
        }
    }
    public static int enterNum(){
        int iNum = 0;
        boolean valid = false;
        while(!valid) {

            try {
                iNum = Integer.parseInt(JOptionPane.showInputDialog(null, "How many Yayeets would you like"));
                if (iNum >= 5 && iNum <= 10) {
                    System.out.println("number entered ok. Enter to continue");

                    valid = true;
                } else {
                    System.out.println("number must be 5-10. Press enter");
                }
                myScanner.nextLine();
            } catch (Exception e) {
                System.out.println("Must enter a whole number. Press enter");
                myScanner.nextLine();

            }

        }
        return iNum;
    }
    public static void output(int yanum){
        System.out.print("Enter your name:" );
        String iName = myScanner.nextLine();
        //name must be 5-10 and have a number

        if(iName.trim().length() >= 5 && iName.trim().length() <= 10){
            if(iName.matches("[0-9][-][0-9]{3}[-][0-9]{5}[-][0-9]")){
                System.out.println("Name is valid");
            }
            else{
                System.out.println("A number is required");
            }
            System.out.println("Name must be between 5 and 10 characters");
        }
        int num = 0;
        while(num < yanum){
            System.out.println("Yayeet");
            num++;
        }//end loop
    }//end method
}//end class
