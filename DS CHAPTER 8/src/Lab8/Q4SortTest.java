/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q4SortTest<T extends Comparable<T>> {

    private T[] data;
    private int orderType;
    private int SIZE;
    private final int MAX = 26;
    public static final int ASCENDING =1;
    public static final int DESCENDING =2;

    public Q4SortTest(int orderType, T type) {
        this.orderType = orderType;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        if (type instanceof Character) {
            SIZE = sc.nextInt();
            data = (T[]) new Comparable[SIZE];
            for (int i = 0; i < SIZE; i++) {
                if (type instanceof Character) {
                    data[i] = (T) (('A' + r.nextInt(MAX)) + "");
                }
            }
        }
    }

    public void swap(int a, int b) {
        T temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    public void HeapSort() {
        int last = data.length - 1;
        while(last>0){
        int index = last;
        T max = data[last];
        for (int i = 0; i < last; i++) {
            if (data[i].compareTo(max) > 0 && orderType==ASCENDING) {
                index = i;
                max = data[i];
            }
        }
        swap(last, index);
        last--;
        }
    }
    
    public void showTest(){
        for(T i: data){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
