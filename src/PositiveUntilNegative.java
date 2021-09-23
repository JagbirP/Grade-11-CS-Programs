
import java.util.Scanner;


/**
 *
 * @author purej1485
 */
public class PositiveUntilNegative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
         System.out.println("Enter a positive integer. Enter a negative integer to end.");
        int num = input.nextInt();
  
       while (num >= 0){
           System.out.println("Enter a positive integer. Enter a negative integer to end.");
           num = input.nextInt();
       }
       
       
    }
    
}
