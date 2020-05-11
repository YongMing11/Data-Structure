/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL4;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {
    public static void main(String[] args) {
        LinkedList<Integer> note = new LinkedList<>();
        note.addNode(100);
        note.addNode(50);
        note.addNode(20);
        note.addNode(10);
        note.addNode(5);
        note.addNode(1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        int input = sc.nextInt();
        System.out.println("Total amount: "+input);
        LinkedList<Integer> a = new LinkedList<>();
        a.addNode(input/100);
        input = input%100;
        a.addNode(input/50);
        input = input%50;
        a.addNode(input/20);
        input = input%20;
        a.addNode(input/10);
        input = input%10;
        a.addNode(input/5);
        input = input%5;
        a.addNode(input/1);

        for(int i=0;i<a.length();i++){
            System.out.println("MYR "+note.get(i)+" : "+a.get(i));        
        }
        
    }
}
