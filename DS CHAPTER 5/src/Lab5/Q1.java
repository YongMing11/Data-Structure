/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.ArrayList;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {

    public static void main(String[] args) {
        Stack<String> a = new Stack<>();
        System.out.println("The candies in the container:");
        a.push("Orange");
        a.push("Red");
        a.push("Blue");
        a.push("Orange");
        a.push("Yellow");
        a.push("Yellow");
        a.push("Blue");
        a.showStack();
        System.out.println("\nAli takes all the candies one by one from "+
                "the container and eats the blue ones.");
        ArrayList<String> list = new ArrayList<>();
        for (int i = a.getSize(); i >= 0; i--) {
            if (a.contains("Blue")) {
                if (a.peek().equals("Blue")) {
                    a.pop();
                } else {
                    list.add(0, a.pop());
                }
            }else
                break;
        }
        System.out.println("He puts back the rest of candies in the container.");
        for(String i : list){
            a.push(i);
        }
        System.out.println("The candies in the container: ");
        a.showStack();
        System.out.println("");
    }
}
