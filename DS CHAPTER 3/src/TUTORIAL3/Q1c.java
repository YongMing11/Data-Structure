/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL3;

/**
 *
 * @author Forge-15 1650
 */
public class Q1c {

    public static void main(String[] args) {

        System.out.println(GCD(12, 8));
    }

    public static int GCD(int x, int y) {
        if (y != 0) {
//            GCD(x, y);
            return x % y;
        } else {
            return 0;
        }

    }
}
