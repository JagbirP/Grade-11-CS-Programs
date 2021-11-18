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
public class Javanais_English_Detector_And_Translator {

    // all the consonants and vowels
    static String consonants = "bcdfghjklmnopqrstvwxyz";
    static String vowels = "aeiou";

    public static String englishtojavanais(String EtoJword) {

        //change word to lowe4rcase
        EtoJword = EtoJword.toLowerCase();

        //boolean to check if word is done
        boolean check = false;

        //while the word is not done
        while (check != true) {
            
            // make word into char array
            char[] wordA = EtoJword.toCharArray();
            
        }

        }

    

    public static String javanaistoenglish(String JtoEword) {
        //change word to all lower case 
        JtoEword = JtoEword.toLowerCase();

        // boolean to check if word is done
        boolean check = false;

        //while the word is not done
        while (check != true) {

            // make word into char array
            char[] wordA = JtoEword.toCharArray();

            // turn char array into ascii values
            for (int i = 0; i < 10; i++) {
                int[] ascii = new int[JtoEword.length()];
            }

            for (int i = 0; i < JtoEword.length(); i++) {

                // if the letter is a consonant
                if (i + 3 < JtoEword.length() && consonants.contains("" + wordA[i])
                        // the consonant is followed by a
                        && wordA[i + 1] == 'a'
                        // the a is followed by v
                        && wordA[i + 2] == 'v'
                        // and they are followed by a vowel
                        && vowels.contains("" + wordA[i + 3])) {

                    //make check false 
                    check = false;

                    // seperate consonant and previous letters
                    String beforecut = JtoEword.substring(0, i + 1);

                    //seperate all letters after "av"
                    String aftercut = JtoEword.substring(i + 3);

                    // stick word with "av" taken out, together
                    JtoEword = beforecut + aftercut;
                    wordA = JtoEword.toCharArray();

                } // if the if statements are false, make the check true
                // which means word is done
                else {
                    check = true;
                }

            }
        }
        return JtoEword;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test Code
        // String word = "stavubbavorn";
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
