/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

import java.util.Iterator;

/**
 *
 * @author Forge-15 1650
 */
public class Q5 {

    public static void main(String[] args) {
        System.out.print("The list consists of ");
        LinkedList<String> a = new LinkedList<>();
        a.add("ARS");
        a.add("AST");
        a.add("CHE");
        a.add("LEI");
        a.add("MAN");
        a.add("LIV");
        a.add("TOT");
        System.out.print(a.toString());
        System.out.println("\nRemove all the word that consists of the A character using iterator.");
        System.out.print("The updated list consists of ");
        int i = 0;
        while (i < a.length()) {
            if (a.get(i).contains("A")) {
                a.deleteNodeByPosition(i);
            } else {
                i++;
            }

        }

        System.out.print(a.toString());

    }

}
