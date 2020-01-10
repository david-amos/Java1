import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class TestEmployee {
    public static void main(String[] args){
        Employee empOne = new Employee();
        String name, phone, birthYear, birthMonth, birthDay;
        LocalDate bDate;

        name = JOptionPane.showInputDialog(null, "enter your name: ");
        empOne.setEmpName(name);

        phone = JOptionPane.showInputDialog(null,"enter your phone number: ");
        empOne.setEmpPhone(phone);

        birthYear = JOptionPane.showInputDialog(null,"Enter your birth year: ");
        birthMonth = JOptionPane.showInputDialog(null,"Enter your birth Month: ");
        birthDay = JOptionPane.showInputDialog(null,"Enter your birth day: ");

        bDate = LocalDate.of(Integer.parseInt(birthYear), Integer.parseInt(birthMonth), Integer.parseInt(birthDay));
        empOne.setEmpBirthDate(bDate);

        LocalDate today = LocalDate.now();
        Period span = Period.between(empOne.getEmpBirthDate(),today);
        int age = span.getYears();


        System.out.println("Today is " + today.getDayOfWeek());
        System.out.println("Name: " + empOne.getEmpName() +
                "\nPhone: " + empOne.getEmpPhone() +
                "\nBirthdate: " + empOne.getEmpBirthDate() +
                "\nAge: " + age);
    }
}
