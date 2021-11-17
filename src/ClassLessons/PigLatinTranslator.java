/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassLessons;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class PigLatinTranslator {

    public static String toPigLatin(String word) {
        //does it start with a vowel
        word = word.toLowerCase();
        if (word.startsWith("a")
                || word.startsWith("e")
                || word.startsWith("i")
                || word.startsWith("o")
                || word.startsWith("u")) {
            return word + "way";
        } else {
            // go through each letter
            // start at 1 because we dont need to look at the first letter
            for (int i = 1; i < word.length(); i++) {
                //  get letter at position i
                char letter = word.charAt(i);
                String vowels = "aeiou";
                // if the letter is in the vowels aeiou
                // it must be one of those vowels
                if (vowels.contains("" + letter)) {
                    String back = word.substring(i);
                    String front = word.substring(0, i);
                    return back + front + "AY";
                }
            }

        }
        //if it somehow manages no translation rules
        return word;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter something to translate");
        String line = in.nextLine();

        String[] words = line.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String translation = toPigLatin(word);
            System.out.print(translation + " ");
        }
        System.out.println("");
    }
}
