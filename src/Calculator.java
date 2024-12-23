import Inputs.*;
import Operations.*;

import java.io.IOException;
import java.util.Scanner;



public class Calculator {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        initiateCalculator();

    }

    public static void initiateCalculator(){
        int opr_choice = userOptions();
        chooseOperations(opr_choice);
    }

    public static int userOptions(){
        System.out.println("Welcome to the Scientific Calulator");
        System.out.println("Below are the list of operations ");
        System.out.println("1. Addition") ;
        System.out.println("2. Subtraction") ;
        System.out.println("3. Multiplication") ;
        System.out.println("4. Division") ;
        System.out.println("5. PowerOf") ;
        System.out.println("6. SquareRoot") ;
        System.out.println("7. nthRoot") ;
        System.out.println("8. Logarithmic value") ;
        System.out.println("9. Natural Log") ;
        System.out.println("10. Sine") ;
        System.out.println("11. Inverse Sine") ;
        System.out.println("12. Cosine") ;
        System.out.println("13. Inverse Cosine") ;
        System.out.println("14. Tangent") ;
        System.out.println("15. Inverse Tangent") ;
        System.out.println("16. Stor") ;
        System.out.println("17. recall") ;
        System.out.println("18. d2b (Decimal to Binary)") ;
        System.out.println("19. b2d (Binary to Decimal)") ;
        System.out.println("20. SIP") ;
        System.out.println("0. Exit");
        System.out.println("Please enter the operation you wish to perform  : ");
       
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public static void endCalculator(){
        System.out.println("Thank you for using the calculator!");
        System.exit(1);
    }
    

    public static void chooseOperations(int operation){
            try{
                if(operation == 1){
                    int[] var = MultiInput.UserInput();
                    System.out.println("The answer is : " + basicCalcs.Add(var[0], var[1]));
                }
                else if(operation == 2){
                    int[] var = MultiInput.UserInput();
                    System.out.println("The answer is : " + basicCalcs.Subtract(var[0], var[1]));
                }
                else if(operation == 3){
                    int[] var = MultiInput.UserInput();
                    System.out.println("The answer is : " + basicCalcs.Multiply(var[0], var[1]));
                }
                else if(operation == 4){
                    int[] var = MultiInput.UserInput();
                    System.out.println("The answer is : " + basicCalcs.Divide(var[0], var[1]));
                }
                else if(operation == 5){
                    int[] var = MultiInput.UserInput();
                    System.out.println("The answer is : " + basicCalcs.PowerOf(var[0], var[1]));
                }
                else if(operation == 6){
                    double d1 = SingleInput.UserInput();
                    System.out.println("The answer is : " + SciCalcs.sqrt(d1));
                }
                else if(operation == 7){
                    Nthroot nr = new Nthroot();
                    nr.nthRoot();
                }
                else if(operation ==8){
                    int var =  SingleInput.UserInput();
                    System.out.println("The answer is : " + SciCalcs.logOf(var));
                }
                else if(operation ==9){
                    int var =  SingleInput.UserInput();
                    System.out.println("The answer is : " + SciCalcs.logn(var)); 
                }
                else if(operation == 10){
                    double d1 = SingleInput.UserInput();
                    System.out.println("The answer is : " + SciCalcs.Sin(d1));  
                }
                else if(operation == 11){
                    double d1 =  SingleInput.UserInput();
                    System.out.println("The answer is : " + SciCalcs.iSin(d1));  
                }
                else if(operation == 12){
                    double d1 =  SingleInput.UserInput();
                    System.out.println("The answer is : " + SciCalcs.Cos(d1));   
                }
                else if(operation == 13){
                    double d1 =  SingleInput.UserInput();
                    System.out.println("The answer is : " + SciCalcs.iCos(d1));   
                }
                else if(operation == 14){
                    double d1 =  SingleInput.UserInput();
                    System.out.println("The answer is : " + SciCalcs.Tan(d1));  
                }
                else if(operation == 15){
                    double d1 =  SingleInput.UserInput();
                    System.out.println("The answer is : " + SciCalcs.iTan(d1));  
                }
                else if(operation == 16){
                    Storage num = new Storage();
                    num.store_num();
                }
                else if(operation == 17){
                    Storage num = new Storage();
                    try{
                        num.recall();
                    }
                    catch(IOException e){
                        System.out.println("Coud not read file");
                    }
                }
                else if(operation == 18){
                    d2b d1 = new d2b();
                    d1.d2bConvert();
                }
                else if(operation == 19){
                    b2d b1 = new b2d();
                    b1.b2dConvert();
                }
                else if(operation == 20){
                    SipCalc sipCalc = new SipCalc();
                    sipCalc.calculateSIP();
                }
                else if(operation == 0){
                    endCalculator();
                }
                else{
                    System.out.println("Invalid input! Please try again!");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input! Please enter a choice from 1 to 20");
            } 
            System.out.println("Please enter N to perform another calculation or anything else to quit");
            String key = sc.nextLine();
            if(key.equals("N")){
                initiateCalculator();
            }
            else{
                endCalculator();
            }
            
        }
    }


