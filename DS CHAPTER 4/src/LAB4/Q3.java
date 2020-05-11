/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {
    public static void main(String[] args) {
        System.out.println("The list consist of");
        Course p = new Course("WXX101","Programming",5,'B');
        Course n = new Course("WXX201","Networking",4,'C');
        Course os = new Course("WX3201","Operating System",3,'A');
        Q3LinkedList<Course> a = new Q3LinkedList<>();
        a.add(p);
        a.add(n);
        a.add(os);
        System.out.print(a.toString());
        a.totalPoint();
    }
}
