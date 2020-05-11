/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class TextFile {
        public void write() {
        try {
            System.out.println("Write to binary file");
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            out.println("Welcome to FSKTM!");
            System.out.println("Welcome to FSKTM!");

            out.println("Please register your matric number.");
            System.out.println("Please register your matric number.");

            out.println("Please register your UMMail account.");
            System.out.println("Please register your UMMail account.");

            out.close();

        } catch (IOException e) {
            System.out.println("Problem in writing binary file");
        };

    }

    public void read() {
        try {
            Scanner in = new Scanner(new FileInputStream("data.txt"));
            while (in.hasNext()) {
                String read = in.nextLine();
                System.out.println(read);
            }
            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("File is not found!");
        } 
    
}
}