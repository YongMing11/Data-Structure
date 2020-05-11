/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial6;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {

    public static void main(String[] args) {
        int maxset = 30;
        Q3Queue<String> a = new Q3Queue<>();
        System.out.println("Simulating a Queue to purchase MY phone");
        Random r = new Random();
        int set = 0;
        int cus = 0;
        while (maxset > 0) {
            cus++;
            set = r.nextInt(3) + 1;
            if (set + maxset > 30 && maxset < 4) {
                set = 30 - maxset;
                a.enqueue("Customer " + cus + " : " + set + " set(s)");
                break;
            } else {
                maxset -= set;
                a.enqueue("Customer " + cus + " : " + set + " set(s)");
            }
        }
        a.showQueue();
        System.out.println("Number of Customer : "+a.getSize());
    }
}
