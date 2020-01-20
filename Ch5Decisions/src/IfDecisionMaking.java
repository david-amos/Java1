/*
this is a class that demonstrates how to use the if statment in java
1/13/20
 */

public class IfDecisionMaking {
    public static void main(String args[]){
        int quizScore = 9;
        if (quizScore == 9){
            System.out.println("You earned a golden star!");
            System.out.println("Congratulations!!");
        }
        else{
            System.out.println("Better luck next time");
        }
        String month = "January";
        if (month.equals("January")){
            System.out.println("Winter has arrived.");
        }
        if(month.equals("January") || quizScore == 10){
            System.out.println("What a cold month for a good score");
        }
        if(month.equals("January") && quizScore == 10){
            System.out.println("What a cold month for a good score");
        }
    }
}
