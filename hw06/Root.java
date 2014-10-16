//Phebe de Guzman
//CSE2
//Professor Chen
//Root.java hw06

//write a program that forces the user to enter a double that is greater then 0
//then uses to provided algorithm to compute the square root of the entered number and then prints it out
//use 0.0000001 as the "tolerance" for stopping the loop that computes the square root

//import scanner
import java.util.Scanner;
    //establish a class
    public class Root {
        //main method required for every java program
        public static void main (String[] args) {
            
    //declare a scanner    
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
    //prompt the user to enter a double
        System.out.println("Enter a double");
    //input is the user's entered double
        double input=myScanner.nextDouble();        
        
    //declare variables

        //declare low to equal 0 as stated in hw assignment 
        double low=0;
        //declare high to equal 1+input as stated in assignment
        double high=(1+input);
        //do the same for "middle"
        double middle=0;
        
        if (input<=0) {
            System.out.println("You did not enter a double greater then 0");
        }
        else {
        //calculations
            while ((high-low)>(0.0000001*(1+input))) {
                middle=(low+high)/2;
                if ((middle*middle)>input) {
                    high=middle;
                }
                else {
                    low=middle;
                }
            }
        //now print out the square root after all the calculations have occured
        //the last high will be the correct answer
        System.out.println("The square root is: "+high+" ");   
        
        }
        

 
            
        } //end of main method
    } //end of class