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
        int y = (int) (Math.random() * 5);

        //input generated number as the index to get random word
        String wordS = wordsA[y];

        //convert string into character array
        char[] wordA = wordS.toUpperCase().toCharArray();

        //variable to hold length of original word
        int x = wordS.length();

        /*make array that takes the amount of letters in 
        original word and holds thenm as -'s*/
        char[] WordF = new char[x];

        //for loop to turn each index of WordF into a -
        for (int i = 0; i < x; i++) {
            WordF[i] = '-';
        }

        //# of lives
        int Lives = 5;

        //boolean to check if word is complete
        Boolean anscheck = false;

        //print the empty word
        for (int i = 0; i < x; i++) {
            System.out.print(WordF[i] + " ");
        }

        //boolean to check for repeated guesses
        Boolean Rcheck = false;

        //REPEAT GUESS LOOP FROM HERE
        while (Lives != 0 && anscheck != true) {

            //ask for guess
            System.out.println("Player 2 Enter your guess");
            String guessS = in.nextLine();

            //make the guessed character upper case
            String guessUS = guessS.toUpperCase();

            //Print out what they guessed
            System.out.println("Player 2 Guessed " + guessUS);
            //convert guess into single character
            char guess = guessS.toUpperCase().charAt(0);

            
            
            //check if they repeat a guess
            for (int i = 0; i < x; i++) {
                if (guess == WordF[i]) {
                    Rcheck = true;
                }
            }

            //if they did repeat a guess let them know
            if (Rcheck == true) {
                System.out.println("Already Guessed " + guess);
                Rcheck = false;
            }

            //boolean for checking if guess is correct
            Boolean check = false;
            
            //for loop to compare guesses with original and replace if correct
            for (int i = 0; i < x; i++) {
                if (guess == wordA[i]) {
                    WordF[i] = wordA[i];
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
                System.out.print(WordF[i] + " ");
            }

            //set answer check boolean to true
            anscheck = true;

            //for loop to check if answer is complete
            for (int i = 0; i < x; i++) {
                /*if the answer is actually not complete, 
                change anscheck back to false*/
                if (WordF[i] != wordA[i]) {
                    anscheck = false;
                }
            }
        }
        //print out GAME OVER if they lost all lives
        if (Lives == 0) {
            System.out.println("OUT OF LIVES, GAME OVER");
        }
        //print out Player 2 Wins if completed word
        if (anscheck == true) {
            System.out.println("Player 2 Wins");
        }
    }
}
