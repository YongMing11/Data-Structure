/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class LinkedListImplementation<T> {

    private List<Integer> a = new LinkedList<>();
    private int t;
    private boolean x=true;

    public LinkedListImplementation() {
        generate();
    }

    public void generate() {
        Random r = new Random();
        a.add(r.nextInt(101));
        
        while (a.size() < 20) {
            for (int i = 0; i < a.size()-1; i++) {
                t = r.nextInt(101);
                if (a.get(i) == t) {
                    x = false;
                    break;
                } else {
                    x = true;
                }

            }
            if (x) {
                a.add(t);
            }
        }
    }

    public void display() {
        System.out.print("LinkedList Implementation\n");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}
