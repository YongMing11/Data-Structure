/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial9;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class SearchTest<T extends Comparable<T>> {

    private int size;
    private int max = 20;
    private int charMax = 26;
    private T[] value;

    public SearchTest(T a, int size) {
        this.size = size;
        value = (T[]) new Comparable[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            if (a instanceof Integer) {
                value[i] = (T) (Integer) r.nextInt(max + 1);
            } else if (a instanceof Character) {
                char c = (char) ('A' + r.nextInt(charMax));
                value[i] = (T) (Character) (c);
            } else if (a instanceof Double) {
                value[i] = (T) (Double) (0.01 * r.nextInt(max + 1));
            } else {
                value[i] = (T) ("" + ('A' + r.nextInt(charMax)));
            }
        }
    }

    public void showTest() {
        for (int i = 0; i < size; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println("");
    }

    public boolean linearSearchContain(T element) {
        for (T i : value) {
            if (i.compareTo(element) == 0) {
                return true;
            }
        }
        return false;
    }

    public int linearSearchCount(T element) {
        int count = 0;
        for (T i : value) {
            if (i.compareTo(element) == 0) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Integer> linearSearchIndex(T element) {
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (value[i].compareTo(element) == 0) {
                index.add(i);
            }
        }
        return index;
    }

    public boolean linearSearchRange(T first, T last) {
        for (T i : value) {
            if (i.compareTo(first) >= 0 && i.compareTo(last) <= 0) {
                return true;
            }
        }
        return false;
    }

    public int linearSearchRangeCount(T first, T last) {
        int count = 0;
        for (T i : value) {
            if (i.compareTo(first) >= 0 && i.compareTo(last) <= 0) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Integer> linearSearchRangeIndex(T first, T last) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {
            if (value[i].compareTo(first) >= 0 && value[i].compareTo(last) <= 0) {
                a.add(i);
            }
        }
        return a;
    }

    public boolean binarySearchContain(T element) {
        return binarySearchContain(0, value.length - 1, element);
    }

    public boolean binarySearchContain(int start, int end, T element) {
        int middle = (start + end) / 2;
        if (start > end) {
            return false;
        }
        if (element.compareTo(value[middle]) < 0) {
            return binarySearchContain(start, middle - 1, element);
        } else if (element.compareTo(value[middle]) > 0) {
            return binarySearchContain(middle + 1, end, element);
        } else {
            return true;
        }
    }

    public int binarySearchCount(T element) {
        int count = 0;
        int index = binarySearchCount(0, value.length - 1, element);
        if (index != -1) {
            for (int i = index; i >= 0 && value[i].equals(element); i--) {
                count++;
            }
            for (int i = index + 1; i < value.length && value[i].equals(element); i++) {
                count++;
            }
        }
        return count;
    }

    public int binarySearchCount(int start, int end, T element) {
        int middle = (start + end) / 2;
        if (start > end) {
            return -1;
        }
        if (element.compareTo(value[middle]) < 0) {
            return binarySearchCount(start, middle - 1, element);
        } else if (element.compareTo(value[middle]) > 0) {
            return binarySearchCount(middle + 1, end, element);
        } else {
            return middle;
        }
    }
    public int binarySearchCountRange(T element1,T element2) {
        int count = 0;
        int index = binarySearchCountRange(0, value.length - 1, element1,element2);
        if (index != -1) {
            for (int i = index; i >= 0 && value[i].compareTo(element1)>=0 && 
                   value[i].compareTo(element2)<=0 ; i--) {
                count++;
            }
            for (int i = index + 1; i < value.length && value[i].compareTo(element1)>=0 && 
                   value[i].compareTo(element2)<=0; i++) {
                count++;
            }
        }
        return count;
    }

    public int binarySearchCountRange(int start, int end, T element1,T element2) {
        int middle = (start + end) / 2;
        if (start > end) {
            return -1;
        }
        if (element2.compareTo(value[middle]) < 0) {
            return binarySearchCountRange(start, middle - 1, element1,element2);
        }else if (element1.compareTo(value[middle]) > 0) {
            return binarySearchCountRange(middle + 1, end, element1,element2);
        } else {
            return middle;
        }
    }

    public ArrayList<Integer> binarySearchIndex(T element) {
        ArrayList<Integer> index = new ArrayList<>();
        int i = binarySearchCount(0, value.length - 1, element);
        if (i != -1) {
            for (int j = i; j >= 0 && value[j].equals(element); j--) {
                i = j;
            }
            for (int j = i; j < value.length && value[j].equals(element); j++) {
                index.add(j);
            }
        }
        return index;
    }
    public ArrayList<Integer> binarySearchIndexRange(T element1,T element2) {
        ArrayList<Integer> index = new ArrayList<>();
        int i = binarySearchCountRange(0, value.length - 1, element1,element2);
        if (i != -1) {
            for (int j = i; j >= 0 && value[j].compareTo(element1)>=0
                    && value[j].compareTo(element2)<=0; j--) {
                i = j;
            }
            for (int j = i; j < value.length && value[j].compareTo(element1)>=0
                    && value[j].compareTo(element2)<=0; j++) {
                index.add(j);
            }
        }
        return index;
    }

    public boolean binarySearchContainRange(T element1, T element2) {
        return binarySearchContainRange(0, value.length - 1, element1,element2);
    }

    public boolean binarySearchContainRange(int start, int end, T element1,T element2) {
        int middle = (start + end) / 2;
        if (start > end) {
            return false;
        }
        if (value[middle].compareTo(element2) > 0) {
            return binarySearchContainRange(start, middle - 1, element1,element2);
        }else if (value[middle].compareTo(element1) < 0) {
            return binarySearchContainRange(middle + 1, end, element1,element2);
        } else {
            return true;
        }
    }
    
    

    public void swap(int a, int b) {
        T temp = value[a];
        value[a] = value[b];
        value[b] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < value.length - 1; i++) {
            swap(i, getMinIndex(i));
        }
    }

    public int getMinIndex(int start) {
        int index = start;
        T min = value[start];
        for (int i = start + 1; i < value.length; i++) {
            if (value[i].compareTo(min) < 0) {
                min = value[i];
                index = i;
            }
        }
        return index;
    }

}
