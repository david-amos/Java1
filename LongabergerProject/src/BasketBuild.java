import java.lang.invoke.SwitchPoint;
import java.text.DecimalFormat;
import java.time.LocalDate;
/*
Instantiatable class that includes default values
has methods to get and set variables
has method to calculate prices for default or custom baskets
has method which returns a receipt of the basket.
 */
public class BasketBuild {

    private String iState, iAccType, oBasketType, oCustomerType;
    private char iBasketType;
    private byte iCustomerType;
    private double subtotal = 0, discount = 0, salesTax = 0, basketAmount = 0, totalBill;
    /**
     * Default Values
     */
    public BasketBuild(){
        iBasketType = 'U';
        iCustomerType = 1;
        iState = "IA";
        iAccType = "A4";
    }

    /**
     * construct for the BasketBuild Instantiable Class
     * @param state
     * @param acc
     * @param basket
     * @param customer
     */
    public BasketBuild(String state, String acc, char basket, byte customer){
        iState = state;
        iAccType = acc;
        iBasketType = basket;
        iCustomerType = customer;
    }
    public char getiBasketType() {
        return iBasketType;
    }

    public byte getiCustomerType() {
        return iCustomerType;
    }

    public String getiAccType() {
        return iAccType;
    }

    public String getiState() {
        return iState;
    }

    public void setiAccType(String AccType) {
        iAccType = AccType;
    }
    public void setiBasketType(char baskType){iBasketType = baskType;}
    public void setiCustomerType(byte customerType){iCustomerType = customerType;}
    public void setiState(String state){iState = state;}

    /**
     * Calculates subtotal, taxes, discounts, and the totalBill
     */
    public void calcs(){

        switch (iBasketType){
            case 'C':
                basketAmount += 15.00;
                oBasketType = "Cracker";
                break;
            case 'W':
                basketAmount += 53.25;
                oBasketType = "Wildflower";
                break;
            case 'K':
                basketAmount += 23.15;
                oBasketType = "Key";
                break;
            case 'M':
                basketAmount += 34.2;
                oBasketType = "Magazine";
                break;
            default:
                basketAmount += 112.77;
                oBasketType = "Umbrella";
                break;

        }
        switch (iAccType){
            case "A1":
                basketAmount += 4.75;
                iAccType = "Protector";
                break;
            case "A2":
                basketAmount += 8;
                iAccType = "Liner";
                break;
            case "A3":
                basketAmount += 10.55;
                iAccType = "Combo";
                break;
            default:
                iAccType = "None";
                break;
        }

        if (iCustomerType == 3){
            oCustomerType = "Bus";
            discount = basketAmount * .1;
        }
        else
            if (iCustomerType == 2){
                oCustomerType = "Walk-in";
            }
            else{
                oCustomerType = "Dealer";
                discount = basketAmount * .5;
            }

        subtotal = basketAmount - discount;
        if (!oCustomerType .equals("Dealer")){
            if( iState .equals("IL")){
                salesTax = subtotal * .0625;
            }
            else{
                if(iState .equals("MO")){
                    salesTax = subtotal * .04225;
                }
                else{
                    salesTax = subtotal * .06;
                    iState = "IA";
                }
            }
        }
        totalBill = subtotal + salesTax;
        }



    /**
     * returns a string of the receipt for the basket
     * @return
     */
    public String receipt(){
        String pattern =  "$###,###.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);
        String oSubtotal = moneyFormat.format(subtotal);
        String oSalesTax = moneyFormat.format(salesTax);
        String oTotalBill = moneyFormat.format(totalBill);
        String oDiscount = moneyFormat.format(discount);
        String oBasketAmount = moneyFormat.format(basketAmount);

        LocalDate today = LocalDate.now();

        return  "Today's Date: " + today +
                "\nBasket Type: " + oBasketType +
                "\nAccessory Type: " + iAccType +
                "\nCustomer Type: " + oCustomerType +
                "\nState: " + iState +
                "\nBasket Amount: " + oBasketAmount +
                "\nDiscount: " + oDiscount +
                "\nSubtotal: " + oSubtotal +
                "\nSales Tax: " + oSalesTax +
                "\nTotal Bill: " + oTotalBill;
    }
}
