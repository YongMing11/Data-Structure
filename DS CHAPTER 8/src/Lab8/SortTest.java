/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class SortTest<T extends Comparable<T>> {

    private final int MAX = 101;
    public int SIZE;
    private T[] data;
    private int[] PID;
    private double[] price;
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    private int orderType;

    public SortTest(int orderType, T type) {
        this.orderType = orderType;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        if (type instanceof Integer) {
            SIZE = sc.nextInt();
            data = (T[]) new Comparable[SIZE];
            for (int i = 0; i < SIZE; i++) {
                if (type instanceof Integer) {
                    data[i] = (T) (Integer) r.nextInt(MAX);
                }
            }
        } else if (type instanceof String) {
            try {
                Scanner s = new Scanner(new FileInputStream("lab8Q2.txt"));
                int i = 0;
                while (s.hasNext()) {
                    s.nextLine();
                    i++;
                }
                s.close();
                data = (T[]) new Comparable[i];
                s = new Scanner(new FileInputStream("lab8Q2.txt"));
                i = 0;
                while (s.hasNext()) {
                    data[i] = (T) s.nextLine();
                    String c = ((String) data[i]).replaceAll(",", ":");
                    data[i] = (T) c;
                    i++;
                }
                s.close();
                PID = new int[i];
                price = new double[i];
                i = 0;
                for (T x : data) {
                    String str = (String) x;
                    str = str.replaceAll(" ", "");
                    String[] t = str.split(":");
//                    for(String q:t){
//                        System.out.println(q);
//                    }
                    String temp = t[0].substring(1);
                    for (int j = 0; j < temp.length(); j++) {
                        PID[i] = ((int) temp.charAt(j)) + PID[i] * 10;
                    }
                    price[i] = Double.parseDouble(t[2]);
                    i++;
                }

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }
    }

    public void swap(int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

        int temp1 = PID[index1];
        PID[index1] = PID[index2];
        PID[index2] = temp1;
        double temp2 = price[index1];
        price[index1] = price[index2];
        price[index2] = temp2;
    }

    public void mergeSort() {
        mergeSort(0, data.length - 1);
    }

    public void mergeSort(int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(first, middle);
            mergeSort(middle + 1, last);
//            merge(first, middle, middle + 1, last);
            mergeOddEven(first, middle, middle + 1, last);
        }
    }

    public void mergeOddEven(int leftfirst, int leftlast, int rightfirst, int rightlast) {
        T[] temp = (T[]) new Comparable[SIZE];
        int index = leftfirst;
        int startingindex = leftfirst;
        while (leftfirst <= leftlast && rightfirst <= rightlast) {
            if (((Integer) data[leftfirst] % 2 == 0 && (Integer) data[rightfirst] % 2 != 0 && orderType == ASCENDING)
                    || ((Integer) data[leftfirst] % 2 != 0 && (Integer) data[rightfirst] % 2 == 0 && orderType == DESCENDING)) {
                temp[index] = data[rightfirst];
                rightfirst++;
            } else if (((Integer) data[leftfirst] % 2 != 0 && (Integer) data[rightfirst] % 2 == 0 && orderType == ASCENDING)
                    || ((Integer) data[leftfirst] % 2 == 0 && (Integer) data[rightfirst] % 2 != 0 && orderType == DESCENDING)) {
                temp[index] = data[leftfirst];
                leftfirst++;
            } else if ((data[leftfirst].compareTo(data[rightfirst]) < 0 && orderType == ASCENDING)
                    || (data[leftfirst].compareTo(data[rightfirst]) > 0 && orderType == DESCENDING)) {
                temp[index] = data[leftfirst];
                leftfirst++;
            } else {
                temp[index] = data[rightfirst];
                rightfirst++;
            }
            index++;
        }

        while (leftfirst <= leftlast) {
            temp[index] = data[leftfirst];
            index++;
            leftfirst++;
        }
        while (rightfirst <= rightlast) {
            temp[index] = data[rightfirst];
            index++;
            rightfirst++;
        }

        for (int i = startingindex; i <= rightlast; i++) {
            data[i] = temp[i];
        }
    }

    public void merge(int leftfirst, int leftlast, int rightfirst, int rightlast) {
//        System.out.println("leftfirst " + leftfirst);
//        System.out.println("leftlast " + leftlast);
//        System.out.println("rightfirst " + rightfirst);
//        System.out.println("rightlast " + rightlast);
        T[] temp = (T[]) new Comparable[SIZE];
        int startingindex = leftfirst;
//        for(T i: data){
//            System.out.println(i+" ");
//        }
//        System.out.println(leftfirst);
//        System.out.println(rightfirst);
        int index = leftfirst;
        while (leftfirst <= leftlast && rightfirst <= rightlast) {
//        System.out.println(data[leftfirst]);
//        System.out.println(data[rightfirst]);
            if ((data[leftfirst].compareTo(data[rightfirst]) < 0 && orderType == ASCENDING)
                    || (data[leftfirst].compareTo(data[rightfirst]) > 0 && orderType == DESCENDING)) {
                temp[index] = data[leftfirst];
                leftfirst++;
            } else {
                temp[index] = data[rightfirst];
                rightfirst++;
            }
            index++;
        }

        while (leftfirst <= leftlast) {
            temp[index] = data[leftfirst];
            index++;
            leftfirst++;
        }
        while (rightfirst <= rightlast) {
            temp[index] = data[rightfirst];
            index++;
            rightfirst++;
        }

        for (int i = startingindex; i <= rightlast; i++) {
            data[i] = temp[i];
        }

    }

    public void showTest() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    public void showTest2() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public void quickSort() {
        quickSort(0, data.length - 1);
    }

    public void quickSort(int first, int last) {
        if (first < last) {
//            System.out.println("f "+first +" l "+last);
            int splitIndex = split(first, last);
//            System.out.println(first+" . "+(splitIndex-1));
            quickSort(first, splitIndex - 1);
//            System.out.println((splitIndex+1)+" "+last);
            quickSort(splitIndex + 1, last);
        }
    }

    public int split(int first, int last) {
//        showTest2();
//        System.out.println("");
        double pivot = price[first];
        int pivot2 = PID[first];
        int partitionindex = first;
        for (int i = first + 1; i <= last; i++) {
            if (pivot > price[i] && orderType == ASCENDING) {
                partitionindex++;
                swap(i, partitionindex);
            } else if (pivot == price[i]) {
                if (pivot2 > PID[i]) {
                    partitionindex++;
                    swap(i, partitionindex);
                }
            }
        }
//        System.out.println("f"+ first);
//        System.out.println("p"+ partitionindex);
        swap(first, partitionindex);
        return partitionindex;
    }
}
