import java.text.DecimalFormat;

public class Beach {
    private String beachName;
    private int scQty, cdQty;
    private double scPrice, subtotal, tax, totalBill, cdPrice;
    private static final double TAXRATE = .055;

    public double getScPrice() {return scPrice; }
    public String getBeachName() {return beachName;}
    public int getScQty() {return scQty;}
    public int getCdQty() {return cdQty;}
    public double getCdPrice() {return cdPrice;}

    public void setBeachName(String Name) {
        beachName = Name;
    }

    public void setCdPrice(double Price) {
        cdPrice = Price;
    }

    public void setCdQty(int Qty) {
        cdQty = Qty;
    }

    public void setScPrice(double Price) {
        scPrice = Price;
    }

    public void setScQty(int Qty) {
        scQty = Qty;
    }

    /**
     * puts default values in case no values are given
     */
    public Beach(){
        beachName = "my beach";
        cdPrice = 1.99;
        cdQty = 2;
        scPrice = 1.99;
        scQty = 2;

    }

    /**
     * Calculates the bill from the given prices and quantities
     */
    public void calcs(){
        subtotal = cdPrice * cdQty + scPrice * scQty;
        tax = subtotal * TAXRATE;
        totalBill = tax + subtotal;
    }

    /**
     * returns everything calculated
     * @return
     */
    public String output(){
        String pattern =  "$###,###.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);
        String oScPrice = moneyFormat.format(scPrice);
        String oCdPrice = moneyFormat.format(cdPrice);
        String oTax = moneyFormat.format(tax);
        String oTotalBill = moneyFormat.format(totalBill);
        String oSubtotal = moneyFormat.format(subtotal);


        return ("Snow Cones: " + scQty +
                "\nSnow Cone Price: " + oScPrice +
                "\nCorn Dogs: " + cdQty +
                "\nCorn Dog Price: " + oCdPrice +
                "\nSubtotal: " + oSubtotal +
                "\nTaxes: " + oTax +
                "\nTotal Price: " + oTotalBill);
    }
}
