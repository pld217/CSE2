//Phebe de Guzman
//hw02
//9-7-14
//Arithmetic Java Program

//  define a class
public class Arithmetic {

// add main method 
    public static void main(String[] args) {
 
    //Assumptions given in homework
      
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
         //Tax Cost
        double taxPercent=0.06;
         
        //Calculations
        
        //Calculate the total cost of the socks
        double totalsockCost$=(double)Math.round(nSocks*sockCost$*100)/100;
        //Calculate the total tax that will be added on to the socks
        double totalsockTax=(double)Math.round(totalsockCost$*taxPercent*100)/100;
        //Calculate the total cost of all the glasses
        double totalglassCost$=(double)Math.round(nGlasses*glassCost$*100)/100;
        //Calculate the total tax that will be added on to the glasses 
        double totalglassTax=(double)Math.round(totalglassCost$*taxPercent*100)/100;
        //Calculate the total cost of the envelopes
        double totalenvelopeCost$=(double)Math.round(nEnvelopes*envelopeCost$*100)/100;
        //Calculate the total tax to be added to the envelopes
        double totalenvelopeTax=(double)Math.round(totalenvelopeCost$*taxPercent*100)/100;
        //Calculate the total cost of the purchase without tax
        double totalpurchaseCost$=totalsockCost$+totalglassCost$+totalenvelopeCost$;
        //Calculate the total actually paid for this transaction, including tax
        double totaltransactionCost=totalpurchaseCost$+totalpurchaseCost$*taxPercent;
        
        
        //Instructions to print out the following
        System.out.println("The total cost of socks is $ " +totalsockCost$);
        System.out.println("The total tax on socks is $ " +totalsockTax);
        System.out.println("The total cost of glasses is $ " +totalglassCost$);
        System.out.println("The total tax on the glasses is $ " +totalglassTax);
        System.out.println("The total cost of envelopes is $ " +totalenvelopeCost$);
        System.out.println("The total tax on the envelopes is $ " +totalenvelopeTax);
        System.out.println("The total cost of the purchase is $ " +totalpurchaseCost$);
        System.out.println("The total cost of purchases is $ " +totalpurchaseCost$);
        //Had to round the total transaction cost here because when rounded above and compiled/run the math would be incorrect 
        System.out.println("The total actually paid for this transaction is $ " +(double)Math.round(totaltransactionCost*100)/100);
        

        
    } // end of main method
} //end of class