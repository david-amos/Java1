import java.util.Scanner;

public class UserInterfaceProgram {
    public static void main(String[] args){
        System.out.println("Welcome to my awesome Ya Yeet program");
        Scanner s = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("\t1 to Print Ya Yeet.");
            System.out.println("\t2 to Print Seymore.");
            System.out.println("\tE to Exit.");
            String screenOne = s.nextLine();
            switch (screenOne.toUpperCase()){
                case "1":
                    boolean valid = false;
                    int num = 0;
                    while(!valid) {

                        try {
                            System.out.println("Enter a number");
                            num = Integer.parseInt(s.nextLine());
                            valid = true;

                        } catch (Exception e) {
                            System.out.println("Must enter a whole number, press enter to continue");
                            valid = false;
                            s.nextLine();
                        }
                    }
                    while (num > 0) {
                        System.out.println("Ya Yeet");
                        num--;
                    }
                    System.out.println("Press enter to continue");
                    s.nextLine();

                    break;
                case "2":
                    boolean valid2 = false;
                    int num2 = 0;
                    while(!valid2) {

                        try {
                            System.out.println("Enter a number");
                            num2 = Integer.parseInt(s.nextLine());
                            valid2 = true;

                        } catch (Exception e) {
                            System.out.println("Must enter a whole number, press enter to continue");
                            valid2 = false;
                            s.nextLine();
                        }
                    }
                    while (num2 > 0) {
                        System.out.println("Seymore");
                        num2--;
                    }
                    System.out.println("Press enter to continue");
                    s.nextLine();

                    break;
                case "E":
                    System.out.println("You are exiting your program, press enter to continue");
                    s.nextLine();
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid entry, press enter to try again");
                    s.nextLine();

            }

        }
    }
}
