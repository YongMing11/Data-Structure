/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

/**
 *
 * @author Forge-15 1650
 */
import java.util.ArrayList;

public class Q3 {

    public static void main(String[] args) {
        per("5520");
    }

    public static void per(String input) {
        per("", input);
    }
    static ArrayList<String> list = new ArrayList<>();

    public static void per(String addedString, String in) {
        if (in.isEmpty()) {
            if (!list.contains(addedString)) {
                list.add(addedString);
                System.out.println(addedString);

            }
        } else {
            for (int i = 0; i < in.length(); i++) {
                
                String newStr = addedString + in.charAt(i);
                String newIn = in.substring(0,i)+in.substring(i+1, in.length());
                per(newStr,newIn);
            }
        }
    }
}
