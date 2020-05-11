/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q2 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream("lab6Q2.txt"));
            String str = "";

            while (sc.hasNext()) {
                str += sc.nextLine();
                str += " ";
            }
            sc.close();

            Queue<String> code = new Queue<>();
            String[] s = str.split(" ");
            for (int i = 0; i < s.length; i += 2) {
                if (!code.contains(s[i])) {
                    code.enqueue(s[i]);
                }
            }
            System.out.print("Product Code in Queue : ");
            code.showQueue();
            System.out.println("");
            System.out.println("List of product by categories");

            Queue<String>[] product = new Queue[code.getSize()];
            int count = 0;
            while (!code.isEmpty()) {
                String c = code.dequeue();
                product[count] = new Queue<>();
                for (int i = 0; i < s.length; i += 2) {
//                    System.out.println(s[i]);
                    if (c.equals(s[i])) {
//                    System.out.println(s[i+1]);
                        product[count].enqueue(s[i + 1]);
                    }
                }
                System.out.println("Product : " + c);
                product[count].showQueue();
                System.out.println("");
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
