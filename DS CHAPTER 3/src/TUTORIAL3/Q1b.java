/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL3;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class Q1b {

    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(5);
            System.out.print(a[i] + " ");
        }

        System.out.println("\nSum: " + sum(a, 0, 0));
    }

    public static int sum(int[] a, int counter, int sum) {
        while (counter < a.length) {
            sum+= a[counter];
            counter++;
            sum(a,counter,sum);
        }
        return sum;
    }
}
