package Operations;

import CalcHistory.SaveCalcs;

public class basicCalcs extends SaveCalcs {
    
    static int x;
    
    static int y;
    
    static int result;

    public static int Add(int x, int y) {
        
        result = Math.addExact(x, y);
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given were " + x + " , " + y +
                " and the result of the " + getName + " operation was " + result);
        return result;
    }

    public static int Subtract(int x, int y) {
        
        result = Math.subtractExact(x, y);
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given were " + x + " , " + y +
                " and the result of the " + getName + " operation was " + result);
        return result;
    }

    public static int Multiply(int x, int y) {
        
        result = Math.multiplyExact(x, y);
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given were " + x + " , " + y +
                " and the result of the " + getName + " operation was " + result);
        return result;
    }

    public static int Divide(int x, int y) {
        
        result = Math.floorDiv(x, y);
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given were " + x + " , " + y +
                " and the result of the " + getName + " operation was " + result);
        return result;
    }

    public static double PowerOf(int x, int y) {
       
        double d1 = x;
        double d2 = y;
        double result = Math.pow(d1, d2);
        String getName = new Throwable().getStackTrace()[0].getMethodName();
        logCalculations("The input given were " + x + " , " + y +
                " and the result of the " + getName + " operation was " + result);
        return result;
    }
}
