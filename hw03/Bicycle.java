//Phebe de Guzman
//hw03
//Bicycle.java
//Professor Chen

//Write a program that prompts the user to enter two digits
    //the first giving the number of counts on a cyclometer
    //the second giving the number of seconds during which the counts occured
//then prints out
    //the distance traveled
    //the average miles per hour 
    
import java.util.Scanner;
    //import scanner to avoid compiler errors
        public class Bicycle {
        //establish a class
            public static void main (String[] args)  {
            //main method required for every Java program
            
            Scanner myScanner;
            myScanner=new Scanner (System.in);
        
                //intermediate variables and output data
                double distanceInches; 
                double distanceMiles;
                double totalMinutes;
                double averageMPH;
                double wheelDiameter=27.0; //given wheel diameter
                double PI=3.14159; //value of pi
                int feetPerMile=5280; //number of feet in 1 mile
                int inchesPerFoot=12; //number of inches in 1 foot
                int secondsPerMinute=60; //number of seconds in 1 minute
                int minutesPerHour=60;  //number of minutes in 1 hour
                double input; 
        
                    //user inputs number of counts on a cyclometer
                    System.out.print("Enter the number of counts on a cyclometer (an integer > 0): ");
                    int cyclometer=myScanner.nextInt();
                    //user inputs the seconds
                    System.out.print("Enter the number of seconds during which the counts on the cyclometer occured (an integer >0): ");
                    int seconds=myScanner.nextInt();
                    
        
                        //calculations
                        distanceInches=((int)cyclometer)*wheelDiameter*PI;
                            //distance in inches based off user input
                        distanceMiles=(distanceInches/inchesPerFoot/feetPerMile);
                            //distance in miles based off user input
                        totalMinutes=((int)seconds)/secondsPerMinute;
                            //total time in minutes based off of user input
                        averageMPH=(distanceMiles/(totalMinutes/minutesPerHour));
                            //total miles per hour based off of user input data
        
                        //Print the data accordingly
                        System.out.println("The distance was "+distanceMiles+" miles and took "+totalMinutes+" minutes");
                        System.out.println("The average miles per hour was "+averageMPH+ " ");
        
        
    
    }   //end of main method
}   //end of class