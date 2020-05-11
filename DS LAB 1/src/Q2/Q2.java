/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("The polynomial is 4.0x^3 +2.0x^2 -0.5x -20.0");
        System.out.print("when x = ");
        double input = sc.nextDouble();
        double[] co = {4.0 , 2.0 , -0.5 , -20.0};
        Polynomial a = new Polynomial(input,co);
        System.out.println("4.0x^3 +2.0x^2 -0.5x -20.0 = "+ a.operation());
    }
    
}
