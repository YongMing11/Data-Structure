/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class SearchTest<T extends Comparable<T>> {

    private T[][] value;
    private int size;

    public SearchTest(T type, int size) {
        Random r = new Random();
        this.size = size;
        value = (T[][]) new Comparable[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (type instanceof Integer) {
                    value[i][j] = (T) (Integer) (r.nextInt(10)+10);
                }
            }
        }
    }

    public void showTest() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (value[i][j].equals(element)) {
                    return true;
                }
            }
        }
        return false;
    }
    public int linearSearchCount(T element) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (value[i][j].equals(element)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public ArrayList<ArrayList<Integer>> linearSearchIndex(T element){
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (value[i][j].equals(element)) {
                    a.add(new ArrayList<Integer>());
                    a.get(count).add(i);
                    a.get(count).add(j);
                    count++;
                }
            }
        }
        return a;
    } 

}
