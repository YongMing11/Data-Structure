/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q5 {

    public static void main(String[] args) {
        check("test1.xml");
        check("test2.xml");
        check("test3.xml");
        check("test4.xml");
//        check("C:/Users/Forge-15 1650/Documents/NetBeansProjects/Data-Structure/DS CHAPTER 5/Test1.txt");
    }

    public static void check(String filename) {
        System.out.println("Contents of XML file");
        try {
            Scanner sc = new Scanner(new FileInputStream("filename"));
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            Stack<String> Diamond = new Stack<>();
            Stack<String> WithoutDiamond = new Stack<>();
            sc = new Scanner(filename);
            String r = sc.nextLine();
            Diamond.push(r);
            WithoutDiamond.push("/" + r.substring(1, r.length()));
            while (sc.hasNext()) {
                r = sc.nextLine();
                r.replaceAll("<", ">");
                String[] s = r.split(">");
                if (s.length < 3) {
                    if (WithoutDiamond.peek().equals(s[1])) {
                        System.out.println("The xml document is valid.");
                    }
                } else {
                    if (!(s[1].contains("/"))) {
                        if (!(s[1].equals(WithoutDiamond.peek()))) {
                            System.out.println("Begin Element : " + WithoutDiamond.pop()
                                    + " Invalid ending element : <" + s[1] + ">");
                            break;
                        }
                    } else {
                        WithoutDiamond.push("/" + s[1]);
                        Diamond.push(s[1]);
                    }
                    if (s[3].contains("/")) {
                        if (s[3].equals(WithoutDiamond.peek())) {
                            Diamond.pop();
                            WithoutDiamond.pop();
                        } else {
                            System.out.println("Begin Element : " + WithoutDiamond.pop()
                                    + " Invalid ending element : <" + s[3] + ">");

                        }
                    }

                }
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
}
