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
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for how many marks for input
        System.out.println("How many test marks?");
        int numTests = input.nextInt();

        // create the array
        int[] tests = new int[numTests];

        // create the for loop to enter marks
        System.out.println("Enter each test mark");
        for (int i = 0; i < numTests; i++) {
            tests[i] = input.nextInt();
        }

        //add all the marks together
        int sum = 0;
        for (int i = 0; i < tests.length; i++) {
            sum = sum + tests[i];
        }
        
        //calculate the average
        int average = sum/numTests;
        
        //print average
        System.out.println("Your average is " + average);
    }

}
