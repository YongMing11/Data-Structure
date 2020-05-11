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
public class SortTest<T extends Comparable<T>> {

    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    private final int MAX = 100;
    private final int MAXCHAR = 26;
    private final int SIZE = 10;
    private T[] value;
    private Random r;
    private int orderType, size;

    public SortTest(int a, T b) {
        orderType = a;
        value = (T[]) new Comparable[SIZE];
        r = new Random();
        char c;
        for (int i = 0; i < SIZE; i++) {
            if (b instanceof Integer) {
                value[i] = (T) (Integer) r.nextInt(MAX);
            } else if (b instanceof Double) {
                value[i] = (T) (Double) (0.01 * r.nextInt(MAX));
            } else if (b instanceof Character) {
                c = (char) ('A' + r.nextInt(MAXCHAR));
                value[i] = (T) (Character) c;
            } else {
                String str = "";
                c=' ';
                for (int charlength = 0; charlength < 8; charlength++) {
                    c = (char) ('a' + r.nextInt(MAXCHAR));
                    str+=c;
                }
                value[i] = (T) (str);
            }
        }
    }

    public void swap(int index1, int index2) {
        T temp = value[index1];
        value[index1] = value[index2];
        value[index2] = temp;
    }

    public void showValue() {
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println("");
    }

    public void selectionSort() {
        for (int i = 0; i < value.length - 1; i++) {
//            System.out.println(value[i]+" "+value[getMinIndex(i)]);
            swap(i, getMinIndex(i));
        }
    }

    public int getMinIndex(int start) {
        T temp = value[start];
        int index = start;
        start++;
        for (int i = start; i < value.length; i++) {
            if (value[i].compareTo(temp) < 0 && orderType == ASCENDING) {
                index = i;
                temp = value[i];
            } else if (value[i].compareTo(temp) > 0 && orderType == DESCENDING) {
                index = i;
                temp = value[i];
            }
        }
        return index;
    }

    public void bubbleSort() {
        for (int iteration = 0; iteration < value.length - 1; iteration++) {
            for (int i = 0; i < value.length - 1 - iteration; i++) {
                if (value[i].compareTo(value[i + 1]) > 0 && orderType == ASCENDING) {
                    swap(i, i + 1);
                } else if (value[i].compareTo(value[i + 1]) < 0 && orderType == DESCENDING) {
                    swap(i, i + 1);
                }
            }
        }
    }

    public void insertionSort() {
        int j;
        for (int i = 1; i < value.length; i++) {
            for (j = 0; j < i; j++) {
                if (value[i].compareTo(value[j]) < 0 && orderType == ASCENDING) {
                    swap(i, j);
                    break;
                } else if (value[i].compareTo(value[j]) > 0 && orderType == DESCENDING) {
                    swap(i, j);
                    break;
                }
            }
            for (int a = j + 1; a < i; a++) {
                swap(i, a);
//every swap will put the value at i position to original position before insertion
            }
        }
    }

    public void mergeSort() {
        mergeSort(0, value.length - 1);
    }

    public void mergeSort(int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(first, middle);
            mergeSort(middle + 1, last);
            merge(first, middle, middle + 1, last);
        }
    }

    public void merge(int leftfirst, int leftlast, int rightfirst, int rightlast) {
        T[] temp = (T[]) new Comparable[SIZE];
        boolean correctplace;
        int index = leftfirst;
        int currentindex = leftfirst;
        while ((leftfirst <= leftlast) && (rightfirst <= rightlast)) {
            if ((value[leftfirst].compareTo(value[rightfirst]) < 0 && orderType == ASCENDING)
                    || (value[leftfirst].compareTo(value[rightfirst]) > 0 && orderType == DESCENDING)) {
                temp[index] = value[leftfirst];
                leftfirst++;
            } else {
                temp[index] = value[rightfirst];
                rightfirst++;
            }
            index++;
        }
        //上面留下的都是比前面都大（ASCENDING）/都小(DESCENDING)
        //接下来就是把他们剩下的放进去temp array (左右边其中一边会剩下)
        while (leftfirst <= leftlast) {
            temp[index] = value[leftfirst];
            leftfirst++;
            index++;
        }
        while (rightfirst <= rightlast) {
            temp[index] = value[rightfirst];
            rightfirst++;
            index++;
        }
        //把temp[] 放进去 value[]
        for (int i = currentindex; i <= rightlast; i++) {
            value[i] = temp[i];
        }
    }

    public void quickSort() {
        quickSort(0, value.length - 1);
    }

    public void quickSort(int first, int last) {
        if (first < last) {
//            System.out.println("first " + value[first]);
//            System.out.println("last " + value[last]);
            int splitindex = split(first, last);
            quickSort(first, splitindex - 1);
            quickSort(splitindex + 1, last);
        }
    }

//    public int split(int first, int last) {
//        boolean correctSide;
//        T splitvalue = value[first];
//        int index = first;
//        first++;
//        while (first <= last) {
//            correctSide = true;
//            while (correctSide) {
//                if ((splitvalue.compareTo(value[first]) < 0 && orderType == ASCENDING)
//                        || (splitvalue.compareTo(value[first]) >= 0 && orderType == DESCENDING)) {
//                    correctSide = false;
//                } else {
//                    first++;
//                    if (first <= last) {
//                        correctSide = true;
//                    } else {
//                        correctSide = false;
//                    }
//                }
//            }
//            if (first <= last) {
//                correctSide = true;
//            } else {
//                correctSide = false;
//            }
//
//            while (correctSide) {
//                if ((splitvalue.compareTo(value[last]) >= 0 && orderType == ASCENDING)
//                        || (splitvalue.compareTo(value[last]) < 0 && orderType == DESCENDING)) {
//                    correctSide = false;
//                } else {
//                    last--;
//                    if (first <= last) {
//                        correctSide = true;
//                    } else {
//                        correctSide = false;
//                    }
//                }
//
//            }
//        if(first<last){
//            swap(first,last);
//            first++;
//            last--;
//        }
//        }
//        swap(index,last);
//        return last;
//    }
    public int split(int first, int last) {
        int index = first;
        /*cannot use index =first+1, because 
if the last element didnt enter if statement,
the index has extra one, hence
it will swap the pivot with the element supposed to be right side*/
        T pivot = value[first];
        for (int i = first + 1; i < last; i++) {
//            System.out.println(i);
//            System.out.println(last);
            if ((value[i].compareTo(pivot) > 0 && orderType == DESCENDING)
                    || (value[i].compareTo(pivot) < 0 && orderType == ASCENDING)) {
                index++;
                swap(i, index);
            }
        }
        if ((value[last].compareTo(pivot) > 0 && orderType == DESCENDING)
                || (value[last].compareTo(pivot) < 0 && orderType == ASCENDING)) {
            index++;
            swap(last, index);
        }
//        System.out.println(index);
        swap(first, index);
        return index;
    }

}
