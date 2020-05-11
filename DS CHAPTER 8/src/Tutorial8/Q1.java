/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial8;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortTest<Character> Q1 = new SortTest<>(SortTest.DESCENDING, 'a');
        System.out.print("The random characters are : ");
        Q1.showValue();
        System.out.println("Selection Sort - Descending Order");
        Q1.selectionSort();
        Q1.showValue();
        
        Q1 = new SortTest<>(SortTest.DESCENDING, 'a');
        System.out.print("The random characters are : ");
        Q1.showValue();
        System.out.println("Bubble Sort - Descending Order");
        Q1.bubbleSort();
        Q1.showValue();
        
        Q1 = new SortTest<>(SortTest.DESCENDING, 'a');
        System.out.print("The random characters are : ");
        Q1.showValue();
        System.out.println("Insertion Sort - Descending Order");
        Q1.insertionSort();
        Q1.showValue();
        
        Q1 = new SortTest<>(SortTest.DESCENDING, 'a');
        System.out.print("The random characters are : ");
        Q1.showValue();
        System.out.println("Merge Sort - Descending Order");
        Q1.mergeSort();
        Q1.showValue();
        
        Q1 = new SortTest<>(SortTest.DESCENDING, 'a');
        System.out.print("The random characters are : ");
        Q1.showValue();
        System.out.println("Quick Sort - Descending Order");
        Q1.quickSort();
        Q1.showValue();
    }

}
