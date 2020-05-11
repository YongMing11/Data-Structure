/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL3;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q4 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String s = sc.next();
            if (s.length() > 12) {
                throw new LongStringException("String length is longer than 12");
            }
        } catch (LongStringException e) {
            System.err.println(e.getMessage());
        }
    }
}
