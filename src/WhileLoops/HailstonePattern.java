package WhileLoops;
import java.util.Scanner;
/**
 *
 * @author purej1485
 */
public class HailstonePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //ask user for the number they would like to test
        System.out.println("Enter a positive integer to see hailstone sequence");
        int number = input.nextInt();
        
        //until the number reaches 1
        while (number != 1) {
            //if the number is even, divide by 2 and print
            if (number % 2 == 0) {
               number =  number/2;
                System.out.println(number);
                
                //if the number is odd, multiply it by 3 and add 1, then print
            } else if (number %2 != 0){
                number = number*3+1;
                System.out.println(number);
            }
        }
    }
}