import java.text.DecimalFormat;

public class Toy {
    public static String greeting = "Merry Cristler";
    private static final double TAXRATE = .07;
    private String firstName, lastName, firstToy, secondToy;
    private double firstToyPrice, secondToyPrice, subtotal, taxAmount, totalBill;

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getFirstToy(){return firstToy;}
    public String getSecondToy(){return secondToy;}
    public double getFirstToyPrice(){return firstToyPrice;}
    public double getSecondToyPrice(){return secondToyPrice;}

    public void setFirstName(String name){
        firstName = name;
    }
    public void setLastName(String name){
        lastName = name;
    }
    public void setFirstToy(String toy){
        firstToy = toy;
    }
    public void setSecondToy(String toy){
        secondToy = toy;
    }
    public void setFirstToyPrice(double price){
        firstToyPrice = price;
    }
    public void setSecondToyPrice(double price){
        secondToyPrice = price;
    }

    /**
     *initializes the variables with default values
     */
    public Toy(){
        firstName = "Elf";
        lastName = "Onashelf";
        firstToy = "Monopoly";
        secondToy = "Legos";
        firstToyPrice = 15.75;
        secondToyPrice = 12.00;
    }

    /**
     * calculates tax, subtotal, and total
     */
    public void calcs(){
        taxAmount = firstToyPrice * TAXRATE + secondToyPrice * TAXRATE;
        subtotal = firstToyPrice + secondToyPrice;
        totalBill = taxAmount + subtotal;

    }

    /**
     * returns a string that has the information about the purchase
     * @return
     */
    public String output(){
        String pattern =  "$###,###.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);
        String oTotal = moneyFormat.format(totalBill);
        String oTax = moneyFormat.format(taxAmount);
        return (firstToy + ": "  + firstToyPrice +
                "\n"+ secondToy + ": " + secondToyPrice +
                "\nSubtotal: " + subtotal +
                "\nTaxes: " + oTax +
                "\nTotal Price: " + oTotal);
    }

}
