/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q2 {

    static ArrayList<String> x = new ArrayList<>();

    public static void main(String[] args) {
        try {
            PrintWriter p = new PrintWriter(new FileOutputStream("output.txt"));
            p.println("My name is Yong Ming");
            p.println("I love UM");
            p.println("UM is one");
            p.close();
            Scanner sc = new Scanner(new FileInputStream("output.txt"));
            readline(sc);
            sc.close();
            PrintWriter pp = new PrintWriter(new FileOutputStream("input.txt"));
            for (String i : x) {
                pp.println(i);
            }
            pp.close();
        } catch (IOException e) {
            System.err.println("output error!!!");
        }
    }

    public static void readline(Scanner sc) {
        if (sc.hasNext()) {
            String s = sc.nextLine();
            readline(sc);
            x.add(s);
        } else {
            return;
        }
    }
}
