/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding_Club;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class CCC_JP2_SilentAuction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //ask for how many bids there were
        System.out.println("Number of Bids");
        int N = in.nextInt();
        
        //array for bid values
        int[] bids = new int[N];
        // array of names of the bidders
        String[] names = new String[N];
        
        // take in the bid values and keep the largest bid to output
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }
    
}
