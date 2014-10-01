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
    
        //declare a scanner
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        //random variables
        boolean randomBool1=0;
        String randomOperator2=0;
        boolean randomBool3=0;
        String randomOperator4=0;
        boolean randomBool5=0;
        
        // answers
        boolean 1stAnswer=0;
        boolean 2ndAnswer=0;
        
    
        //first random true/ false statement
        if(Math.random() > 0.5)
        {
            randomBool1=true;
        }
        else
        {
            randomBool1=false;
        }
        
        //1st boolean logical operator 
        if(Math.random() > 0.5)
        {
            randomOperator2="&&";
            1stAnswer=randomBool1&&randomBool3
        }
        else
        {
            randomOperator2="||";
            1stAnswer=randomBool1||randomBool3;
        }

        //second random true/false statement    
        if(Math.random() > 0.5)
        {
            randomBool3=true;
        }
        else 
        {
            randomBool3=false;
        }
            
        //2nd boolean logical opperator
        if(Math.random()>0.5)
        {
            randomOperator4="&&";
            2ndAnswer=1stAnswer&&randomBool5;
        }
        else 
        {
            randomOperator4="||";
            2ndAnswer = 1stAnswer || randomBool5;
        }     
        
        //3rd random true/false statement 
        if(Math.random()>0.5)
        {
            randomBool5=true;
        }
        else 
        {
            randomBool5=false;
        }
        
        
        //print out the randomly genorated boolean expression
        System.out.println("Does "+randomBool1+" "+randomOperator2+" "+randomBool3+" "+randomOperator4+" "+randomBool5+" have the value trie(t/T) or false(f/F)");
        //input must be a string
        String answer=myScanner.next();
        
        boolean userInput=false;
        
        //user answer should match the correct answer calculated by java
        if((answer.equals("F"))||(answer.equals("f")))
            {
            userInput=false;
            }
        else if((answer.equals("T"))||(answer.equals("t")))
            {
            userInput=true;
            }
        if(userInput==officialAnswer)
            {
            System.out.print("Correct");
            }
        else
            {
            System.out.println("Wrong, try again");
            }
            

            

        } //end of main method
    } //end of class
