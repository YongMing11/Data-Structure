/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Creating a graph with 7 vertices and 6 edges");
        Graph<Character, Integer> a = new Graph<>();
        for (int i = 0; i < 7; i++) {
            a.addVertice((char) ('A' + i));
        }
        a.addEdge('A', 'B',1);
        a.addEdge('A', 'C',1);
        a.addEdge('B', 'D',1);
        a.addEdge('B', 'E',1);
        a.addEdge('C', 'F',1);
        a.addEdge('F', 'G',1);
        a.showGraph();
        System.out.println("Find the path from A to G");
        System.out.print("The path is : ");
        a.findPath('A', 'G');
    }
    
}
