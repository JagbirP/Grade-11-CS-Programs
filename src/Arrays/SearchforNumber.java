/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class SearchforNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //create array
        int nums[] = new int[10];

        //ask for integers
        System.out.println("Enter your 10 integers");
        for (int i = 0; i < 10; i++) {
            nums[i] = in.nextInt();
        }

        //ask for number they want to find
        System.out.println("What number would you like the index of");
        int x = in.nextInt();

        //hold the index spot
        int y = 0;
        //compate x to all numbers in array to find equivalent integer
        for (int i = 0; i < 10; i++) {

            /*if the number x is equal to the array value being compared, 
            then print out the value of i + 1which is the index*/
            if (x == nums[i]) {
                y = i;
                System.out.println("your number is at index " + y);
            }
            
        }   
    }
}
