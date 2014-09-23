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
            int finalSeconds=0;
            int finalMinutes=0;
            int finalHours=0;

            //prompt user to enter the time in seconds
            System.out.print("Enter the time in seconds: ");
            int initialSeconds=myScanner.nextInt();
            
            //convert time to conventional format (00:00:00)
            finalSeconds=initialSeconds%60;
            finalMinutes=initialSeconds/60%60;
            finalHours=initialSeconds/3600;
            
            if (initialSeconds*10%10!=0)
                {
                System.out.println("You did not enter an int");
                }
            else if (initialSeconds<0||initialSeconds>86400)
                {
                System.out.println("Invalid input (must be an int greater then 0 and less then 86400");
                }
            else if (finalHours<10)
                {
                System.out.println("The time is "+finalHours+":0"+finalMinutes+":"+finalSeconds+".");
                }
            else if (finalMinutes<10)
                {
                System.out.println("The time is "+finalHours+":0"+finalMinutes+":"+finalSeconds+".");
                }
            else if (finalSeconds<10)
                {
                System.out.println("The time is "+finalHours+":"+finalMinutes+":0"+finalSeconds+".");
                }
            
            
            
            
        }   //end of class
    }   //end of main method
            