/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL2;

import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class ArrayDice<T> implements Dice<T> {

    private int total = 0;
    private int number = 0;
    private Integer[] a;

    public ArrayDice(T n) {
        this.number = (int) n;
    }

    public void number() {
        Random r = new Random();
        a = new Integer[(int) number];
        
        for (int i = 0; i < (int) number; i++) {
            a[i] =1+ r.nextInt(9);
            
            System.out.print(a[i] + " ");
            total += a[i];
        }
        System.out.println("");
    }

    public String toString() {
        return "Total is " + total;
    }
}
