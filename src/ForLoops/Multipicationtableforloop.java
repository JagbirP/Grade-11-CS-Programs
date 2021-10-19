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
public class Multipicationtableforloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ask for input
        System.out.println("Create a multipication table");
        int n = in.nextInt();

        //for loop 
        for (int i = 0; i <= 12; i++) {
            int total = i * n;
            
            System.out.println(n + " x " + i + " = " + total);
        }
    }

}
