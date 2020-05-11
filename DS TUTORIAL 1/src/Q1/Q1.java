/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int day,month,year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Day: ");
        day = sc.nextInt();
        System.out.print("Month: ");
        month = sc.nextInt();
        System.out.print("Year: ");
        year = sc.nextInt();
        Tarikh a = new Tarikh(day,month,year);
        System.out.println("Date is : "+a.toString());
    }
    
}
