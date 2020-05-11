/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        int a[]= new int[10];
        System.out.print("The random numbers are : ");
        for(int i=0;i<10;i++){
            a[i]=r.nextInt(101);
            System.out.print(a[i]+" ");
        }
        System.out.println("\n\nInsert the random numbers at the back of the linked list");
        LinkedList<Integer> back = new LinkedList<>();
        for(int i=0;i<a.length;i++){
            back.add(a[i]);
        }
        System.out.print(back.toString());
        
        System.out.println("\n\nInsert the random numbers in front of the linked list");
        LinkedList<Integer> front = new LinkedList<>();
        for(int i=0;i<a.length;i++){
            front.insertFront(a[i]);
        }
        System.out.println(front.toString());
        
        System.out.println("\nInsert the random numbers in a sorted linked list");
        LinkedList<Integer> sort = new LinkedList<>();
        for(int i=0;i<a.length;i++){
            sort.addSortNode(a[i]);
        }
        System.out.println(sort.toString());
        
    }
}
