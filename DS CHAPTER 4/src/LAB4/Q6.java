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
public class Q6 {
    public static void main(String[] args) {
        Random r = new Random();
        DoubleLinkedList<Integer> a = new DoubleLinkedList<>();
        System.out.print("The random numbers are : ");
        for(int i=0;i<10;i++){
            int x = r.nextInt(101);
            System.out.print(x+" ");
            a.addRightNode(x);            
        }
        System.out.println("\nInsert the random numbers into the doubly linked list");
        a.showList();
        System.out.println("\nRemove anumber from the third position");
        a.deleteNodeByPosition(2);
        a.showList();
        System.out.println("\nReplace the number in seventh position with 999");
        a.deleteNodeByPosition(6);
        a.addNodeByPosition(999,6);
        a.showList();
        System.out.println("\nRemove all even number from the doubly linked list");
        a.removeEvenNumber();
        a.showList();
    }
}
