/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.pkg11;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class Javanais_To_English {

    public static String javanaistoenglish(String word) {
        //change word to all lower case 
        word = word.toLowerCase();

        // boolean to check if word is done
        boolean check = false;

        // all the consonants and vowels
        String consonants = "bcdfghjklmnopqrstvwxyz";
        String vowels = "aeiou";

        //while the word is not done
        while (check != true) {

            // make word into char array
            char[] wordA = word.toCharArray();

            for (int i = 0; i < word.length(); i++) {

                // if the letter is a consonant and i + 3 is not longer than the word
                if (i + 3 < word.length() && consonants.contains("" + wordA[i])
                        // the consonant is followed by a
                        && wordA[i + 1] == 'a'
                        // the a is followed by v
                        && wordA[i + 2] == 'v'
                        // and they are followed by a vowel
                        && vowels.contains("" + wordA[i + 3])) {

                    //make check false 
                    check = false;

                    // seperate consonant and previous letters
                    String beforecut = word.substring(0, i + 1);

                    //seperate all letters after "av"
                    String aftercut = word.substring(i + 3);

                    // stick word with "av" taken out, together
                    word = beforecut + aftercut;

                    // update array
                    wordA = word.toCharArray();

                } // if the if statements are false, make the check true
                // which means word is done
                else {
                    check = true;
                }

            }
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test Code
        //String word = "stavubbavorn";
        // String translation = englishtojavanais(word);
        // System.out.print(translation + " ");
        System.out.println("Please enter something to translate");
        String line = in.nextLine();

        String[] words = line.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String translation = javanaistoenglish(word);
            System.out.print(translation + " ");
        }
        System.out.println("");

    }
}
