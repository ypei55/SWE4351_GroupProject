package Operations;

import java.util.Scanner;

import java.lang.Math;

import CalcHistory.SaveCalcs;

public class SipCalc extends SaveCalcs {
    
    private static Integer principleAmt;
    
    private static Integer InvestDuration;
    
    private static Double returnRate;
    
    private static double future_value;
    
    double roundedresult;

    public void calculateSIP() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the principle amount:");
        principleAmt = sc.nextInt();
        System.out.println("Please enter the " +
                "duration of investment in months:");
        InvestDuration = sc.nextInt();
        System.out.println("Please enter the expected rate" +
                " of return in percentage:");
        returnRate = sc.nextDouble();
        double i = (returnRate / 100) / 12;
        double amount = principleAmt * (Math.pow(
                1 + i, InvestDuration) - 1) * (1 + i);
        future_value = amount / i;
        roundedresult = Math.round(future_value * 100.0) / 100.0;
        System.out.println("Your matured amount after a period of "
                + InvestDuration + " months will be Rs. " + roundedresult);
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("Your inputs were Rs " + principleAmt + " for " +
                InvestDuration + " years with a rate of return of " +
                (returnRate * 100) + " % and the result of the " +
                getName + " operation was Rs. " + future_value);
    }
}
