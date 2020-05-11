/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String word = sc.next();
        char[]w = word.toCharArray();
        for(char x:w){
            ATOG z = new ATOG(x);
            z.display();
        }
    }
}
