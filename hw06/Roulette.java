//Phebe de Guzman
//Professor Chen
//hw06

//use a random number genorator to simulate a person's betting on 100 spins
//this persons method is to bring 100$ and bet 1$ on the same number for 100 rounds
//run the simulation 1000 times and collect data on the outcome
//roulette rules:
    //38 possible numbers
    //if my number comes up I get $36
    //if my number comes up more then 3 times I walk away with 108$
    //if my number comes up more then 3 times I win
//compute:
    //the number of times I lose everything (my number never comes up)
    //the total number of winnings of all the simulations added together
    //compute the number of times I walked away with a profit in one session of 100 spins

//establish a class
public class Roulette {
    //main method required for every java program
    public static void main (String[] args) {
    
//declare all variables
    //variable that represents the number of rounds of 100 spins each
    int counter=0;
    //represents the random number "guessed" by the player
    int bet=0;
    //represents the random number generated to simulate the outcom of spinning the roulette wheel
    int outcome=0;
    //represents the variable that will store the amount of rounds won
    int amountWon=0;
    //represents the variable that will count the amount of spins lost
    int spinsLost=0;
    //represents the variable that counts the profits of each round of 100 spins
    int moneyMade=0;
    //represents the variable that counts the number of times I made money
    int numberTimesWon=0;
    //this variable counts the dollars I made total
    int totalMoneyMade=0;
    
//program will run 1000 times
//with each specific round running 100 times (100 spins) 
//totaling in 100,000 attempts to collect data
    while (counter<1000)  
        {
        bet=(int)(1+Math.random() * 39);    
        //makes sure that each of the 1000 rounds contains 100 spins
        for (int spin=0; spin<100; spin++) 
            {
            outcome = (int)(1+Math.random() * 39);
            //if the the number I bet on is the same as what was randomly generated
            //in place of the roulette spinner, then I win that round
            if (bet==outcome) 
                {
                amountWon++; //if numbers are the same then this adds +1 to the amount of rounds won
            }
        }
    
        moneyMade=(amountWon*36)- 100; //this calculates the amount of money I make 
        //by multiplying the amount won per round times the amount of times I won
        
        counter++;
        totalMoneyMade+=moneyMade;
        amountWon=0;
        
        if(moneyMade>0) {        //if I win a round and make money then this will add +1 to 
            numberTimesWon++;    //the total count of the amount of times I won
            }
        else if(moneyMade<108) {  //if I make less then 108$ that means I lost more then 3 spins
            spinsLost++;          //in a round of 100 which means I lost money
            }
        }

//now this will print out the results of all the data gained from the 100,000 attempts
    //how many times did I lost everything?
    System.out.println("The total number of times you lost everything is: "+spinsLost+" times");
    
    if(totalMoneyMade>=0) {
        //total amount of money made
        System.out.println("The total amount of winnings from all of the simulations I won added together is $"+totalMoneyMade+" ");
        }
    else if(totalMoneyMade<0) {
        //total amount of money lost
        System.out.println("For all 100,000 spins my total losses were $"+(-1*totalMoneyMade)+" ");
        }
    //amount of times I walked away with a profit    
    System.out.println("The amount of times I walked away with a profit after 100,000 spins: "+numberTimesWon+" ");
        
        }//end of main method
    }//end of class