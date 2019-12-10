import javax.swing.*;
import java.text.*;

import static javax.swing.JOptionPane.*;

public class DecimalFormatTest
{
   public static void main(String[] args)
   {
      String pattern = "$###,###.00";
      String gpaPattern = "0.00";
      DecimalFormat moneyFormat = new DecimalFormat(pattern);
      DecimalFormat gpaFormat = new DecimalFormat(gpaPattern);
      String iData;
      Double iSalary;
      String oSalary;

      iData = JOptionPane.showInputDialog(null, "Enter your gpa:",
              "gpa Entry", 1);
      iSalary = Double.parseDouble(iData);

      oSalary = gpaFormat.format(iSalary);
      System.out.println("Your gpa is " + oSalary);
   }
}
