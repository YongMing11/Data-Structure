/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int input = sc.nextInt();
        SearchTest<Integer> a = new SearchTest<>(1,input);
        System.out.println("The matrix are : ");
        a.showTest();
        System.out.println("");
        System.out.println("Linear Search");
        System.out.print("Enter a number to search : ");
        input = sc.nextInt();
        if(a.contains(input)){
            System.out.println(input+" is found");
            System.out.println("The number of "+input+" in the matrix is "
                    +a.linearSearchCount(input));
            System.out.print("The location of "+input+" are :");
            ArrayList<ArrayList<Integer>> index = a.linearSearchIndex(input);
            for(int i=0;i<index.size();i++){
                System.out.print("["+index.get(i).get(0)+","+index.get(i).get(1)
                +"] ");
            }
            System.out.println("");
        }else{
            System.out.println(input+" is not found");
        }
    }
}
