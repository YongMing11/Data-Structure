/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial8;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        Random r = new Random();
        for(int i=0;i<10;i++){
            a.add(r.nextInt(101));
        }
        System.out.print("The random integers are : ");
        a.showList();
        System.out.println("Selection Sort - Ascending Order");
        a.selectionSort();
        a.showList();
    }
}
