/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {
    public static void main(String[] args) {
        UNOARRAY<Integer> a = new UNOARRAY<>(7);
        System.out.println("Array Implementation");
        System.out.println("Player 1 draws 7 times");
        a.draw();
        System.out.println(a.toString());
        UNOARRAY<Integer> b = new UNOARRAY<>(7);
        System.out.println("Array Implementation");
        System.out.println("Player 2 draws 7 times");
        b.draw();
        System.out.println(b.toString());
        System.out.println("");
        UNOLINKEDLIST<Integer> c = new UNOLINKEDLIST<>(7);
        System.out.println("Linked List Implementation");
        System.out.println("Player 1 draws 7 times");
        c.draw();
        System.out.println(c.toString());
        UNOLINKEDLIST<Integer> d = new UNOLINKEDLIST<>(7);
        System.out.println("Linked List Implementation");
        System.out.println("Player 2 draws 7 times");
        d.draw();
        System.out.println(d.toString());
      
    }
}
