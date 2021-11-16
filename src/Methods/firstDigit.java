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
public class firstDigit {

    public static int firstDigit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        
        while (num > 10) {
            num = num / 10;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(firstDigit(-4123572));
    }

}
