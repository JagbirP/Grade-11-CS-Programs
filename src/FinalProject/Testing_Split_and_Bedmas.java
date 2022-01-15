/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FinalProject;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jagbir Purewal
 */
public class Testing_Split_and_Bedmas {

    /**
     * @param args the command line arguments
     */
    // expression I am working with
    static String expression = "5 * 5 * 10 - 5 / 2 + 6 / 10 - 5 * 9";

    // turn the expression into an array of strings with split
    static String[] nums = expression.split(" ");

    // updates the expression string by taking out blanks and commas during conversion
    public static String toText(String[] nums) {

        String output = "";

        for (int i = 0; i < nums.length; i++) {

            // if there is a blank, do nothing, else add it to output with spaces
            if (nums[i].equals("")) {

            } else {
                output += nums[i];
                if (i != nums.length - 1) {
                    output += " ";
                }

            }
        }

        return output;
    }

    // check if the string array still has multipication or division
    public static boolean muldivCheck(String[] nums) {

        boolean check = false;

        for (int i = 0; i < nums.length; i++) {
            if ("*".equals(nums[i]) || "/".equals(nums[i])) {
                check = true;
                break;
            }

        }
        return check;
    }
// check if the string array still has multipication or division

    public static boolean exponentsCheck(String[] nums) {

        boolean check = false;

        for (int i = 0; i < nums.length; i++) {
            if ("*".equals(nums[i]) || "/".equals(nums[i])) {
                check = true;
                break;
            }

        }
        return check;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //answer variable
        double answer = 0;

        // all the single digit numbers
        String numbers = "1234567890";

        // all the operations
        String operations = "-+*/";

        // variable to check for multipication/division
        boolean Checkmuldiv = false;

        // until there is only 1 number left, aka until the expression is solved
        while (nums.length != 1) {

            // check to see if there is multipication or division in the expression
            Checkmuldiv = muldivCheck(nums);

            while (Checkmuldiv != false) {

                for (int j = 0; j < nums.length; j++) {

                    // in the expression, and solve if there is
                    // if it is either operation, do the operation and then make 
                    // i-1 into the answer
                    if ("*".equals(nums[j])) {
                        // do the operation and make i-1 
                        nums[j - 1] = Double.toString(Double.parseDouble(""
                                + nums[j - 1]) * Double.parseDouble("" + nums[j + 1]));

                        // remove the parts of the expression already operated
                        nums[j] = "";
                        nums[j + 1] = "";

                        // update the expression string to match new expression
                        expression = Arrays.toString(nums);

                        // remove opening and closing brackets from string conversion
                        expression = expression.substring(1, expression.length() - 1);

                        // send to method toText
                        expression = toText(nums);

                        // update string array
                        nums = expression.split(" ");

                        System.out.println(expression);

                    } else if ("/".equals(nums[j])) {
                        // do the operation and make i-1 
                        nums[j - 1] = Double.toString(Double.parseDouble(""
                                + nums[j - 1]) / Double.parseDouble("" + nums[j + 1]));

                        // remove the parts of the expression already operated
                        nums[j] = "";
                        nums[j + 1] = "";

                        // update the expression string to match new expression
                        expression = Arrays.toString(nums);

                        // remove opening and closing brackets from string conversion
                        expression = expression.substring(1, expression.length() - 1);

                        // send to method toText
                        expression = toText(nums);

                        // update string array
                        nums = expression.split(" ");

                        System.out.println(expression);

                    }
                    // check if there is division or multipication left
                    Checkmuldiv = muldivCheck(nums);

                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums.length != 1 && "+".equals(nums[i])) {
                    // do the operation and make i-1 
                    nums[i - 1] = Double.toString(Double.parseDouble(""
                            + nums[i - 1]) + Double.parseDouble("" + nums[i + 1]));

                    // remove the parts of the expression already operated
                    nums[i] = "";
                    nums[i + 1] = "";

                    // update the expression string to match new expression
                    expression = Arrays.toString(nums);

                    // remove opening and closing brackets from string conversion
                    expression = expression.substring(1, expression.length() - 1);

                    // send to method toText
                    expression = toText(nums);

                    // update string array
                    nums = expression.split(" ");

                    System.out.println(expression);

                }

                if (nums.length
                        != 1 && "-".equals(nums[i])) {
                    // do the operation and make i-1 
                    nums[i - 1] = Double.toString(Double.parseDouble(""
                            + nums[i - 1]) - Double.parseDouble("" + nums[i + 1]));

                    // remove the parts of the expression already operated
                    nums[i] = "";
                    nums[i + 1] = "";

                    // update the expression string to match new expression
                    expression = Arrays.toString(nums);

                    // remove opening and closing brackets from string conversion
                    expression = expression.substring(1, expression.length() - 1);

                    // send to method toText
                    expression = toText(nums);

                    // update string array
                    nums = expression.split(" ");

                    System.out.println(expression);

                }
            }
        }
    }
}
