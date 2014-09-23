//Phebe de Guzman
//CSE2
//Professor Chen
//hw04 -CourseNumber

//Write a program that readsa six digit number and then
//prints out the semester and year
    //first four digits = year
    //last two digits = semester
        //10 = spring
        //20 = summer 1
        //30 = summer 2
        //40 = fall 
        
//import scanner
import java.util.Scanner;
    //establish a class
    public class CourseNumber   {
        //main method required for every java program
        public static void main (String[] args) {
            
            //declare scanner
            Scanner myScanner;
            myScanner=new Scanner (System.in);
            
            //variables
            int semester=0;
            int academicYear=0;
            
            //prompt user to enter six digits course numbers
            System.out.print("Enter a six digit number giving the course semester");
            int courseNumber=myScanner.nextInt();
            
            semester=(courseNumber%100);
                //progam will figure out which semester is correct based off of the last two digits
                if (semester==10)
                    {
                    System.out.println("The course was offered in the spring semester ");
                    }
                else if (semester==20)
                    {
                    System.out.println("The course was offered in the summer 1 semester ");
                    }
                else if (semester==30)
                    {
                    System.out.println("The course was offered in the summer 2 semester ");
                    }
                else if (semester==40)
                    {
                    System.out.println("The course was offered in the fall semester ");
                    }
                else
                    {
                    System.out.println("Incorrect Input");
                    }
                
            academicYear=courseNumber/100; 
            
            System.out.print("of "+academicYear+".");

    
        }   //end of class
    }   //end of main method