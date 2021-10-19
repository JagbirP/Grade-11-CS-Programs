/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckYourUnderStanding;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class CountDigits2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Find how many digits in this number");
        int n = in.nextInt();

        // keep asking until number is positive
        while (n <= 0) {
            System.out.println("Find how many digits in this number");
            n = in.nextInt();
        }

        int count = 0;
        int num = n;

        while (n > 0) {
                n = n / 10;
                count++;
        }
        System.out.println("There are " + count + " digits in " + num);
    }
}
