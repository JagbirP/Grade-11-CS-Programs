package Basics;


import java.util.Scanner;


public class MathPractice {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a temperature in degrees Celsius you would like to convert to Fahrenheit");
    //get the temp
    double tempC = input.nextDouble();
    double tempF = (tempC*9)/5+32; 
    System.out.println(tempC + "C is the same as " + tempF + "F");
     
    }
    
}
