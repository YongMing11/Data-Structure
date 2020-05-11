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
public interface ArrayGraph<V,E> {
    
    public boolean isEmpty();
    public boolean isFull();
    public int getVerticeSize();
    public void clear();
    public void addVertice(V v);
    public boolean hasVertice(Comparable<V> v);
    public boolean addEdge(Comparable<V> from, Comparable<V> to, E weight);
    public boolean deleteEdge(Comparable<V> from, Comparable<V> to);
    public boolean isEdge(Comparable<V> from, Comparable<V> to);
    public E getWeight(Comparable<V> from, Comparable<V> to);
    public void markVertice(Comparable<V> v);
    public boolean isMarked(Comparable<V> v);
    public ArrayList getAdjacent(Comparable<V> v);
    
}
