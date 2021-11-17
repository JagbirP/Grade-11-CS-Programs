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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter something to translate");
        String line = in.nextLine();

        String[] words = line.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String translation = (word);
            System.out.print(translation + " ");
        }
        System.out.println("");
    }
    }
    

