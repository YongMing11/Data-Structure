/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL3;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {

    public static void main(String[] args) {
//        writeLine('$', 3);
        writeBlock('$', 3, 2);
    }

    public static void writeLine(char x, int number) {
        if (number > 0) {
            System.out.print(x);
            number--;
            writeLine(x, number);
        }

    }

    public static void writeBlock(char x, int number, int line) {
        if (line > 0) {
            writeLine(x,number);
            line--;
            System.out.println("");
            writeBlock(x, number, line);
        }
    }
}
