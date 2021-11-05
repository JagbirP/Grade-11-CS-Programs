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

        //array of words
        String[] wordsA = new String[5];
        
        //ask user for words they want to play with
        System.out.println("Player 1 Enter 5 Words");
        for (int i = 0; i < 5; i++) {
            wordsA[i] = in.nextLine();
        }

        //random number generator 
        int y = (int)(Math.random() *5);
        
        //input generated number as the index to get random word
        String wordS = wordsA[y];
        
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

        //# of lives
        int Lives = 5;
        //boolean to check if word is complete
        Boolean anscheck = false;
        
        //print the empty word
        for (int i = 0; i < x; i++) {
            System.out.print(LengthS[i] + " ");
        }
        

        //REPEAT GUESS LOOP FROM HERE
        while (Lives != 0 && anscheck != true) {

            //ask for guess
            System.out.println("Player 2 Enter your guess");
            String guessS = in.nextLine();
            //convert guess into single character
            char guess = guessS.charAt(0);

            //boolean for checking if guess is correct
            Boolean check = false;

            //for loop to compare guesses with original and replace if correct
            for (int i = 0; i < x; i++) {
                if (guess == wordA[i]) {
                    LengthS[i] = wordA[i];
                    check = true;
                }
            }

            //if statement to check if answer is wrong
            if (check == false) {
                //tell player it was wrong
                System.out.println("Guess was incorrect");
                //remove a life
                Lives--;
            }
            System.out.println("You have " + Lives + " lives left");

            for (int i = 0; i < x; i++) {
                System.out.print(LengthS[i] + " ");
            }
            
            //set answer check boolean to true
            anscheck = true;
            
            //for loop to check if answer is complete
            for (int i = 0; i < x; i++) {
                /*if the answer is actually not complete, 
                change anscheck back to false*/
                if (LengthS[i] != wordA[i]) {
                    anscheck = false;
                }
            }
        }
        //print out GAME OVER if they lost all lives
        if (Lives == 0) {
            System.out.println("GAME OVER");
        }
        //print out Player 2 Wins if completed word
        if (anscheck == true) {
            System.out.println("Player 2 Wins");
        }
    }
}
