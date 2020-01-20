import java.util.Scanner;

public class LongabergerProgram {
    /*
    David Amos 1/10/20
    Takes in information about buying a basket and outputs prices
     */
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String args[]){

        System.out.println("Would you like a standard(S) or custom(C) basket order?");
        char orderType = myScanner.nextLine().toUpperCase().charAt(0);
        if(orderType == 'C'){
            System.out.println("Enter Basket Type: (C, W, K, M, or U)");
            char basketType = myScanner.nextLine().toUpperCase().charAt(0);

            System.out.println("Enter Accessory: (A1, A2, A3, or A4)");
            String accessoryType = myScanner.nextLine();
            accessoryType = accessoryType.toUpperCase();

            System.out.println("Enter State Abbreviation: ");
            String state = myScanner.nextLine();
            state = state.toUpperCase();

            System.out.println("Enter Customer Type: (1, 2, or 3)");
            byte customer = Byte.parseByte(myScanner.nextLine());

            BasketBuild basket = new BasketBuild(state, accessoryType, basketType, customer);
            basket.calcs();
            System.out.println(basket.receipt());
        }
        else {
            BasketBuild basket = new BasketBuild();
            basket.calcs();
            System.out.println(basket.receipt());
        }
    }
}
