/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FinalProject;

import java.util.Scanner;

/**
 *
 * @author Jagbir Purewal
 */
public class Testing_Split_and_Bemas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // expression I am working with
        String expression = "12 + 6 / 2 - 4 * 10";

        // turn the expression into an array of strings with split
        String[] nums = expression.split(" ");

        //answer variable
        double answer = 0;

        // all the single digit numbers
        String numbers = "1234567890";

        // all the operations
        String operations = "-+*/";

        // hold the first number in the expression
        answer = Double.parseDouble("" + nums[0]);

        //go through the string array and check for operations and solve
        for (int i = 0; i < nums.length; i++) {

            if (operations.contains("" + nums[i])) {
                // turn the number into a double (parse double), then solve the operation
                if (i + 1 < nums.length && "+".equals(nums[i])) {
                    answer = answer + Double.parseDouble("" + nums[i + 1]);

                } else if (i + 1 < nums.length && "-".equals(nums[i])) {
                    answer = answer - Double.parseDouble("" + nums[i + 1]);

                } else if (i + 1 < nums.length && "*".equals(nums[i])) {
                    answer = answer * Double.parseDouble("" + nums[i + 1]);

                } else if (i + 1 < nums.length && "/".equals(nums[i])) {
                    answer = answer / Double.parseDouble("" + nums[i + 1]);
                }
                

            }

        }
        
        System.out.println(answer);
    }
}
