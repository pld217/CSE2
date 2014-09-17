//Phebe de Guzman
//CSE2
//Professor Chen
//hw03 -FourDigits.java

//Write a program that prompts the user to enter a double
//then print the first four digits to the right of the decimal point

import java.util.Scanner;
//import scanner to avoid compiler errors
    public class FourDigits {
    //establish a class
        public static void main (String[] args) {
        //main method required for every Java program
        
            Scanner myScanner;
            myScanner=new Scanner (System.in);
        
                //Prompts user to enter a double for input 1
                System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
                double input1=myScanner.nextDouble();
            
                    //Calculations for user input 1
                    int noDecimal=(int)(input1*10000);
                        //multiply by 10,000 in order to get rid of the decimal in the first user input
                    int noDecimal1=(int)(noDecimal%10000);
                    System.out.println("The four digits are "+noDecimal1);
            
                //Prompts user to enter a double for input 2
                System.out.println("Enter a double and I display the four digits to the right of the decimal point: ");
                double input2=myScanner.nextDouble();
            
                    //Calculations for input 2
                    int noDecimal2=(int)(input2*10000);
                            //rid the second input of the decimal as well but in order to do so we need to round down instead of up 
                    int digit1=(int)(noDecimal2%1);
                    int digit2=(int)(noDecimal2%1000)/100;
                    int digit3=(int)(noDecimal2%100)/10;
                    int digit4=(int)(noDecimal2%10)/1;
                System.out.println("The four digits are " +digit1+digit2+digit3+digit4);
            

        
        }   //end of main method
    }   //end of class