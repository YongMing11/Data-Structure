/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial5;

/**
 *
 * @author Forge-15 1650
 */
public class Q4 {

    public static void main(String[] args) {
        System.out.println("Fib(" + 1 + "): " + fib(1));
        System.out.println("Fib(" + 5 + "): " + fib(5));
        System.out.println("Fib(" + 8 + "): " + fib(8));
        System.out.println("Fib(" + 14 + "): " + fib(14));
    }

    public static int fib(int index) {
        Stack<Integer> a = new Stack<>();
        a.push(1);
        int pp = 1;
        a.push(1);
        int p = 1;
        if (index == 0 || index == 1) {
            return a.peek();
        } else {
            for (int i = 2; i < index; i++) {
                a.push(p + pp);
                pp = p;
                p = a.peek();
            }

            return a.peek();
        }
    }
}
