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
public class TwoIntsAscendingOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //create array
        int[] nums = new int[2];

        //create for loop to ask for digits
        System.out.println("Enter your 2 numbers for ascending order");
        for (int i = 0; i < 2; i++) {
            nums[i] = in.nextInt();
        }

        //compare and switch numbers to ascending order
        if (nums[0] > nums[1]) {
            int x = nums[0];
            nums[0] = nums[1];
            nums[1] = x;
        }

        //print numbers in order
        System.out.println(nums[0] + "," + nums[1]);
    }

}
