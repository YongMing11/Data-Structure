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
public class Q5ArrayHashTableHashing<K , V> {

    private Q5LinkedList<K>[] key;
    private Q5LinkedList<V>[] value;
    private int max = 20;
    private int size = 0;

    public Q5ArrayHashTableHashing() {
        this.key =  new Q5LinkedList[max] ;
        this.value =  new Q5LinkedList[max];
    }

    public void put(K k, V v) {
        size++;
        int index = Integer.parseInt(k.toString()) % max;
        if (key[index] == null) {
            key[index] = new Q5LinkedList<>();
            value[index] = new Q5LinkedList<>();
        }
        key[index].add((K) k);
        value[index].add((V) v);
    }

    public V remove(K k) {
        int index = Integer.parseInt(k.toString()) % max;
        value[index].remove(key[index].getIndex(k));
        key[index].remove(key[index].getIndex(k));
        return null;
    }
    public int getSize() {
        return size;
    }

    public V get(K k) {
        int index = Integer.parseInt(k.toString()) % max;
        if (key[index].contains(k)) {
            int iL = key[index].getIndex(k);
            return value[index].get(iL);
        }
        return null;
    }

    public int getIndex(K k) {
        return Integer.parseInt(k.toString()) % max;
    }

    public void showHashTable() {
        for (int i = 0; i < max; i++) {
            if (key[i] != null) {
                for (int j = 0; j < key[i].getSize(); j++) {
                    System.out.println(key[i].get(j) + " : "
                            + value[i].get(j));
                }
            }
        }
    }

    public void showSameLocation(K k) {
        int i = getIndex(k);
        if (key[i] != null) {
            for (int j = 0; j < key[i].getSize(); j++) {
                System.out.print(key[i].get(j) + " : "
                        + value[i].get(j)+" --> ");
            }
            System.out.println("");
        }

    }

    public boolean containsKey(K k) {
        int index = Integer.parseInt(k.toString()) % max;
        if (key[index].contains(k)) {
            return true;
        }
        return false;
    }

}
