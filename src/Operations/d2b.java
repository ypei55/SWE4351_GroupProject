package Operations;

import java.util.Scanner;

import CalcHistory.SaveCalcs;

public class d2b extends SaveCalcs {
    
    static double num;
    
    static String bin;

    public void d2bConvert() {

        System.out.println("Enter a decimal number to be coverted to binary: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        bin = Integer.toBinaryString((int) (num));
        System.out.println("Your binary number is : " + bin);
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was " + num +
                " and the result of the " + getName + " operation was " + bin);
    }
}
