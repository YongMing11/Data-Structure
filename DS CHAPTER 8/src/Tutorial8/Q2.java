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
public class Q2 {
    public static void main(String[] args) {
        SortTest<String> a = new SortTest<>(SortTest.ASCENDING,"String");
        System.out.print("The random String are : ");
        a.showValue();
        System.out.println("Merge Sort - Ascending Order");
        a.mergeSort();
        a.showValue();
         a = new SortTest<>(SortTest.ASCENDING,"String");
        System.out.print("The random String are : ");
        a.showValue();
        System.out.println("Quick Sort - Ascending Order");
        a.quickSort();
        a.showValue();
    }
}
