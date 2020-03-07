/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL2;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {

    public static void main(String[] args) {
        Integer[] x = {42, 15, 58};
        Double[] y = {12.45, 41.28, 19.82};
        System.out.print("The maximum value of 42 15 58 is ");
        maximum(x);
        System.out.print("The maximum value of 12.45 41.28 19.82 is ");
        maximum(y);
    }

    public static <T extends Comparable<T>> void maximum(T[] z) {
        if(z instanceof Integer[]){
        Integer max = (Integer)z[0];
        for (int i = 0; i < z.length; i++) {
            Integer compare = (Integer)z[i];
            if ( max.compareTo((Integer)z[i])<0 ) {
                max = (Integer)z[i];
            }
        }
            System.out.print(max+"\n");
        }
        else if(z instanceof Double[]){
        Double max = (Double)z[0];
        for (int i = 0; i < z.length; i++) {
            Double compare = (Double)z[i];
            if ( max.compareTo((Double)z[i])<0 ) {
                max = (Double)z[i];
            }
        }
            System.out.print(max+"\n");
        }
        

    }

}
