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
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Double> a = new LinkedList<>();
        a.addNode(23.1);
        a.addNode(36.5);
        a.addNode(12.8);
        a.addNode(42.6);
        a.addNode(32.8);
        System.out.println("The number in the linked list");
        a.showList();
        System.out.println("\nThe number in the linked list after updated");
        a.operation(20);
        a.showList();
    }
    
}
