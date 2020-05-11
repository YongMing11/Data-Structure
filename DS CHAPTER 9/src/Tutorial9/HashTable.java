/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial9;

/**
 *
 * @author Forge-15 1650
 */
public class HashTable<K, V> {

    private MapNode head;
    private int size = 0;

    public HashTable() {
        this.head = null;
    }

    public void showTable() {
        MapNode currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.toString());
            currentnode = currentnode.getLink();
        }
    }

    public V put(Comparable<K> key, Comparable<V> value) {
        MapNode newnode = new MapNode(key, value, null);
        size++;
        if (head == null) {
            head = newnode;
        } else {
            MapNode currentnode = head;
            MapNode previousnode = null;
            while (currentnode != null) {
                if (key.compareTo((K) currentnode.getKey()) == 0) {
                    V temp = (V) currentnode.getValue();
                    currentnode.setValue(value);
                    return temp;
                } else {
                    previousnode = currentnode;
                    currentnode = currentnode.getLink();
                }
            }
            if (previousnode == null) {
                head.setLink(newnode);
            } else {
                previousnode.setLink(newnode);
            }
        }
        return null;
    }

    public V remove(Comparable<K> key) {
        if (head == null) {
            return null;
        } else {
            size--;
            MapNode currentnode = head;
            MapNode previousnode = null;
            while (currentnode != null) {
                if (key.compareTo((K) currentnode.getKey()) == 0) {
                    V temp = (V) currentnode.getValue();
                    if (previousnode == null) {
                        head = head.getLink();
                    } else {
                        previousnode.setLink(currentnode.getLink());
                    }
                    return temp;
                } else {
                    previousnode = currentnode;
                    currentnode = currentnode.getLink();
                }
            }
            return null;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean containsKey(Comparable<K> key) {
        MapNode currentnode = head;
        while (currentnode != null) {
            if (key.compareTo((K) currentnode.getKey()) == 0) {
                return true;
            }
            currentnode = currentnode.getLink();
        }
        return false;
    }

    public boolean containsValue(Comparable<V> value) {
        MapNode currentnode = head;
        while (currentnode != null) {
            if (value.compareTo((V) currentnode.getValue()) == 0) {
                return true;
            }
            currentnode = currentnode.getLink();
        }
        return false;
    }

    public V get(Comparable<K> key) {
        MapNode currentnode = head;
        while (currentnode != null) {
            if (key.compareTo((K) currentnode.getKey()) == 0) {
                return (V)currentnode.getValue();
            }
            currentnode = currentnode.getLink();
        }
        return null;
    }

}
