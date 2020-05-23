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
public class Q2 {
    public static void main(String[] args) {
        Integer[]num={3,2,5, 0, 1};
        Character[]letter = {'P','I','V','C','D'};
        SpecialEncoding<Integer>a = new SpecialEncoding<>(num);
        System.out.println(a.toString());
        SpecialEncoding<Character>b = new SpecialEncoding<>(letter);
        System.out.println(b.toString()); 
    }
}
