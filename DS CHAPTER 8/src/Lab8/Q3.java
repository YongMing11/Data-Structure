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
public class Q3 {
    public static void main(String[] args) {
        String fastest;
        System.out.println("Performance Comparison of Sorting Algorithms");
        System.out.println("Running on 1000 sets of 100000 random numbers");
        Q3SortTest<Integer> a = new Q3SortTest<>(SortTest.ASCENDING,0);
        long startTime = System.currentTimeMillis();
        a.quickSort();
        a.showTest();
        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("Quick Sort : "+interval);
        long min = interval;
        fastest = "Quick Sort";
        
        a.reset();
        startTime = System.currentTimeMillis();
        a.selectionSort();
        a.showTest();
        endTime = System.currentTimeMillis();
        interval = endTime - startTime;
        System.out.println("Selection Sort : "+interval);
        if(interval<min){
            min = interval;
            fastest = "Selection Sort";
        }
        
        a.reset();
        startTime = System.currentTimeMillis();
        a.mergeSort();
                a.showTest();
        endTime = System.currentTimeMillis();
        interval = endTime - startTime;
        System.out.println("Merge Sort : "+interval);
        if(interval<min){
            min = interval;
            fastest = "Merge Sort";
        }
        
        a.reset();
        startTime = System.currentTimeMillis();
        a.insertionSort();
        a.showTest();
        endTime = System.currentTimeMillis();
        interval = endTime - startTime;
        System.out.println("Insertion Sort : "+interval);
        if(interval<min){
            min = interval;
            fastest = "Insertion Sort";
        }
        
        a.reset();
        startTime = System.currentTimeMillis();
        a.bubbleSort();
        a.showTest();
        endTime = System.currentTimeMillis();
        interval = endTime - startTime;
        System.out.println("Bubble Sort : "+interval);
        if(interval<min){
            min = interval;
            fastest = "Bubble Sort";
        }
        
        System.out.println("The fastest sorting algo is "+fastest);
    }
}
