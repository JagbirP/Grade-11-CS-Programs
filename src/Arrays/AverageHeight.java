package Arrays;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class AverageHeight {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ask user for how many heights they want to enter
        System.out.println("How many heights do you want to enter");
        int numh = in.nextInt();

        /*create array with the amount of spaces
        being the amount of heights they would like to enter*/
        int h[] = new int[numh];

        //ask user for the heights
        System.out.println("Enter the " + numh + " heights");
        for (int i = 0; i < numh; i++) {
            h[i] = in.nextInt();
        }
        //variable to hold the sums of the heights
        int Hsum = 0;
        //loop to find the sum of the heights
        for (int i = 0; i < numh; i++) {
            //add up all the heights
            Hsum = Hsum + h[i];
        }
        //find the average of the total heights
        int Havg = Hsum / numh;

        //print out average height
        System.out.println("The average height is " + Havg);
        
        //let user know what the coming integers mean
        System.out.println("The heights above average are");
        
        //loop to check which heights are above average
        for (int i = 0; i < numh; i++) {
            
            //check if height at each index is above avg or not
            if (h[i] > Havg) {
                
                //print out heights that are above Havg
                System.out.println(h[i]);
            }
        }
    }
}
