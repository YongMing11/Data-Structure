/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q7 {
    public static void main(String[] args) {
        System.out.print("Enter a sentence : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        CircularLinkedListQ7<String> q7 = new CircularLinkedListQ7<>();
        for(String i: a){
            q7.addCircularNode(i);
        }
        System.out.println("\nThe words in the circular linked list");
        q7.showCircularList();
        System.out.println("\nAfter delete a word");
        q7.deleteCircularNode();
        q7.showCircularList();
        System.out.println("\nThe second item in the list is "+q7.getCircularItem(1));
    }
}
