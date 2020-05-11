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
public class Q4 {

    public static void main(String[] args) {
        String[] str = {"kayak", "Welcome", "Was it a car or a cat I saw?",
            "civic", "race car"};
        for (String s : str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new Queue<>();
            for (int i = 0; i < s.length(); i++) {
                stack.push(s.charAt(i));
                queue.enqueue(s.charAt(i));
            }
            while(!(stack.isEmpty())){
                if(!Character.isAlphabetic(stack.peek())){
                    stack.pop();
                }
                String a = stack.pop().toString();
                String b = queue.dequeue().toString();
                if(!a.equalsIgnoreCase(b)){
                    System.out.println(s+ " is not a palindrome.");
                    break;
                }
            }
            if(stack.isEmpty())
            System.out.println(s+ " is a palindrome.");
        }
    }
}
