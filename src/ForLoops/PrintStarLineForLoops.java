/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoops;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class PrintStarLineForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Number of stars in line");
        int s = in.nextInt();

        // make sure number is between 1-10
        if (s <= 0 || s > 10) {
            System.out.println("Number of stars in line");
            s = in.nextInt();
        }
        for (int i = 0; i < s; i++) {
            //print out stars
            System.out.print("*");
        }
    }

}
