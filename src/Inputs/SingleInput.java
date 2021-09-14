package Inputs;
import java.util.Scanner;

public class SingleInput {
    private int x=0;
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
       this.x = x;
    }

    public static int UserInput(){
        SingleInput input = new SingleInput();
        Scanner sc = new Scanner(System.in);
        boolean isInt = false;
        while(!isInt){
            System.out.println("Please enter the value : ");
            try{
                input.setX(Integer.parseInt(sc.nextLine())); 
                isInt = true;
            }
            catch(NumberFormatException e){
                System.out.println("please enter an integer");
                continue;
            }   
        }
        int variable = input.getX();

        return variable;
    }
}
