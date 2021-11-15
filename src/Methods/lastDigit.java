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
public class lastDigit {

    public static int lastDigit(int num) {

        if (num < 0) {
            num = num * -1;
        }
        int digit = num % 10;
        return digit;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(-1245));
    }

}
