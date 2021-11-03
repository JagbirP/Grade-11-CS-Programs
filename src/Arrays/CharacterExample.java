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
public class CharacterExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //to take the first letter
        System.out.println("Please eneter a letter");
        String word = in.nextLine();

        //make sure it is only 1 letter
        while (word.length() > 1) {
            System.out.println("Try again");
            System.out.println("Please eneter a letter");
            word = in.nextLine();
        }
        //convert the word to a single letter
        char letter = word.toLowerCase().charAt(0);
        if(letter == 'z'){
            System.out.println("I Love the letter z");
        }
        
        System.out.println("Please enter a word");
        String bigWord = in.nextLine();
        char [] letters = bigWord.toCharArray();
        System.out.println(letters[1]);
        
    }
}






