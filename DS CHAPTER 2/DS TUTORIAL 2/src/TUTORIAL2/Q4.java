/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL2;

/**
 *
 * @author Forge-15 1650
 */
public class Q4 {
    public static void main(String[] args) {
        System.out.println("Array Implementation : Roll 5 time(s)");
        ArrayDice<Integer> a = new ArrayDice<>(5);
        a.number();
        System.out.println(a.toString());
        System.out.println("Array Implementation : Roll 4 time(s)");
        ArrayDice<Integer> b = new ArrayDice<>(4);
        b.number();
        System.out.println(b.toString());
        System.out.println("Linked List Implementation : Roll 3 time(s)");
        LinkedListDice<Integer> c = new LinkedListDice<>(3);
        c.number();
        System.out.println(c.toString());
        System.out.println("Linked List Implementation : Roll 4 time(s)");
        LinkedListDice<Integer> d = new LinkedListDice<>(4);
        d.number();
        System.out.println(d.toString());
    }
}
