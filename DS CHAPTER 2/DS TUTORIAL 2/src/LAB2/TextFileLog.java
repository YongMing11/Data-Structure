/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;

/**
 *
 * @author Forge-15 1650
 */
public class TextFileLog<T extends Comparable<T>> implements SimpleLog<T> {

    private T[] t;

    public TextFileLog(int s) {
        ArrayList<String> x = new ArrayList<>(s);
        //???how to create a fixed index generic array
        t = (T[]) new Comparable[s];
    }

    public void set(T[] x) {
        for (int i = 0; i < x.length; i++) {
            t[i] = (T) x[i];
            System.out.println(t[i]);
        }
    }

    public void full() {
        boolean check = true;
        for (T i : t) {
            
            if (i==null) { //i.equals(null) is wrong because havent define, no content can be used to compare
                System.out.println("The log is not full");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("The log is full");
        }
    }

    public void getsize() {
        int counter = 0;
        if (t != null) {
            for (T i : t) {
                counter++;
            }
        } else {
            counter = 0;
        }
        System.out.println("Text File Log Size " + counter);
    }

    public void search(String s) {
        System.out.println("Searching for " + s + " in the file");
        String x = "";
        for (T i : t) {
            x += i;
        }
        if (x.contains(s)) {
            System.out.println("Text File Log contains " + s);
        } else {
            System.out.println("Text File Log does not contain " + s);
        }
    }

    public void delete() {
        t = null;
        System.out.println("Clear the text file log");
    }

    public void display() {
        for (T i : t) {
            System.out.println(i);
        }
    }

}
