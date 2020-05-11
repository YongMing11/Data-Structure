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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter hour and minute: ");
//        int hour = sc.nextInt();
//        int minute = sc.nextInt();
        Time a = new Time(13,45);
        Time b = new Time(33,15);
        Time c = new Time(10,52);
        a.check();
        b.check();
        c.check();
       
    }
}
