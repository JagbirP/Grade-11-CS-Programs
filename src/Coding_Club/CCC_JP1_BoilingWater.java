/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding_Club;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class CCC_JP1_BoilingWater {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the temperature in which the water begins to boil");
        int B = in.nextInt();
        

        int kpa = 5 * B - 400;
        System.out.println(kpa);

        if (kpa > 100) {
            System.out.println("-1");
        } else if (kpa == 100) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }

}
