package Operations;
import CalcHistory.SaveCalcs;

public class SciCalcs extends SaveCalcs{
    static double d1;
    static double result;
    
    public static double sqrt(double x){
        d1 = x;
        result = Math.sqrt(x);  
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was "+ d1 + " and the result of the " + getName + " operation was " + result);
        return result;
    }

    public static double logOf(int x){
        d1 = x;
        result = Math.log(d1);
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was "+ d1 + " and the result of the " + getName + " operation was " + result);
        return result;
    }

    public static double logn(int x){
        d1 = x;
        result = Math.log10(d1);
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was "+ d1 + " and the result of the " + getName + " operation was " + result);
        return result;
    }
    public static double Sin(double x){
        d1 = Math.toRadians(x);
        result = Math.sin(d1); 
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was "+ x + " and the result of the " + getName + " operation was " + result);
        return result; 
    }
    public static double iSin(double x){
        d1 = Math.toRadians(x);
        result = Math.asin(d1); 
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was "+ x + " and the result of the " + getName + " operation was " + result);
        return result;
    }
    public static double Cos(double x){
        d1 = Math.toRadians(x);
        result = Math.cos(d1); 
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was "+ x + " and the result of the " + getName + " operation was " + result);
        return result;
    }
    public static double iCos(double x){
        d1 = Math.toRadians(x);
        result = Math.acos(d1); 
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was "+ x + " and the result of the " + getName + " operation was " + result);
        return result;
    }
    public static double Tan(double x){
        d1 = Math.toRadians(x);
        result = Math.tan(d1); 
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was "+ x + " and the result of the " + getName + " operation was " + result);
        return result;
    }
    public static double iTan(double x){
        d1 = Math.toRadians(x);
        result = Math.atan(d1); 
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given was "+ x + " and the result of the " + getName + " operation was " + result);
        return result;
    }
}
