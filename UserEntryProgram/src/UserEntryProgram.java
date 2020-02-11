import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserEntryProgram {
    public static UserInfo user;
    public static Scanner s = new Scanner(System.in);
    static PrintWriter pw;
    static Scanner userScanner;
    public static void main(String[] args) {


        try{
            pw = new PrintWriter(new File("users.dat"));
        }catch (FileNotFoundException e){
            System.out.println("Output file error");
        }
        try{
            userScanner = new Scanner(new File("users.dat"));
        }
        catch (FileNotFoundException e1){
            System.out.println("File error");
            System.exit(1); // end the program
        }
        System.out.println("Welcome to my program!");
        boolean go = true;
        while(go){
            System.out.println("Enter 1 to create new user. Enter 2 to display all users. Enter 3 to exit the program");
            String menuEntry = s.nextLine();
            switch(menuEntry){
                case "1":
                    String id = newUserID();
                    String pass = newUserPassword();
                    int status = newUserStatus();
                    char program = newUserProgram();

                    user = new UserInfo(id,pass,status,program);
                    output();
                    break;
                case "2":
                    String userName = " ", userPass = " ";
                    int userStatus = 0;
                    char userProg = 'B';
                    boolean eof = false;
                    int i;
                    if(userScanner.hasNext()){
                        String record = userScanner.nextLine();
                        userName = record.substring(0,12);
                        userPass = record.substring(12,24);
                        userStatus = Integer.parseInt(record.substring(24,25));
                        userProg = record.charAt(26);
                    }
                    else{
                        eof = true;
                    }
                    while(!eof){
                        char[] validProgs = {'B','L','N','P','R','S'};
                        String[] progNames = {"Business","Lasers","Networking","Programming","Robotics","Social Media"};
                        String[] statusNames = {"Commuter no meal plan","Commuter with meal plan","Dorm"};
                        for(i = 0;i<6;i++){
                            if(userProg == validProgs[i]){
                                break;
                            }
                        }
                        String oProg = progNames[i];
                        String oStatus = statusNames[userStatus-1];
                        System.out.println(userName +" " + userPass + " " + oProg + " " + oStatus);
                        s.nextLine();
                        if(userScanner.hasNext()){
                            String record = userScanner.nextLine();
                            userName = record.substring(0,12);
                            userPass = record.substring(12,24);
                            userStatus = Integer.parseInt(record.substring(24,25));
                            userProg = record.charAt(26);
                        }
                        else{
                            eof = true;
                        }

                    }

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
        pw.close();
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
                if ((!id.matches("[a-zA-Z]{6,10}[0-9]{2}"))) {
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
    public static int newUserStatus(){
        int status;
        do{
            try{
                System.out.println("Enter user status 1-3.");
                status = Integer.parseInt(s.nextLine());
                if(status > 3 || status < 1){
                    System.out.println("User status must be 1-3.");
                }
            }
            catch(Exception e){
                System.out.println("User status must be 1-3.");
                status = 0;
            }
        }while(status > 3 || status < 1);
        return status;
    }
    public static char newUserProgram(){
        char prog = '0';
        String iString;
        char[] validProgs = {'B','L','N','P','R','S'};
        boolean validProg = false;
        do{
            System.out.println("Enter program code");
            iString = s.nextLine();
            if(iString.length() == 1){
                prog = iString.toUpperCase().charAt(0);
                for(int num = 0;num < 6;num++){
                    if (prog == validProgs[num]){
                        validProg = true;
                        break;
                    }
                }

            }
            if(!validProg){
                System.out.println("Invalid program code, enter again");
            }
        }while(!validProg);
        return prog;
    }
    public static void output(){
        String[] statusNames = {"Commuter no meal plan","Commuter with meal plan","Dorm"};
        System.out.println("User successfully added");
        String record = String.format("%-12s%-12s%01d%1s",user.getUserId(),user.getUserPassword(),user.getUserStatus(),
                user.getUserProgram());
        pw.println(record);
    }
    }

