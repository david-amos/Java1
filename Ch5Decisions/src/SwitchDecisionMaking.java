/*
example of case structure in java called switch.
can be used with char, integer, and String data types
1/14/20
 */

public class SwitchDecisionMaking {
    public static void main(String args[]){
        String startDate;
        startDate = "fa19";

        switch (startDate.toUpperCase()){
            case "SU19":
                System.out.println("Your graduation year is 2021");
                break;
            case "FA19":
                System.out.println("Your graduation year is 2021");
                break;
            case "FA18":
                System.out.println("Your graduation year is 2020");
                break;
            case "SP18":
                System.out.println("Your graduation year is 2019");
        }/*
        switch (startDate){
            case "SU19":

            case "FA19":
                System.out.println("Your graduation year is 2021");
                break;
            case "FA18":
                System.out.println("Your graduation year is 2020");
                break;
            case "SP18":
                System.out.println("Your graduation year is 2019");
        }
        char letterGrade = 'C';
        switch (letterGrade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'F':
                break;
            default:
                System.out.println("Invalid Grade");
        }*/
    }
}
