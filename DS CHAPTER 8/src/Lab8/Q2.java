/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author Forge-15 1650
 */
public class Q2 {
    public static void main(String[] args) {
        System.out.println("Reading data from product text file");
        SortTest<String> a = new SortTest<>(SortTest.ASCENDING,"");
        a.showTest2();
        System.out.println("After Quick Sort (Price, PID) :");
        a.quickSort();
        a.showTest2();
    }
}
