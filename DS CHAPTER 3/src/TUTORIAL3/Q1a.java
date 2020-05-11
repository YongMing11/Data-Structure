/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL3;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class Q1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int[] a = new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt(20);
            System.out.print(a[i]+" ");
        }
        
        System.out.println("\nMin: "+smallest(a,0,20));
    }

    public static int smallest(int b[], int counter,int min) {
        while (counter < 10) {
            if(min>b[counter]){
                min = b[counter];
            }
            counter++;
            smallest(b,counter,min);
        } 
            return min;
        
    }
}
