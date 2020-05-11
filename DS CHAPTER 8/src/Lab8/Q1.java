/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {
    public static void main(String[] args) {
        System.out.print("Enter N Special Random Number within 0-100: ");
        SortTest<Integer> a = new SortTest<>(SortTest.ASCENDING,0);
        System.out.println("The Special Number are ");
        a.showTest();
        System.out.println("After Merge Sort : ");
        a.mergeSort();
        a.showTest();
    }
}
