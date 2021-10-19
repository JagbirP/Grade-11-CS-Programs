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
public class counttonumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //ask for input 
        System.out.println("Enter number you want to count to");
        int num = in.nextInt();

        //for loop to count up from 0 to entered number
        for (int i = 1; i <= num; i++) {
            //print out numbers with comma if not last number
            if (i < num) {
                System.out.print(i + ",");
            }
            // no comma if last number
            if (i == num) {
                System.out.println(i);
            }
        }

    }
}

