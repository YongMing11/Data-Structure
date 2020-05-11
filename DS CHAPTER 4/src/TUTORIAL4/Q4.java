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
public class Q4 {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.addNode(23);
        a.addNode(15);
        a.addNode(17);
        a.addNode(28);
        a.addNode(12);
        a.addNode(40);
        a.showList();
        System.out.println("\nLinked List has "+a.length()+" node(s)");
        System.out.println("Total is "+a.sum());
        System.out.println("Total even number is "+a.even());
    }
}
