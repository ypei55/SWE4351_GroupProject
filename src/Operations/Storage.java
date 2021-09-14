package Operations;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import CalcHistory.SaveCalcs;

public class Storage extends SaveCalcs{
    File f1 = new File("Store.txt");
    public void store_num(){
        try {
            f1.createNewFile();
            BufferedWriter f1Writer = new BufferedWriter(new FileWriter(f1));
            System.out.println("Please enter the value to be stored : ");
            Scanner sc = new Scanner(System.in);
            int value = Integer.parseInt(sc.nextLine());
            f1Writer.write(Integer.toString(value));
            logCalculations("Your number " + value + " was successfully stored!");
            System.out.println("Your value is successfully stored!");
            f1Writer.close();
        } 
        catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("ERROR! Could not write the file!");
        }
    }

    public void recall() throws IOException{
        BufferedReader r = new BufferedReader(new FileReader(f1));
        String s = r.readLine();
        logCalculations("Your number " + s + " was successfully retrieved!");
        System.out.println("Your stored number is : " + s);

    }
}
