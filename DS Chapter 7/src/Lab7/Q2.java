/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q2 {
    public static void main(String[] args) {
        try{
            System.out.println("Word Frequency Generator Program");
            Scanner sc = new Scanner(new FileInputStream("lab7Q2.txt"));
            String str = sc.nextLine();
            str = str.replaceAll("[^a-zA-Z0-9\\s]", "");
            str = str.toLowerCase();
            String[] arr = str.split(" ");
            BST<String> bst = new BST<>();
            for(String i: arr){
                bst.addNode(i);
            }
            bst.fGenerator();
            bst.Q2.Q2showQueue();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
