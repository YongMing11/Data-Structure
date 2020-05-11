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
public interface ArrayHashTable<K,V> {
    
    public boolean isEmpty();
    public boolean isFull();
    public int getSize();
    public void clear();
    public void showHashTable();
    public boolean containsKey(Comparable<K> k);
    public boolean containsValue(Comparable<V> v);
    public V get(Comparable<K> k);
    public V put(Comparable<K> k, Comparable<V> v);
    public V remove(Comparable<K> k);
    
}
