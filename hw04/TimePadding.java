//Phebe de Guzman
//CSE2
//Professor Chen
//hw04-TimePadding

//write a program that has the user enter a positive integer giving 
//the number of seconds that have passed during the day
//then displays the time in conventional form 

//Sample Run
    //Enter the time in seconds: 3842
    //The time is 1:04:02

//import scanner
import java.util.Scanner;
    //establish a class
    public class TimePadding  {
        //main method required for every java program
        public static void main (String[] args) {
            
            //declare scanner
            Scanner myScanner;
            myScanner=new Scanner (System.in);
            
            //variables
            double hoursMinutes=0;
            int seconds=0;
            
            System.out.print("Enter the time in seconds: ");
            int nSeconds=myScanner.nextInt();
            
            //convert time to conventional format (00:00:00)
            hoursMinutes=nSeconds/60%60;
            seconds=nSeconds%60;
            
            
            
        }   //end of class
    }   //end of main method
            