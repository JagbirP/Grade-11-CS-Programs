package WhileLoops;


import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class CountdownBy5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to count down to");

        int count = 100;
        int num = input.nextInt();
        while (count > num) {
            System.out.println(count);
            count = count-5;
            

        }
    }

}
