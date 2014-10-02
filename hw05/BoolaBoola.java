//Phebe de Guzman
//CSE2
//Professor Chen
//hw05 -BoolaBoola.java

//write a program that has three boolean variables to each of which the value of true or false is randomly assigned
//then at random combine the three variables with random choices of && and || and store the results
//the program should then present the expression to the user and ask the user to state the result of the expression

//import a scanner
import java.util.Scanner;
    //establish a class
    public class BoolaBoola {
        //main method required for every java program
        public static void main (String[] args) {

        //random variables
        boolean random1;
        String random2;
        boolean random3;
        String random4;
        boolean random5;
        
        // answers
        boolean answer1;
        boolean answer2;
        
        //first random true/ false statement
        if (Math.random() > 0.5)    
            {
            random1=true;
            }
        else
            {
            random1=false;
            }
        //second random true/false statement    
        if(Math.random() > 0.5)
            {
            random3=true;
            }
        else 
            {
            random3=false;
            }
        //1st boolean logical operator 
        if (Math.random() > 0.5)
            {
            random2="&&";
            answer1=random1&&random3;
            }
        else
            {
            random2="||";
            answer1=random1||random3;
            }
        //3rd random true/false statement 
        if(Math.random()>0.5)
            {
            random5=true;
            }
        else 
            {
            random5=false;
            }
        //2nd boolean logical opperator
        if(Math.random()>0.5)
            {
            random4="&&";
            answer2=answer1&&random5;
            }
        else 
            {
            random4="||";
            answer2=answer1||random5;
            }     

        //import a scanner
        Scanner myScanner=new Scanner(System.in);
        
        //print out the randomly genorated boolean expression
        System.out.println("Does "+random1+" "+random2+" "+random3+" "+random4+" "+random5+" have the value true (t/T) or false (f/F)");
        //input must be a string
        String answer=myScanner.next();
        
        boolean userInput=false;
        
        //user answer should match the correct answer calculated by java
        if(answer.equals("F")||(answer.equals("f")))
            {
            userInput=false;
            }
        else if(answer.equals("T")||(answer.equals("t")))
            {
            userInput=true;
            }
        if(userInput=answer2)
            {
            System.out.print("Correct");
            }
        else
            {
            System.out.println("Wrong, try again");
            }
            

            

        } //end of main method
    } //end of class
