import javax.swing.*;

public class Cellphoneservice {
    public static void main(String args[]) {
    int minutes, textSent;
    double gigabytes;

    minutes = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter minutes needed: "));
    textSent=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter texts needed."));
    gigabytes=Double.parseDouble(JOptionPane.showInputDialog(null, "enter gigabytes needed"));
    if(minutes < 500 && textSent == 0 && gigabytes == 0){
        System.out.println("We recommend Plan A for $49 a month. ");
    }
    else{
        if(minutes < 500 && textSent > 0 && gigabytes == 0){
            System.out.println("We recommend Plan B at $55 a month");

        }
        else {
            if (minutes >= 500 && gigabytes == 0 && textSent <= 100) {
                System.out.println("We recommend Plan C for 100 text messages at $61 a month");
            }
            else {
                if (textSent > 100 && gigabytes == 0)
                System.out.println("we recommend Plan D for 100 text messages or more at $70 per month");
                else {
                    if (gigabytes > 0 && gigabytes < 3) {
                        System.out.println("We recommend Plan E for up to 3 gigabytes per month for $79 per month");
                    } else {
                        System.out.println("we recommend Plan F for more than 3 GB for $87");
                    }
                }
            }
        }
    }
    }

}

