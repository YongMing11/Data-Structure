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
public class Q1e {

    public static void main(String[] args) {
        System.out.println(sumofcubes(3));
    }
 public static int sumofcubes(int n) {
        return sumofcubes(n,0,0);
    }
    public static int sumofcubes(int n, int index, int sum) {
        if (index == n) {
            return sum;
        } else {
            index++;
            sum += Math.pow(index, 3);
            return sumofcubes(n, index, sum);
        }

    }
}
