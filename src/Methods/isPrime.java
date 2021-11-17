/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

public class isPrime {

    public static boolean isPrime(int num) {
        //check all possible divisors by counting from 2 to num (excluding 1 and num)
        for (int i = 2; i < num; i++) {
            //if it is divisible by any other value, return false
            if (num % i == 0) {
                return false;
            }
        }
        //if not divisible by any other value, return true
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}