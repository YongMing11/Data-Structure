/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial9;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {
    public static void main(String[] args) {
        HashTable<String,String> a = new HashTable<>();
        a.put("100-101", "ICND 1");
        a.put("200-101", "ICND 2");
        a.put("200-120", "CCNA Routing and Switching");
        a.put("210-260", "CCNA Security");
        System.out.println("Hash Table");
        System.out.println("The number of elements in the Hash Table "+a.getSize());
        a.showTable();
        System.out.print("\nEnter a code to search : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(a.containsKey(str)){
            System.out.println("Course "+str+" : "+a.get(str));
        }else{
            System.out.println("Course "+str+" cannot be found");        
        }
    
    }
}
