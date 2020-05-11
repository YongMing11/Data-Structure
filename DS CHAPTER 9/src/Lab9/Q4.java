/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q4 {

    public static void main(String[] args) {
        ArrayHashTableHashing<String, String> a = new ArrayHashTableHashing<>();
        try {
            Scanner sc = new Scanner(new FileInputStream("lab9Q4.txt"));
            while (sc.hasNext()) {
                String str = sc.nextLine();
//                System.out.println(str.substring(0, 5));
//                System.out.println(str.substring(6));
                a.put(str.substring(0,5), str.substring(6));
            }
            String[] key = {"10544","10863"};
            for(int i=0;i<key.length;i++){
            System.out.println("the data set from the File");
            a.showHashTable();
            System.out.println("The Hash Table size is "+a.getSize());
            System.out.println("Enter a PID to search : "+key[i]);
            if(a.containsKey(key[i])){
                System.out.println("Product ID : "+key[i]+" "+a.get(key[i]));
                System.out.println("Location : "+a.getIndex(key[i]));
            }else{
                System.out.println("Product ID : "+key[i]+" cannot be found");
            }
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
