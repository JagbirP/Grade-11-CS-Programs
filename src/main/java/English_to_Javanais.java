/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.java;

/**
 *
 * @author Jagbir Purewal
 */
public class English_to_Javanais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean check = false;

        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";

        String word = "cat";

        String wordF = word;

        char[] wordA = word.toCharArray();

        while (check != true) {
            for (int i = 0; i < word.length(); i++) {

                if (word == wordF) {
                    word = "";
                }

                if (i + 1 < word.length()
                        && consonants.contains("" + wordA[i])
                        && vowels.contains("" + wordA[i + 1])) {

                    String beforecut = word.substring(0, i);
                    String aftercut = word.substring(i + 1);
                    word = beforecut + "av" + aftercut;

                } else {
                    word = word + wordA[i];
                }

                check = false;

                for (int j = word.length(); j > 0; j--) {

                    if (j - 3 > 0
                            && vowels.contains("" + wordA[j])
                            && wordA[j - 1] == 'v'
                            && wordA[j - 2] == 'a'
                            && consonants.contains("" + wordA[j - 3])) {

                        check = true;
                    }

                }
            }

        }
        System.out.println(word);

    }
}
