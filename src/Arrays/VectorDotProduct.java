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
public class VectorDotProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //create arrays
        int V1[] = new int[3];
        int V2[] = new int[3];

        //ask for first 3d vector values
        System.out.println("Enter your x,y,z of Vector 1");
        for (int i = 0; i < 3; i++) {
            V1[i] = in.nextInt();
        }
        //ask for second 3d vector values
        System.out.println("Enter your x,y,z of Vector 2");
        for (int i = 0; i < 3; i++) {
            V2[i] = in.nextInt();
        }

        //variable to hold product of each 
        int y = 0;
        //for loop to calculate the dot product
        for (int i = 0; i < 3; i++) {

            //calculate the products of each value
            int x = V1[i] * V2[i];
            //add up the products
            y = y + x;
        }
        //print out product
        System.out.println("The dot product is " + y);
    }
}
