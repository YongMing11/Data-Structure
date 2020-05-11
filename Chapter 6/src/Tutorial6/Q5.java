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
public class Q5 {

    public static void main(String[] args) {
        String[] str = {"Was it a car or a cat I saw?", "?civic#", "race car",
            "redrawer", "put     it up"};
        int j = 0;
        for (String s : str) {
            s = s.replaceAll(" ", "");
            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new Queue<>();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.charAt(i))) {
                    stack.push(s.charAt(i));
                    queue.enqueue(s.charAt(i));
                }
            }
            while (!(stack.isEmpty())) {
                String a = stack.pop().toString();
                String b = queue.dequeue().toString();
                if (!a.equalsIgnoreCase(b)) {
                    System.out.println(str[j] + " is not a palindrome.");
                    break;
                }
            }
            if (stack.isEmpty()) {
                System.out.println(str[j] + " is a palindrome.");
            }
            j++;
        }
    }
}
