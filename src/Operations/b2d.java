package Operations;

import java.util.Scanner;

import CalcHistory.SaveCalcs;

public class b2d extends SaveCalcs {

    static String num;
    
    static int dec;

    public void b2dConvert() {
        
        System.out.println("Enter a binary number to be converted to decimal:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();
        dec = Integer.parseInt(num, 2);
        System.out.println("Your decimal number is : " + dec);
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was" + num + " and the result of the "
                + getName + " operation was " + dec);
    }
}
