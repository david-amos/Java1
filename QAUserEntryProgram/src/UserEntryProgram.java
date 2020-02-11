import java.util.Scanner;

public class UserEntryProgram {
    public static UserInfo user;
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to my program!");
        boolean go = true;
        while(go){
            System.out.println("Enter 1 to create new user. Enter 3 to exit the program");
            String menuEntry = s.nextLine();
            switch(menuEntry){
                case "1":
                    String id = newUserID();
                    String pass = newUserPassword();
                    user = new UserInfo(id,pass);
                    output();
                    break;
                case "3":
                    go = false;
                    break;
                default:
                    System.out.println("Invalid Entry. Must enter 1 or 3. Press enter to try again.");
                    s.nextLine();
                    break;
            }
        }
        System.out.println("Thank you for using this program. Press Enter to exit");
        s.nextLine();
    }

    public static String newUserID(){
        boolean invalidId = true;
        String id = "";
        while(invalidId){
            System.out.println("Enter new User ID. (Must have 6-10 letters followed by 2 numbers.)");
            id = s.nextLine();
            if (!id.matches(".*[0-9]{2}")) {
                System.out.println("Username must end with 2 numbers. Press enter to continue");
                s.nextLine();
            }
            else
            if (id.length() >= 8 && id.length() <= 12) {
                if ((!validId(id))) {
                    System.out.println("Must start with 6-10 letters only. No Spaces, tabs, or special characters are allowed. Press enter to continue");
                    s.nextLine();
                }
                else{
                    System.out.println("Valid userName. Press Enter to continue");
                    invalidId = false;
                    s.nextLine();
                }
            }
            else
            if (id.length() < 8) {
                System.out.println("Must have at least 6 letters and 2 numbers. Press enter to continue");
                s.nextLine();
            }
            else {
                System.out.println("Cannot have more than 10 letters. Press enter to continue");
                s.nextLine();
            }
            }
        return id;
        }
    public static String newUserPassword(){
        boolean invalidPass = true;
        String pass ="";

        while(invalidPass) {
            System.out.println("Enter new password must contain 6-12 characters, at least 1 number, 1 Uppercase letter, and 1 lowercase letter.");
            pass = s.nextLine();
            if (pass.length() < 6 || pass.length() > 12){
                System.out.println("Password must have 6 to 12 characters. Press enter to continue.");
                s.nextLine();
            }
            else{
                if(!pass.matches(".*[0-9].*")){
                    System.out.println("Password must contain a number. Press enter to continue");
                    s.nextLine();
                }
                else{
                    if(!pass.matches(".*[a-z].*")) {
                        System.out.println("Password must contain a lowercase letter. Press enter to continue");
                        s.nextLine();
                    }
                    else{
                        if(!pass.matches(".*[A-Z].*")){
                            System.out.println("Password must contain an uppercase letter. Press enter to continue");
                            s.nextLine();
                        }
                        else{
                            if(!pass.matches("[a-zA-Z0-9]{6,12}")){
                                System.out.println("Password cannot contain spaces, tabs, or special characters. Press enter to continue.");
                                s.nextLine();
                            }
                            else{
                                System.out.println("Password valid. Press enter to continue.");
                                s.nextLine();
                                invalidPass = false;
                            }
                        }
                    }
                }
            }
        }
        return pass;
    }
    public static boolean validId(String id){
        return id.matches("[a-zA-Z]{6,10}[0-9]{2}");
    }
    public static void output(){
        System.out.println("Username and Password entered are valid" +
                            "\nUsername: " + user.getUserId() +
                            "\nPassword: " + user.getUserPassword() +
                            "\nPress enter to continue to menu.");
        s.nextLine();
    }
    }

