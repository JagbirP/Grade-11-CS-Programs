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
public class Methods_Intro {

    public static void sayHello(){
        System.out.println("Hello World");
    }
    
    public static double areaofRectangle(double length, double width){
        double area = length * width;
        return area;
    }
    
    public static void println(String s){
        System.out.println(s);
    }
    public static void printFactors(int num){
        System.out.println("The factors of " + num + " are:");
    //go from 1 to the number
        for (int i = 1; i <= num; i++) {
            //does it divide?
            if(num % i ==0){
                System.out.println(i);
            }
        }
}
    /**
     * @param args the command line arguments` 
     */
    public static void main(String[] args) {
        printFactors(1260);
    }
    
}
