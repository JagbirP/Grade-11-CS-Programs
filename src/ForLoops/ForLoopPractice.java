/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoops;

/**
 *
 * @author purej1485
 */
public class ForLoopPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int count = 0;

        while (count < 10) {
            System.out.println(count);
            count++;
        }
        
        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        //add numbers 1-100
        int sum = 0;
        
        //for loop that goes from 1 - 100
        for(int i = 1; i<=100; i++ ){
            //adding each number to the sum
            sum = sum + i;
        }
        System.out.println("sum " + sum);
    }

}
