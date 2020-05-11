/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SearchTest<Character> a = new SearchTest<>('c', 10);
        System.out.print("The Character data set are : ");
        a.showTest();
        System.out.println("Linear Search");
        System.out.print("Enter a letter to search: ");
        String in = sc.nextLine();
        Character i = in.charAt(0);
        if (a.linearSearchContain(i)) {
            System.out.println(i + " is found");
            System.out.println("The number of "+i+" in the data set is "+a.linearSearchCount(i));
            System.out.print("The location of the " + i + " are : ");
            ArrayList<Integer> index1 = a.linearSearchIndex(i);
            for (int j = 0; j < index1.size(); j++) {
                System.out.print(index1.get(j) + " ");
            }
            System.out.println("");
        } else {
            System.out.println(i + " is not found");
        }
        System.out.print("Enter two letters to search (begin end) : ");
        String str = sc.nextLine();
//        System.out.println(in);
//        System.out.println(in.charAt(0));
//        System.out.println(in.charAt(2));
        Character first = str.charAt(0);
        Character last = str.charAt(2);
        if (a.linearSearchRange(first, last)) {
            System.out.println("The character can be found in between " + first + " and " + last);
            System.out.println("The number of the elements in between A and G in the data set is "
                    + a.linearSearchRangeCount(first, last));
            System.out.print("The location of the elements in between A and G are : ");
            ArrayList<Integer> index = a.linearSearchRangeIndex(first, last);
            for (int j = 0; j < index.size(); j++) {
                System.out.print(index.get(j) + " ");
            }
            System.out.println("");
        } else {
            System.out.println("No character can be found in between " + first + " and " + last);
        }

    }

}
