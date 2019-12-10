package com.company;

public class Main {

    public static void main(String[] args) {
	    double sum, n1 = 3.5, n2 = 2.6;

	    sum = calcSumOfTwoNumbers(n1,n2);

	    printSum(sum);

	    double val = calcSum(4.3,6.2,'A');
    }

    /**
     * Calculate and return the sum of two value
     * @param num1
     * @param num2
     * @return
     */
    public static double calcSumOfTwoNumbers(double num1, double num2) {
        return num1 + num2;
    }
    public static void printSum(double s){
        System.out.print("The sum is " + s);
    }
    public static double calcSum(double num1, double num2, char op){
        if(op =='A'){
            return num1 + num2;
        }
        else
            if(op == 'S'){
                return num1 - num2;
            }
            else
                if(op == 'M'){
                    return num1 * num2;
                }
                else
                    return num1 / num2;
    }
}
