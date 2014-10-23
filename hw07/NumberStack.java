//Phebe de Guzman  //write a program that forces the user to enter an int between 1 and 9, inclusive, 
//Professor Chen   // and then prints out displays that depend on the value entered 
//hw07             //use loops to create each of the three stacks of numbers
                   //the first stack should be created using only for loops
                   //the second stack should be created using only while loops
                   //the third stack should be created using only do-while loops

//import scanner
import java.util.Scanner;
    //establish a class
    public class NumberStack {
        //main method required for every java program
        public static void main (String[] args) {
            
        //declare a scanner    
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        //prompt user to enter an int between 1 and 9 (inclusive)
        System.out.print("Enter an int between 1 and 9: ");
        int x=myScanner.nextInt();

            //indicate that is nuber stack will be computed using for loops
        System.out.println("Using for loops: ");
        for  (int i=1; i<=x; i++) {
            for (int j=1; j<=i; j++ ) {
                for (int k=0; k<(2*i-1); k++) {
                    System.out.print(i); 
                    }
                System.out.println();
                }
            for (int z=0; z<(2*i-1); z++) {
                System.out.print("-");
                }
            System.out.println();
        }

        System.out.println("Using while loops");
        int i=1;
        while (i<=x) {
            System.out.println();
                int j=1;
                while (j<=x) {
                    int k=0;
                    while (k<(2*i-1)) {
                        System.out.print(i);
                        k++;
                        }
                    System.out.println();
                    j++;
                    }
                int z=0;
                while (z<(2*i-1)) {
                    System.out.print("-");
                    z++;
                    }
                System.out.println();
                i++;
            }
        
        //print out the same block of numbers with a do-while loop    
        System.out.println("Using do-while loops");
            
            int q=1;
            
            do {
                System.out.println();
                int r=1;

                do {
                    int s=0;
                    do {
                        System.out.print(q);
                        s++;
                    } while (s<(2*q-1));
                    System.out.println();
                    r++;
                } while (r<=x); 
                    int t=0;
                    do {
                        System.out.print("-");
                        t++;
                    } while (t<(2*q-1));
                    System.out.println();
                    q++;
            } while (q<=x);
            
    }//end of main method
}//end of class