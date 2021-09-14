package CalcHistory;
import java.io.BufferedWriter;
import java.io.File;  
import java.io.FileWriter;
import java.io.IOException;



public class SaveCalcs {
    
    public static void logCalculations(String result){
        File f1 = new File("CalculationsHistory.txt");
        try {
            f1.createNewFile();
            BufferedWriter f1Writer = new BufferedWriter(new FileWriter(f1, true));
            f1Writer.write(result);
            f1Writer.newLine();
            f1Writer.close();
        } 
        catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("ERROR! Could not write the file!");
        }
    }
}
