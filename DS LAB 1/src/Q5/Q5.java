/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q5;

/**
 *
 * @author Forge-15 1650
 */
public class Q5 {
    public static void main(String[] args) {
        TextFile a = new TextFile();
        BinaryFile b = new BinaryFile();
        System.out.println("Write to text file");
        a.write();
        System.out.println("Read from text file");
        a.read();
        System.out.println("Write to binary file");
        b.write();
        System.out.println("Read from binary file");
        b.read();
    }
}
