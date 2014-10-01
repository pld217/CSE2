//Phebe de Guzman
//CSE2
//Professor Chen
//hw05 -BurgerKing.java

//write a program that prompts the user to enter a choice of
    //burger (B orb)
    //Soda (S or s)
    //Fries (F or f)
//Then prompts the user the details of their choice

//import scanner
import java.util.Scanner;
    //establish a class
    public class BurgerKing {
        //main method required for every java program
        public static void main (String[] args) {

        //declare a scanner    
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        //variables
        char B=0;
        char b=0;
        char A=0;
        char a=0;
        char C=0;
        char c=0;
        char N=0;
        char n=0;
        char S=0;
        char s=0;
        char P=0;
        char p=0;
        char M=0;
        char m=0;
        char F=0;
        char f=0;
        char L=0;
        char l=0;
        char Character=0;
        
        //prompt user to enter what they  would like to order in a single character format
        System.out.print("Enter a letter to indicate a choice of: Burger (B or b), Soda (S or s), or Fries (F or f)");
        char initialOrder=myScanner.nextLine().charAt(0);
            
                //if user enters correct character
                if ((initialOrder=='B')||(initialOrder=='b')||(initialOrder=='S')||(initialOrder=='s')||(initialOrder=='F')||(initialOrder=='f')) 
                    {
                    //if customer orders a burger user will be prompted for details
                    if ((initialOrder=='B')||(initialOrder=='b')) 
                        {
                        System.out.print("Enter A or a for all the fixins, ");
                        System.out.print("C or c for cheese, ");
                        System.out.print("or N or n for none of the above: ");
                        char burgerOrder=myScanner.nextLine().charAt(0);
                        
                        //user will answer which toppings they would like
                        if ((burgerOrder=='A')||(burgerOrder=='a'))
                            {
                            System.out.println("You ordered a 'burger with all the fixins'");
                            }
                        else if ((burgerOrder=='C')||(burgerOrder=='c'))
                            {
                            System.out.println("You ordered a burger with cheese");
                            }
                        else if ((burgerOrder=='N')||(burgerOrder=='n'))
                            {
                            System.out.println("You ordered a burger with no toppings");
                            }
                        else
                            {
                            System.out.println("You did not enter any A, a, C, c, N, or n");
                            return;
                            }
                        } //end of burger possibilities
            
                    //if customer orders soda user will be promted to answer which kind they would like
                    if ((initialOrder=='S')||(initialOrder=='s')) 
                        {
                        System.out.print("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m):");
                        char sodaOrder=myScanner.nextLine().charAt(0);
                        
                        //user answers P or p indicating Pepsi
                        if ((sodaOrder=='P')||(sodaOrder=='p')) 
                            {
                            System.out.println("You ordered a Pepsi");
                            }
                        //user answers C or c indicating coke
                        else if ((sodaOrder=='C')||(sodaOrder=='c'))
                            {
                            System.out.println("You ordered a Coke");
                            }
                        //user answers S or s indicating sprite 
                        else if ((sodaOrder=='S')||(sodaOrder=='s'))
                            {
                            System.out.println("You ordered a Sprite");
                            }
                        //user answers M or m indication Montain Dew
                        else if ((sodaOrder=='M')||(sodaOrder=='m'))
                            {
                            System.out.println("You ordered a Mountain Dew");
                            }
                        else
                            {
                            System.out.println("You did not answer any P, p, C, c, S, s, M, or m");
                            return;
                            }
                        }//end of soda options
                        
                    //if customer orders fries user will be prompted to answer which size
                    if ((initialOrder=='F')||(initialOrder=='f')) 
                        {
                        System.out.print("Do you want a large or small order of fries (L,l,S, or s)");
                        char friesOrder=myScanner.nextLine().charAt(0);
                        
                        //if user answers L or l program will print they ordered large fries 
                        if ((friesOrder=='L')||(friesOrder=='l'))
                            {
                            System.out.println("You ordered large fries");
                            }
                        //if user answers S or s program will print they ordered small fries
                        else if ((friesOrder=='S')||(friesOrder=='s'))
                            {
                            System.out.println("You ordered small fries");
                            }
                        //if user does not enter either of these inputs error message will appear
                        else 
                            {
                            System.out.println("You did not enter any L, l, S, or s");
                            return;
                            }
                        }//end of fries options
                }
                else if (initialOrder!=Character)
                    {
                    System.out.println("Single digit expected");
                    }
                //if user enters anything besides the above a different error message will be printed
                else 
                    {
                    System.out.println("You did not enter any of B, b, S, s, F, or f");
                    }
                



        }   //end of main method
    }   //end of class