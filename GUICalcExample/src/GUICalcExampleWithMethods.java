import javax.swing.*;

public class GUICalcExampleWithMethods {
    //global variables


    static final double TUITION_RATE = 185;


    public static void main(String[] args){
        String iName;
        int iCredits;
        double totalOwed;


        init();         //call the init method
        iName = inputName();        //call the input method
        iCredits = inputCredits();
        totalOwed = calcs(iCredits);        //call the calc method
        output(iName, totalOwed, iCredits);       //call the output method
    }

    /**
     * javadoc comment
     * The init method creates a welcome message
     */
    public static void init(){
        /*JOptionPane.showMessageDialog(null, "Welcome to IHCC Tuition Calculator",
                "Welcome", JOptionPane.INFORMATION_MESSAGE);*/
        HelperMethods.DisplayWelcome();

    }

    /**
     * Prompts for name and credits
     */
    public static String inputName() {
        //get name
        return JOptionPane.showInputDialog(null, "Enter student name:");
    }
    public static int inputCredits(){
        //get credits and convert to integer
        String strCredits;
        strCredits = JOptionPane.showInputDialog(null, "Enter number of credits:");
        return Integer.parseInt(strCredits);


    }

    /**
     * Calculate tuition (credits * tuition rate)
     */
    public static double calcs(int iCredits) {

        return TUITION_RATE * iCredits;
    }

    public static void output(String iName, double totalOwed, int iCredits) {
        JOptionPane.showMessageDialog(null, "Hello " + iName + ", " + iCredits +
                        " credits will cost you $" + totalOwed,
                "Pay Up!", JOptionPane.INFORMATION_MESSAGE);

    }
}
