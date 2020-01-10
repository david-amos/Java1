//This class prompts the user for the child's first name, last name, name of the first toy, price of the first toy
// name of the second toy, and price of the first toy in this order

import java.util.Scanner;

public class SantasHelper {
    static Scanner Christmas = new Scanner(System.in);


    public static void main(String[] args){

        Toy myToy= new Toy();

        input(myToy);

        myToy.calcs();

        System.out.println(myToy.output());

    }



    private static void input(Toy myToy) {
        String iFirst, iLast, iGIJOE, iLego;
        Double iGIPrice, iLegoPrice;


        System.out.println("Enter the first name");
        iFirst = Christmas.nextLine();
        myToy.setFirstName(iFirst);

        System.out.println("Enter the last name");
        iLast = Christmas.nextLine();
        myToy.setLastName(iLast);

        System.out.println("Enter the first toy");
        iGIJOE = Christmas.nextLine();
        myToy.setFirstToy(iGIJOE);

        System.out.println("Enter the first toy price");
        String iInput = Christmas.nextLine();
        iGIPrice = Double.parseDouble(iInput);
        myToy.setFirstToyPrice(iGIPrice);

        System.out.println("Enter the second toy");
        iLego = Christmas.nextLine();
        myToy.setSecondToy(iLego);

        System.out.println("Enter the second toy price");
        iLegoPrice = Christmas.nextDouble();
        myToy.setSecondToyPrice(iLegoPrice);

    }

}