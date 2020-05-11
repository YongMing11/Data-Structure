/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Forge-15 1650
 */
public class BinaryFile implements FileIO {

    String x;

    public void write() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("binary.txt"));
            out.writeUTF("Welcome to FSKTM!");
            System.out.println("Welcome to FSKTM!");

            out.writeUTF("Please register your matric number.");
            System.out.println("Please register your matric number.");

            out.writeUTF("Please register your UMMail account.");
            System.out.println("Please register your UMMail account.");

            out.close();

        } catch (IOException e) {
            System.out.println("Problem in writing binary file");
        };

    }

    public void read() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("binary.txt"));
            try{
                while (true) {
                String read = in.readUTF();
                System.out.println(read);
            }
            }
         catch (EOFException e) {}
            in.close();
        } catch (IOException e) {
            System.out.println("File is not found!");
        }

    }

}
