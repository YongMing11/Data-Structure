/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create a text file log with maximum record equal to ");
        int s = sc.nextInt();
        TextFileLog<String>a =new TextFileLog<>(s);
        a.getsize();
        String[] b = {"James","Ahmad","Siti","Ramesh","John"};
        a.set(b);
        System.out.println("");
        System.out.println("Adding another record");
        a.full();
        a.search("Siti");
        a.delete();
        a.getsize();
    }
}
