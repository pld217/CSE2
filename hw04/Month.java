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
            int nDays=0;
            
            boolean myBoolean;
            

            //prompts user to enter the number of a month
            System.out.print("Enter an int giving the number of the month (1-12): ");
            int nMonth=myScanner.nextInt();


                //if user enters months 1, 3, 5, 7, 8, 10, or 12, then the month has 31 days
                if (nMonth==1)
                    {
                    System.out.println("The month has 31 days");
                    }
                else if (nMonth==3)
                    {
                    System.out.println("The month has 31 days");
                    }
                else if (nMonth==5)
                    {
                    System.out.println("The month has 31 days");
                    }
                else if (nMonth==7)
                    {
                    System.out.println("The month has 31 days");
                    }
                else if (nMonth==8)
                    {
                    System.out.println("The month has 31 days");
                    }
                else if (nMonth==10)
                    {
                    System.out.println("The month has 31 days");
                    }
                else if (nMonth==12)
                    {
                    System.out.println("The month has 31 days");
                    }
                //if the user enters months 4, 6, 9, or 11, then the month has 30 days
                else if (nMonth==4)
                    {
                    System.out.println("The month has 30 days");
                    }
                else if (nMonth==6)
                    {
                    System.out.println("The month has 30 days");
                    }
                else if (nMonth==9)
                    {
                    System.out.println("The month has 30 days");
                    }
                else if (nMonth==11)
                    {
                    System.out.println("The month has 30 days");
                    }
                //if user enters 2 for the month they will be prompted to enter a year
                else if (nMonth==2)
                    {
                    System.out.print("Enter an int giving the year");
                    int nYear=myScanner.nextInt();
                    //in order to determine whether or not the user's inputed year is infact a leap year
                    //we look to the Gregorian calendar's 3 criteria
                        //1. the year must be divisible by 4
                        //2. if the year is divisible by 100 it is not a leap year 
                        //3. unless it is also divisible by 400
                            //below are the calculations to determine whether or not it is infact a leap year    
                        boolean leapYear=false;
                    if ((nYear % 400 == 0) || ((nYear % 4 == 0) && (nYear % 100 != 0)))
                        {
                        System.out.print("The Month has 29 days ");
                        }
                    else if (nYear<0)
                        {
                        System.out.print("You did not input a positive int");
                        }
                //if user does not enter a year greater than one
                else if (nMonth<1)
                    {
                    System.out.println("You did not enter an int greater than one");
                    }
                //if the user does not enter a year less than 12    
                else if (nMonth>12)
                    {
                    System.out.println("You did not enter an int less than twelve");
                    }
                else
                    {
                    System.out.println("Invalid Input");
                    }
            }  //end of first if statements
            } }
    
            
           
            
            
                    


