
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author purej1485
 */
public class AscendingOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 2 integers, 1 at a time, to put them in ascending order");
        double number1 = in.nextDouble();
        double number2 = in.nextDouble();
        
        if (number2 > number1){
            System.out.println(number1 + "," + number2);
        }
        else {
            System.out.println(number2 + "," + number1);}
            
        }
    }
    
}
