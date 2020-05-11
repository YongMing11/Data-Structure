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
public class Q3 {

    public static void main(String[] args) {
        String input = "Software-defined networking (SDN) teachnology is an "
                + "approach to network management";
        System.out.println("Enter a sentence : " + input);
        System.out.println("Original Sentence : " + input);
        System.out.print("The sentence in reverse order : ");
        Q3Stack<Character> s = new Q3Stack<>();
        for (int i = 0; i < input.length(); i++) {
            s.push(input.charAt(i));
        }
        s.showStack();
        System.out.print("\nThe word in reverse order : ");
        Q3Stack<String> w = new Q3Stack<>();
        String[] word = input.split(" ");
        for (int i = 0; i < word.length; i++) {
            w.push(word[i]+" ");
        }
        w.showStack();
    }
}
