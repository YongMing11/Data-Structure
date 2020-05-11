/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class Q3SortTest<T extends Comparable<T>> {

    private T[][] value;
    private T[][] memory;
    private final int set = 10;
    private final int numperset = 10;
    private final int MAX = 100;
    private int orderType;
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;

    public Q3SortTest(int a, T b) {
        this.orderType = a;
        Random r = new Random();
        value = (T[][]) new Comparable[set][numperset];
        memory = (T[][]) new Comparable[set][numperset];
        for (int i = 0; i < set; i++) {
            for (int j = 0; j < numperset; j++) {
                if (b instanceof Integer) {
                    value[i][j] =  (T)(Integer) r.nextInt(MAX);
                    memory[i][j] =  value[i][j];
                }
            }
        }
    }
    
    public void reset(){
        for(int i=0;i<set;i++)
            for(int j=0;j<numperset;j++)
                value[i][j]= memory[i][j];
    }

    public void swap(int s, int a, int b) {
        T temp = value[s][a];
        value[s][a] = value[s][b];
        value[s][b] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < set; i++) {
            for (int j = 0; j < numperset-1; j++) {
                swap(i, j, getMinIndex(i, j));
            }
        }
    }

    public int getMinIndex(int s, int start) {
        int currentindex = start;
        T min = value[s][start];
        for (int i = start + 1; i < value[s].length; i++) {
            if (min.compareTo(value[s][i])> 0) {
                currentindex = i;
                min = value[s][i];
            }
//            System.out.println(i);
        }
        return currentindex;
    }

    public void bubbleSort() {
        for (int s = 0; s < set; s++) {
            for (int iteration = 0; iteration < value[s].length - 1; iteration++) {
                for (int i = 0; i < value[s].length - 1 - iteration; i++) {
                    if (value[s][i].compareTo(value[s][i + 1]) > 0) {
                        swap(s, i, i + 1);
                    }
                }
            }
        }
    }

    public void insertionSort() {
        for (int s = 0; s < set; s++) {
            for (int n = 1; n < numperset; n++) {
                T min = value[s][n];
                int index = 0;
                for (int i = 0; i < n; i++) {
                    if (value[s][i].compareTo(min) > 0) {
                        swap(s, n, i);
                        index = i;
                        break;
                    }
                }
                for (int i = index + 1; i < n; i++) {
                    swap(s, i, n);
                }
            }
        }
    }

    public void mergeSort() {
        for (int i = 0; i < set; i++) {
            mergeSort(i, 0, value.length - 1);
        }
    }

    public void mergeSort(int s, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(s, first, middle);
            mergeSort(s, middle + 1, last);
            merge(s, first, middle, middle + 1, last);
        }
    }

    public void merge(int s, int leftfirst, int leftlast, int rightfirst, int rightlast) {
        int index = leftfirst;
        int start = leftfirst;
        T[] temp = (T[]) new Comparable[numperset];
        while (leftfirst <= leftlast && rightfirst <= rightlast) {
            if (value[s][leftfirst].compareTo(value[s][rightfirst]) > 0) {
                temp[index] = value[s][rightfirst];
                rightfirst++;
            } else {
                temp[index] = value[s][leftfirst];
                leftfirst++;
            }
            index++;
        }
        while (leftfirst <= leftlast) {
            temp[index] = value[s][leftfirst];
            index++;
            leftfirst++;
        }
        while (rightfirst <= rightlast) {
            temp[index] = value[s][rightfirst];
            index++;
            rightfirst++;
        }

        for (int i = start; i <= rightlast; i++) {
            value[s][i] = temp[i];
        }
    }

    public void quickSort() {
        for (int i = 0; i < set; i++) {
            quickSort(i, 0, value.length - 1);
        }
    }

    public void quickSort(int s, int first, int last) {
        if (first < last) {
            int splitindex = split(s, first, last);
            quickSort(s, first, splitindex - 1);
            quickSort(s, splitindex + 1, last);
        }
    }

    public int split(int s, int first, int last) {
        int partitionindex = first;
        T pivot = value[s][first];
        for (int i = first + 1; i <= last; i++) {
            if (pivot.compareTo(value[s][i]) > 0) {
                partitionindex++;
                swap(s, partitionindex, i);
//                System.out.println(partitionindex);
            }
        }
        swap(s,first,partitionindex);
        return partitionindex;
    }
    
    public void showTest(){
        for(int i=0;i<set;i++){
            for(int j=0;j<numperset;j++){
                System.out.print(value[i][j]+" ");
            }
        System.out.println("");}
    }
}
