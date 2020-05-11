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
public class Edge<E> {

    private GraphNode verticelink; //the node added to connect with the vertice
    private E weight;
    private Edge edgelink;

    public Edge(GraphNode verticelink, E weight, Edge edgelink) {
        this.verticelink = verticelink;
        this.weight = weight;
        this.edgelink = edgelink;
    }

    public GraphNode getVerticelink() {
        return verticelink;
    }

    public void setVerticelink(GraphNode verticelink) {
        this.verticelink = verticelink;
    }

    public Edge getEdgelink() {
        return edgelink;
    }

    public void setEdgelink(Edge edgelink) {
        this.edgelink = edgelink;
    }

    public E getWeight() {
        return weight;
    }

    public void setWeight(E weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return " -> " + verticelink.getVertice() + " : " + weight;
    }
    public String toPathString() {
        return verticelink.getVertice()+" --> ";
    }

}
