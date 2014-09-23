//Phebe de Guzman
//CSE2
//hw04 -Month.java

//write a program that prompts the user to enter an int for the month (1-12)
//then displays the number of days in that month
//if the number is 2 (February) the user is then asked to enter a year

//start by importing scanner
import java.util.Scanner;
    //establish a class
    public class Month  {
        //main method required for every java program
        public static void main (String[] args) {
            
            //declare scanner
            Scanner myScanner;
            myScanner=new Scanner (System.in);
            
            //variables
            int nYear=0;
            
            //prompts user to enter the number of a month
            System.out.print("Enter an int giving the number of the month (1-12): ");
            int nMonth=myScanner.hasNextInt();
            
            //input must be an int
            if (myScanner.hasNextInt()) 
            {
                //if user enters months 1, 3, 5, 7, 8, 10, or 12, then the month has 31 days
                if ((nMonth==1)||(nMonth==3)||(nMonth==5)||(nMonth==7)||(nMonth==8)||(nMonth==0)||(nMonth==12))
                    {
                    System.out.println("The month has 31 days");
                    }
                //if the user enters months 4, 6, 9, or 11, then the month has 30 days
                else if ((nMonth==4)||(nMonth==6)||(nMonth==9)||(nMonth==11))
                    {
                    System.out.println("The month has 30 days");
                    }
                //if user enters 2 for the month they will be prompted to enter a year
                else if (nMonth==2)
                    {
                    System.out.print("Enter an int giving the year");
                    int nYear=myScanner.hasNextInt();
                    }
                else if ((nMonth>12)||(nMonth<1))
                    {
                    System.out.println("You did not enter an int between 1 and 12");
                    }
                else
                    {
                    System.out.println("Incorrect Input");
                    }
                
            }
                    //in order to determine whether or not the user's inputed year is infact a leap year
                    //we look to the Gregorian calendar's 3 criteria
                        //1. the year must be divisible by 4
                        //2. if the year is divisible by 100 it is not a leap year 
                        //3. unless it is also divisible by 400
                    //below are the calculations to determine whether or not it is infact a leap year
                    
                    boolean leapYear=(nYear%4==0 && nYear%100!=0)||(nYear%400==0);
                        
                if (leapYear) 
                    {
                    System.out.println("The month has 29 days");
                    }
                else if (leapYear=false)
                    {
                    System.out.println("The month has 28 days");   
                    } 
                else
                    {
                    System.out.println("Invalid Input");
                    }
            
            
            }//end of class
        }//end of main method
            
           
            
            
                    


