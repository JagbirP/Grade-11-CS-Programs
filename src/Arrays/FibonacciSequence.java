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
public class FibonacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ask for which fibonacci number they want
        System.out.println("What Fibonacci number would you like to find");
        int Npos = in.nextInt();

        //adding 1 to the asked number to skip over the 0 in the start
        int Newpos = Npos + 1;

        //create array for sequence
        int fib[] = new int[Newpos];

        //place holder variable to keep track of sequence position
        int y = 0;

        //make 1st and 2nd position 0 and 1
        fib[0] = 0;
        fib[1] = 1;

        //make a loop that counts up to Npos position in the sequence
        for (int i = 2; i < Newpos; i++) {
            //find the next number by adding the previous 2
            fib[i] = fib[i - 1] + fib[i - 2];
            y = fib[i];
        }
        if(Npos == 1){
            System.out.println("The " + Npos + " number is 1");
        }
        //print out the integer in the sequence
        System.out.println("The " + Npos + " Fibonacci number is " + y);
    }
}
