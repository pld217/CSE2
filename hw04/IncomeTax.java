//Phebe de Guzman
//CSE2
//September 22, 2014
//hw04 -IncomeTax

//Write a program that prompts the user to enter an int that gives the thousands of dollars of income
//then writes out that amount of tax on the income
//given: the following progressive schedule
//<20 = 5%
//>=20 + <40 = 7%
//>=40 + <78 = 12%
//>=78 = 14%

//import scanner
import java.util.Scanner;
    //establish a class
    public class IncomeTax  {
        //main method required for every java program
        public static void main (String[] args) {
            
            //declare scanner
            Scanner myScanner;
            myScanner=new Scanner (System.in);
            
            //Variables
            double totalValue1=0;
            double totalValue2=0;
            double totalValue3=0;
            double totalValue4=0;
            
            //prompt user to enter an int to determine the number of thousands
            System.out.print("Enter an int giving the number of thousands: ");
            int nThousands=myScanner.nextInt();
            
            //create responses to all possible user inputs
                //if user enters the correct int the program will run normally
            
            //input must be an int
           
                //if user inputs a number less then 0 the program will print a error message and terminate
                //notify user of incompatible input
                if (nThousands<0) 
                    {
                    System.out.println( "You did not enter a positive int" );
                    //terminate program
                    return;
                    }
                //if user imputs a number less then 20
                //the program will print out the correct tax percentage of 5.0%    
                else if (nThousands<20)
                    {
                    totalValue1=((nThousands*1000)*0.05);
                    System.out.println("The tax rate on "+nThousands*1000+ " is 5.0%,");
                    System.out.println("and the tax is "+totalValue1+".");
                    }
                //if user imputs a number greater then 20 and less then 40 
                //the program will print out the correct tax percentage of 7.0%   
                else if ((nThousands>=20)||(nThousands<40))
                    {
                    totalValue2=((nThousands*1000)*0.07);
                    System.out.println("The tax rate on " +nThousands*1000+ " is 7.0%,");
                    System.out.println("and the tax is "+totalValue2+".");
                    }
                //if user imputs a number greater then 40 and less then 78
                //the program will print out the correct tax percentage of 12.0%    
                else if ((nThousands>=40)||(nThousands<78))
                    {
                    totalValue3=((nThousands*1000)*0.12);
                    System.out.println("The tax rate on " +nThousands*1000+ " is 12.0%,");
                    System.out.println("and the tax is "+totalValue3+".");
                    }
                //if user imputs a number greater then 78
                //the program will print out the correct tax percentage of 14.0%    
                else if(nThousands>=78)
                    {
                    totalValue4=((nThousands*1000)*0.14);
                    System.out.println("The tax rate on " +nThousands*1000+ " is 14.0%,");
                    System.out.println("and the tax is "+totalValue4+".");
                    }
                //if user does not input an int system will pring error message and terminate    
                else if(nThousands%10*10!=0)
                    {
                    System.out.println("You did not enter an int");
                    return;
                    }
                //if user does not enter an int program will print out error message and terminate    
                else
                    {
                    System.out.println("Invalid Input");
                    }
            
                
            
        }   //end of class
    }   //end of main method