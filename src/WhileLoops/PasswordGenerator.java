package WhileLoops;


import java.util.Scanner;


/**
 *
 * @author purej1485
 */
public class PasswordGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many characters should it be?");
        int numCharacters = input.nextInt();
        
        
        int number = 1;
        
        
        while (number <= numCharacters){
            
            int num = (int)(Math.random ()*(90-65+1)) +65; 
            System.out.print((char)num);
            
           number++;
        }
        System.out.println();
    }
    
}
