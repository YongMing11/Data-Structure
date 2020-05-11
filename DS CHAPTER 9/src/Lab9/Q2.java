/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> a = new LinkedList<>(1, 10);
        System.out.print("The random integers are : ");
        a.showList();
        System.out.println("");
        System.out.println("Linear Search");
        System.out.print("Enter a number to search : ");
        String in = sc.nextLine();
        int input = Integer.parseInt(in);
        if (a.contains(input)) {
            System.out.println(input + " is found");
            System.out.println("The number of " + input + " in the data set is "
                    + a.count(input));
        } else {
            System.out.println(input + " is not found");
        }

        System.out.print("Enter two numbers to search (begin end) : ");
        in = sc.nextLine();
        String[] str = in.split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);
        if (a.contains(start,end)) {
            System.out.println("The number can be found in between "+start+
                    " and "+end);
            System.out.println("The number of the elements in between "+start+
                    " and "+end+" in the data set is "+a.count(start, end));
        } else {
            System.out.println("No integer can be found in between "+start+
                    " and "+end);
        }
    }
}
