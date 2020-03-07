/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class Array<T> {

    private int[] a = new int[20];
    private int t = 0;
    private boolean x = true;

    public Array() {

        generate();
    }

    public void generate() {
        Random r = new Random();
        int counter = 0;
        a[19]=1000;
        while (a[19]==1000) {
            for (int i : a) {
                t = r.nextInt(101);
                if (t == i) {
                    x = false;
                    break;

                } else {
                    x = true;
                }
            }
            if (x) {
                a[counter] = t;
                counter++;
            }
        }
    }

    public void display() {
        System.out.print("Array Implementation\n");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
