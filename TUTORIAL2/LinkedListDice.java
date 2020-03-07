/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class LinkedListDice<T> implements Dice<T> {

    private int n;
    private int total = 0;
    private List<Integer> a=new LinkedList<>();

    public LinkedListDice(int n) {
        this.n = n;
    }

    public void number() {
        Random r = new Random();
 
        for (int i = 0; i < n; i++) {
            a.add(r.nextInt(9)+1);
            System.out.print(a.get(i) + " ");
            total += a.get(i);
        }

    }

    public String toString() {
        System.out.println("");
        return "Total is " + total;
    }
}
