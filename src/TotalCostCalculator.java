
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
public class TotalCostCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How Many Chargers, MotherBoards, Mice do you need? Enter each amount one at a time");
        double ChargerC = in.nextInt();
        double MotherboardC = in.nextInt();
        double MouseC = in.nextInt();
        
        
        double Subtotal = (ChargerC*34.99)+(MotherboardC*127.50)+(MouseC*18.00);
        double Taxes = Subtotal*0.13;
        double Total = Subtotal+Taxes; 
        
        System.out.println("Subtotal is " + Subtotal);
        System.out.println("Tax is " + Taxes);
        System.out.println("Total is " + Total);

    }

}
