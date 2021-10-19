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
public class FactorialForloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ask for input
        System.out.println("Find the Factorial");
        int n = in.nextInt();

        //varible to hold the product
        int count = 1;

        // subtract 1 from input number to multiply
        for (int i = 1; i <= n; i++) {
            //get factorial
            count = count * i;
        }
        //print out factorial
        System.out.println(count);
    }

}
