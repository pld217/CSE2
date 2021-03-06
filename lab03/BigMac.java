//Phebe de Guzman
//CSE2
//September 12, 2014
//lab03- BigMac

//The goal of this program is to compute the cost of buying Big Macss then adding the percentage tax.

//import scanner class to avoid compilier errors 
import java.util.Scanner;
//establish a class
   public class BigMac  {
       //main method required for every java program
       public static void main (String[] args)  {
           
           Scanner myScanner;
           myScanner = new Scanner ( System.in );
           
           System.out.print("Enter the number of Big Macs(an integer > 0): ");
           
           int nBigMacs=myScanner.nextInt();
           
           System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");
           double bigMac$ = myScanner.nextDouble();
           System.out.print("Enter the percent tax as a whole number (xx): ");
           double taxRate = myScanner.nextDouble();
           taxRate/=100; 
           
           double cost$;
           int dollars, //whole dollar amount of cost
                dimes, pennies; //for storing digits
            cost$=nBigMacs*bigMac$*(1+taxRate);
            //get the whole amount dropping decimal fraction 
            dollars=(int)cost$;
            //get dimes amount
            //(int) (6.73*10) % 10 -> 67 %10 -> 7
            //  where the % (mod) operator returns the remainder
            //  after the division:   583%100 -> 83, 27%5 -> 2
            
            dimes=(int)(cost$*10)%10;
            pennies=(int)(cost$*100)%10;
            System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +" sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
            
       }    //end of class
   }    //end of main method