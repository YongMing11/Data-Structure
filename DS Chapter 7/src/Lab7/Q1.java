/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {
    public static void main(String[] args) {
        int[] tester = {5,16,19,18,16,17,9,0,1,9};
        BST<Integer> bst = new BST<>();
        Random r = new Random();
        int [] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]= r.nextInt(21);
        }
        System.out.print("The random numbers are ");
        for(int i: tester){
            System.out.print(i+" ");
            bst.addNode(i);
        }
        System.out.println("");
        System.out.println("The number of elements in the tree "+bst.getSize());
        bst.setOrder(bst.PREORDER);
        System.out.print("The tree elements - PREORDER : ");
        bst.Q.showQueue();
        System.out.println("");
        bst.setOrder(bst.INORDER);
        System.out.print("The tree elements - INORDER : ");
        bst.Q.showQueue();
        System.out.println("");
        bst.setOrder(bst.POSTORDER);
        System.out.print("The tree elements - POSTORDER : ");
        bst.Q.showQueue();
        System.out.println("");
        System.out.println("The minimum number is : "+bst.minimum());
        System.out.println("The maximum number is : "+bst.maximum());
        System.out.println("The total is : "+bst.getTotal());
        System.out.print("Enter a number to search : ");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        System.out.println("The number of occurence of "+ search+" is "+bst.getOccurence(search));
    }
}
