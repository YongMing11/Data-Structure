/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial10;

import java.util.ArrayList;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {
    public static void main(String[] args) {
        Graph<Character,Double> a = new Graph<>();
        for(int i=0;i<7;i++){
            char c = (char)(((int)'A')+i);
            a.addVertice(c);
//            System.out.println(c);
        }
        a.addEdge('A','B', 0.4);
        a.addEdge('A','C', 0.3);
        a.addEdge('B','C', 0.1);
        a.addEdge('B','D', 0.2);
        a.addEdge('B','E', 0.7);
        a.addEdge('C','F', 0.3);
        a.addEdge('F','G', 0.4);
        System.out.println("Creating a graph with 7 vertices and 7 edges");
        a.showGraph();
        System.out.println("Remove edge from B to C");
        a.deleteEdge('B', 'C');
        a.showGraph();
        System.out.println("The weightage from C to F: "+a.getWeight('C', 'F'));
        System.out.print("The adjacent of B : ");
        ArrayList<Character> b= a.getAdjacent('B');
        for(int i=0;i<b.size();i++){
            System.out.print(b.get(i)+"  ");
        }
        System.out.println("");
    }
}
