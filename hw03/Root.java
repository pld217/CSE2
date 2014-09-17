//Phebe de Guzman
//hw03
//Root.java
//Professor Chen

//Write a program that prompts the user to enter a double
    //then prints out a crude estimate of the cube root of the number
    //and the calue of this crude guess when cubed
    
import java.util.Scanner;
//import scanner 
    public class Root   {
    //establish a class
        public static void main (String[] args) {
        // main method required for every java program
        
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
            //intermediate data and input varibles
                double guess;
                double estimate1;
                double estimate2;
                double estimate3;
                double estimate4;
                double finalEstimate;
                double originalInput;
                
                //prompts user to input a double
                System.out.print("Enter a double, and I print its cube root: ");
                double x=myScanner.nextDouble();
        
        
                //Calculations
                    //first guess
                    estimate1=(x/3);
                    //second guess
                    estimate2=(estimate1*estimate1*estimate1+x)/(3*estimate1*estimate1);
                    estimate3=(2*estimate2*estimate2*estimate2+x)/(3*estimate2*estimate2);
                    estimate4=(2*estimate3*estimate3*estimate3+x)/(3*estimate3*estimate3);
                    originalInput=(estimate4*estimate4*estimate4);
        
                    //Print out the following
                    System.out.println("The cube root is "+estimate4+":" );
                    System.out.println(" "+estimate4+ "*" +estimate4+ "*" +estimate4+ "=" );
                    System.out.println(originalInput);
        
        
        
        
        }   //end of main method
    }    //end of class