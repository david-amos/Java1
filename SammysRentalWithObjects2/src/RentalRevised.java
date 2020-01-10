/**
 * this class is used to create Rental Objects.
 */


public class RentalRevised {
    //instance variables (stored inside the object)
    private String name;
    private String phone;
    private int totMinutes;
    private int hours;
    private int extraMinutes;
    private double cost;
    // class variables
    private static final int RATE = 40;

    //accessors or getters
    //aloud outside class to retrieve data.
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public int getTotMinutes(){
        return totMinutes;
    }


    //mutators or setters
    public void setName(String n){
        this.name = n;
    }
    public void setPhone(String n){
        this.phone = n;
    }
    //encapslating protects data. setters implement validation
    public void setTotMinutes(int n){
        if(n < 30)
            totMinutes = 30;
        else
            totMinutes = n;
    }

    //constructor (special method with same name as the class name)
    //use this. to refer to the current object

    /**
     *
     * @param n
     * @param p
     * @param m
     */
    public RentalRevised(String n, String p, int m){
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
    public RentalRevised(){
        name = "Mickey Mouse";
        phone = "1-800-DISNEY";
        totMinutes = 60;
    }
}
