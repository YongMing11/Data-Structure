/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {

    public static void main(String[] args) {
        Q3HashTable<String, String> a = new Q3HashTable<>();
        a.put("100-101", "ICND 1");
        a.put("200-101", "ICND 2");
        a.put("200-120", "CCNA Routing and Switching");
        a.put("210-260", "CCNA Security");
        System.out.println("The number of course is "+a.getSize());
        a.showHashTable();
        System.out.println("\nAdding a new course");
        a.put("300-101", "ROUTE");
        System.out.println("The number of course is "+a.getSize());
        a.showHashTable();
        System.out.println("\nModifying 210-260");
        a.put("210-260", "CCNA RS Security");
        System.out.println("The number of course is "+a.getSize());
        a.showHashTable();
        System.out.println("\nRemove the course 200-101");
        a.remove("200-101");
        System.out.println("The number of course is "+a.getSize());
        a.showHashTable();
        String key = "210-260";
        System.out.println("\nEnter a course code to search : "+key);
        if(a.containsKey(key)){
            System.out.println("Course "+key+" : "+a.get(key));
        }else{
            System.out.println("Course "+key+" cannot be found");
        }
    }
}
