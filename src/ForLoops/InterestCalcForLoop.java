/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoops;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class InterestCalcForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input variables to ask for investment, interes rate, years
        System.out.println("investment, Interest rate, number of years");
        double inv = in.nextDouble();
        //divide percent by 100 to get product variable
        double rate = in.nextDouble() / 100;
        double year = in.nextDouble();

        //varible to hold the total interest
        double total = 0;

        //i will count up to the number of years
        for (int i = 0; i < year; i++) {
            //get total interest
            total = inv * rate;
            //make inv increase by previous interest
            inv = inv + total;
        }
        //round number to 2 decimals
        double roundOff = Math.round(inv*100.0)/100.0;
        //print out rounded total
        System.out.println("Your final balance would be $" + roundOff);
    }

}
