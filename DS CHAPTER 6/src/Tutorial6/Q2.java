/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial6;

/**
 *
 * @author Forge-15 1650
 */
public class Q2 {

    public static void main(String[] args) {
        System.out.println("Queue Implementation using Array");
        Queue<Character> a = new Queue<>();
        System.out.println("Enqueue three nodes");
        a.enqueue('B');
        a.enqueue('M');
        a.enqueue('W');
        a.showQueue();
        
        System.out.println("\nDequeue one node");
        a.dequeue();
        a.showQueue();
        
        System.out.println("\nThe front node of the queue is " + a.peek());
        
        System.out.println("The queue size is " + a.getSize());
    }
}
