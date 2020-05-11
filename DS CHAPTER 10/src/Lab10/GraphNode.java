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
public class GraphNode<V extends Comparable<V>,E> {
    private V vertice;
    private GraphNode verticelink;
    private E edgelink;
    private boolean marked;

    public GraphNode(V vertice, GraphNode verticelink) {
        this.vertice = vertice;
        this.verticelink = verticelink;
        this.edgelink = null;
        this.marked = false;
    }

    public V getVertice() {
        return vertice;
    }

    public void setVertice(V vertice) {
        this.vertice = vertice;
    }

    public GraphNode getVerticelink() {
        return verticelink;
    }

    public void setVerticelink(GraphNode verticelink) {
        this.verticelink = verticelink;
    }

    public E getEdgelink() {
        return edgelink;
    }

    public void setEdgelink(E edgelink) {
        this.edgelink = edgelink;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    @Override
    public String toString() {
        return vertice + " --> ";
    }
    
    
    
    
}
