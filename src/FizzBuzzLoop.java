
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
         
         System.out.println("Enter a positive integer to see the FizzBuzz numbers");
         int number = input.nextInt();
         
         if(number == 0){
      System.out.println("0");
    }else if(number % 15 == 0 ){
      System.out.println("FizzBuzz");
    }else if(number % 5 == 0){
      System.out.println("Buzz");
    }else if(number % 3 == 0){
      System.out.println("Fizz");
    }
    
         while (number )
}
}
