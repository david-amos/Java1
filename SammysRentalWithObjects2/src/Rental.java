/**
 * this class is used to create Rental Objects.
 */


public class Rental {
    //instance variables (stored inside the object)
    private String name;
    private String phone;
    private int totMinutes;
    private int hours;
    private int extraMinutes;
    private double cost;
    // class variables
    private static final int RATE = 40;

    //constructor (special method with same name as the class name)
    //use this. to refer to the current object

    /**
     *
     * @param n
     * @param p
     * @param m
     */
    public Rental(String n, String p, int m){
        name = n;
        phone = p;
        totMinutes = m;

        /**
         * Calculates hours, extra minutes, and cost.
          */
    }
    public void calc(){
        hours = totMinutes / 60;
        extraMinutes = totMinutes % 60;
        cost = (hours * RATE) + extraMinutes;
    }

    /**
     * Returns a formatted string from Rental data.
     * @return
     */
    public String display(){
        return ("name: " + name +
                "\nPhone: " + phone +
                "\nHours: " + hours +
                "\nExtra Minutes: " + extraMinutes +
                "\nCost: " + cost);
    }
}
