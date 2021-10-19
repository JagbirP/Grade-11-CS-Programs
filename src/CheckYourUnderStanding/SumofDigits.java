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
public class SumofDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Find the sum of the digits in this number");
        int n = in.nextInt();

        // keep asking until number is positive
        while (n < 0) {
            System.out.println("Find the sum of the digits in this number");
            n = in.nextInt();
        }
        
        //variables
        int rem = 0;
        int total = 0;
        int num = n;
        
        while (n > 0) {
            if (n > 0) {
                rem = n % 10;
                total = total + rem;
                n = n / 10;
            }
        }
        System.out.println("The sum of the digits in " + num + " equals " + total);
    }
}
