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
public class Q5 {

    public static void main(String[] args) {
        balance("(())");
        balance(")()(");
        balance("((())())()");
        balance("(())()))");
        balance("())");
    }

    public static void balance(String s) {
        Stack<Character> a = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                a.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                Character x = a.pop();
//                System.out.println(x);
                if (x == null) {
                    System.out.println(s + " is not balanced");
                    return;
                }
            }
        }
        if (a.peek() == null) {
            System.out.println(s + " is balanced");
        } else {
            System.out.println(s + " is not balanced");
        }
    }
}
