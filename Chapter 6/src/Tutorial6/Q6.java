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
public class Q6 {
    public static void main(String[] args) {
        String str = "A queue is a First In First Out (FIFO) data structure.";
        System.out.println("Enter a sentence : "+str);
        String[] s = str.split(" ");
        Queue<String> a = new Queue<>();
        for(String i: s){
            a.enqueue(i);
        }
        System.out.print("The original queue : ");
        a.showQueue();
        System.out.print("\nReverse all the elements in the queue : ");
        a.reverseShowQueue();
    }
}
