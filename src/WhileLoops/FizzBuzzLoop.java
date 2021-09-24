package WhileLoops;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class FizzBuzzLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user for number 
        System.out.println("Enter a positive integer to see the FizzBuzz numbers");
        
        //variables
        int number = input.nextInt();
        int count = 0;

        while (count < number) {

            // counting up
            count ++; 
            //fizzbuzz code
            if (count == 0) {
                System.out.println("0");
            } else if (count % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (count % 5 == 0) {
                System.out.println("Buzz");
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
            } else if(count % 15 != 0 && count % 5 != 0 && count % 3 != 0)
                System.out.println(count);
            }
        }
    }

