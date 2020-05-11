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
public class Q1d {

    public static void main(String[] args) {
        System.out.println(convertor(111, 0, 0));
//        System.out.println(convertor(21, 0, 0));;
    }

    public static int convertor(int decimal, int binary, int counter) {

        if (decimal == 0) {
            return binary;
        } else {
            binary += (decimal % 10) * (int) Math.pow(2, counter);
            counter++;
            return convertor(decimal / 10, binary, counter);
        }

    }
}
