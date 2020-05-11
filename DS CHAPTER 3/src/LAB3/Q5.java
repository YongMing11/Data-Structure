/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q5 {

    public static int index = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (index < 5) {

//            System.out.println(index);
        getInput(index);
//        }

    }

    static int[] a = new int[5];

    public static void getInput(int index2) {

        Scanner sc = new Scanner(System.in);

        try {
            
            if (!(index2 > a.length)) {
                System.out.print("Enter an integer: ");
                a[index2] = sc.nextInt();
//                index2 = index2 + 1;
                getInput(++index2);
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array of integers is: ");
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println("");
            
        } catch (InputMismatchException ime) {
            System.out.println("Invalid input type");
            getInput(index2);
        }
    }
}