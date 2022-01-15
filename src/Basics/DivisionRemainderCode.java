package Basics;


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
public class DivisionRemainderCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter in two integers, on seperate lines, to divide");
        // get the integers
        int nOne = in.nextInt();
        int nTwo = in.nextInt();

        int answer = nOne / nTwo;
        System.out.println(nOne + "/" + nTwo + " is " + answer + " with a remainder " + nOne % nTwo);
    }

}
