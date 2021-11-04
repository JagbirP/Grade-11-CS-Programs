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
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //ask user for word they want to play with
        System.out.println("Player 1 Enter a Word");
        String wordS = in.nextLine();
        
        //convert string into character array
        char[] wordA = wordS.toCharArray();
        
        //variable to hold length of original word
        int x = wordS.length();
        
        /*make array that takes the amount of letters in 
        original word and holds thenm as -'s*/
        char[] LengthS = new char[wordS.length()];
        
        //for loop to turn each index of LengthS into a -
        for (int i = 0; i < x; i++) {
            LengthS[i] = '-';
        }
        
        
        
        
        
        
        
        
        for (int i = 0; i < x; i++) {
            System.out.print(LengthS[i]);
        }
    }
}
