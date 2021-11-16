/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author purej1485
 */
public class allDigitsOdd {

    public static boolean alldigitsodd(int num) {
        //turn negative into positive
        if (num < 0) {
            num = num * -1;
        }

        //set check to true
        boolean check = true;

        //while the num is more than 1 digit
        while (num >= 10)
        {
            //divide the num by 10 to seperate the digits
            num = num / 10;

            //if any digit is even turn check to false
            if (num % 2 == 0) {
                return check = false;
            }
        }
        return check = true;

    }

    public static void main(String[] args) {
        System.out.println(alldigitsodd(9145293));
    }

}
