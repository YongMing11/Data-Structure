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
public class Q2 {

    public static void main(String[] args) {
        System.out.print("Enter a word : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        LinkedList<Character> ori = new LinkedList<>();
        for (int i = 0; i < a.length(); i++) {
            ori.add(a.charAt(i));
        }
        System.out.print("The original list : " + ori.toString());

        System.out.println("\nSplit the list in two");
        ori.splitList();

        System.out.println("Split the list by alternating the nodes");
        ori.alternateList();

        System.out.println("Merge Fist List and Second List by alternating the nodes");
        ori.mergeList();

        System.out.println("Reverse the list. Recursive method in the LinkedList");
        LinkedList<Character> re = ori.reverse();
        System.out.println(re);

        System.out.println("Reverse the list. Recursive method in tester class");
        LinkedList<Character> r = new LinkedList<>();
        int counter = 0;
        reverse(counter, re, r);
    }

    public static void reverse(int counter, LinkedList<Character> a, LinkedList<Character> r) {
        if (counter < a.length()) {
            r.insertFront(a.get(counter));
            reverse(counter + 1, a, r);
        } else {
            System.out.println(r.toString());
//            System.out.println(counter);
        }
    }
}
