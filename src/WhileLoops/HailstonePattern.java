package WhileLoops;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class HailstonePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer to see hailstone sequence");
        int number = input.nextInt();

        while (number != 1) {
            if (number % 2 == 0) {
               number =  number/2;
                System.out.println(number);
            } else if (number %2 != 0){
                number = number*3+1;
                System.out.println(number);
            }
        }
    }
}
            }
        }

    }

}
