import javax.swing.*;
import java.text.DecimalFormat;

public class KDRCalculator {
    public static int iKills, iDeaths;
    public static String iData;
    public static double cKDR;

    public static void main(String[] args){
        KDRSplashDisplay.displaySplash();
        input();
        calcs();
        output();
    }

    public static void input(){
        iData = JOptionPane.showInputDialog(null,"Enter Kills: ",
        "Kills Entry", 1);
        iKills = Integer.parseInt(iData);
        iData = JOptionPane.showInputDialog(null,"Enter Deaths: ",
                "Deaths Entry", 1);
        iDeaths = Integer.parseInt(iData);

    }
    public static void calcs(){
        if(iDeaths == 0) {
            iDeaths = 1;
        }
        cKDR = (double)iKills / iDeaths;
    }
    public static void output(){
        String pattern = "##.00";
        DecimalFormat df = new DecimalFormat(pattern);
        JOptionPane.showMessageDialog(null,"Your Kill Death Ratio is: " + df.format(cKDR));
    }
}
