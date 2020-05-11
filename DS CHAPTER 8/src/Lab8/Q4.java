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
public class Q4 {
    public static void main(String[] args) {
        System.out.print("Enter N characters : ");
        Q4SortTest<Character> a = new Q4SortTest<>(Q4SortTest.ASCENDING,'a');
        System.out.print("The characters are : ");
        a.showTest();
        System.out.println("Heap Sort - Ascending Order");
        a.HeapSort();
        a.showTest();
    }
}
