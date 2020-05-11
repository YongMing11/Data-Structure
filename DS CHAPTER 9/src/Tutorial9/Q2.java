/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        SearchTest<Integer> a = new SearchTest<>(1,10);
        System.out.print("The Integer data set are : ");
        a.selectionSort();
        a.showTest();
        System.out.println("Binary Search");
        System.out.print("Enter a number to search: ");
        String in = sc.nextLine();
        int input = Integer.parseInt(in);
        if(a.binarySearchContain(input)){
            System.out.println(input+" is found");
            System.out.println("The number of "+input+" in the data set is "+a.binarySearchCount(input));
            System.out.print("The location of "+input+" are : ");
            ArrayList<Integer> index = a.binarySearchIndex(input);
            for(int i=0;i<index.size();i++){
                System.out.print(index.get(i)+" ");
            }
            System.out.println("");
        }else{
            System.out.println(input+" is not found");
        }
        System.out.print("Enter two numbers to search (begin end) : ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        Integer first = Integer.parseInt(arr[0]);
        Integer last = Integer.parseInt(arr[1]);
        if(a.binarySearchContainRange(first, last)){
            System.out.println("The integer can be found in between "+first+" and "+last);
            System.out.println("The number of the elements in between "+first+" and "+last
                    +" in the data set is "+a.binarySearchCountRange(first, last));
            System.out.print("The location of the elements in between "+first+
                    " and "+last+" are : ");
            ArrayList<Integer> index = a.binarySearchIndexRange(first, last);
            for(int i=0;i<index.size();i++){
                System.out.print(index.get(i)+" ");
            }
            System.out.println("");
        }else{
        System.out.println("No integer can be found in between "+first+" and "+last);
            }
    }
}
