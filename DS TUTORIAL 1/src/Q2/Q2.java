/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("The sentence is: ");
        String s = sc.nextLine();
        Sentence a = new Sentence(s);
        System.out.println("The length of the sentence : "+ a.length());
        System.out.println("The number of vowels : "+ a.vowel());
        System.out.println("The number of words : "+ a.word());

    }
}
