/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {

    public static void main(String[] args) {
        System.out.println("Mesh Topology");
        System.out.println("There are 4 switches in the campus");
        System.out.println("The total number of connections required is "+connection(4));
        System.out.println("There are 21 switches in the campus");
        System.out.println("The total number of connections required is "+connection(7));
    }
    public static int connection(int n){
        return n*(n-1)/2;
    }
//    public static int connection(int n) {
//        return connection(n, n-1)/2;
//    }
//
//    public static int connection(int n, int index) {
//        if (index<=n) {
//            return (n* connection(n - 1, index));
//        }else return 1;
//    }

}
