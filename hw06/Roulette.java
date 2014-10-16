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
    
    //generates random number between 0 and 38 to simulate a game of roulette
    int outcome = (int)(Math.random() * 39);
    //generates random number to use as bet
    int bet = (int)(Math.random() * 39);
    
    //program will run 1000 times
    int counter = 0;
    while (counter < 1000)  {
        //program will run 1000 times with each specific round running 100 times (100 spins) totaling in 100,000 attempts to collect data
        int spin = 0;
        while (spin < 100) {
            while (bet == outcome) {
                int answer = 0;
                int successful = 0;
                int win = 0;
                answer == successful;
                while (answer == successful) {
                    answer == win;
                }
            while (bet != outcome) {
                int unsuccessful = 0;
                int loss = 0;
                answer == unsuccessful;
                while (answer == unsuccessful)  {
                    answer == loss;
                }
                }

                    
                }
                    
            while (bet != outcome) {

        }
        spin++;
    }
    counter++;
    }
    

//    System.out.println("The total number of times you lost everything= "+totalLost+" ");
//    System.out.println("The total number of winnings of all the simulations added together= "+totalWinnings+" ");
//    System.out.println("The amount of times you walked away with money after 1 round of 100 spins: "+moneyWon+" ");
        
        }//end of main method
    }//end of class