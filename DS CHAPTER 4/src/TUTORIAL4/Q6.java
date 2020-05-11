/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL4;

/**
 *
 * @author Forge-15 1650
 */
public class Q6 {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.insertFront(78);
        a.insertFront(45);
        a.insertFront(34);
        a.insertFront(23);
        a.insertFront(17);
        a.insertFront(10);
        a.insertFront(8);
        a.showList();
        System.out.println("\nThe median is "+a.median());
    }
}
