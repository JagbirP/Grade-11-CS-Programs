
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
public class SlopeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter in the x coordinate of the first point");
        int x1 = in.nextInt();
        System.out.println("Please enter in the y coordinate of the first point");
        int y1 = in.nextInt();
        System.out.println("Please enter in the x coordinate of the second point");
        int x2 = in.nextInt();
        System.out.println("Please enter in the y coordinate of the second point");
        int y2 = in.nextInt();
        
        int answer = (y2-y1)/(x2-x1);
        System.out.println("The slope of your line would be " + answer); 
    }
    
}
