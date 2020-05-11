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
public class Q5 {
    public static void main(String[] args) {
        LinkedList <Integer> a = new LinkedList<>();
        System.out.println("Linked List has 15 node(s)");
//        a.addNode(4);
//        a.addNode(4);
//        a.addNode(5);
//        a.addNode(4);
        for(int i=0;i<15;i++){
        a.addNode(a.generate());
        }
        a.showList();
        System.out.println("\nDelete the number 4 from the list.");
        a.deleteAllNode(4);
        System.out.println("\nLinked List has "+a.length()+" node(s)");
        a.showList();
        
    }
}
