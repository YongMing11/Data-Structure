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
public class Q3HashTable<K, V> implements ArrayHashTable<K, V> {

    private K[] key;
    private V[] value;

    public Q3HashTable() {
        key = (K[]) new Comparable[20];
        value = (V[]) new Comparable[20];
    }

    @Override
    public boolean isEmpty() {
        return (value[0] == null);
    }

    @Override
    public boolean isFull() {
        return (value[value.length - 1] != null);
    }

    @Override
    public int getSize() {
        int size = 0;
        if (isEmpty()) {
            return size;
        }
        while (key[size] != null) {
            size++;
        }
        return size;
    }

    @Override
    public void clear() {
        key = (K[]) new Comparable[20];
        value = (V[]) new Comparable[20];
    }

    @Override
    public void showHashTable() {
        for (int i = 0; i < key.length - 1 && key[i] != null; i++) {
            System.out.print(key[i] + " : " + value[i] + " | ");
        }
    }

    @Override
    public boolean containsKey(Comparable<K> k) {
        for (int i = 0; i < key.length && key[i] != null; i++) {
            if (k.compareTo((K) key[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Comparable<V> v) {
        for (int i = 0; i < value.length && value[i] != null; i++) {
            if (v.compareTo(value[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Comparable<K> k) {
        for (int i = 0; i < key.length && key[i] != null; i++) {
            if (k.compareTo((K) key[i]) == 0) {
                return value[i];
            }
        }
        return null;
    }

    @Override
    public V put(Comparable<K> k, Comparable<V> v) {
        int index =0;
        if(isEmpty()){
            key[0]=(K)k;
            value[0]=(V)v;
            return null;
        }
        for (int i = 1; i < key.length && key[i] != null; i++) {
            if (k.compareTo((K) key[i]) == 0) {
                V temp = value[i];
                value[i] = (V)v;
                return temp;
            }
            index = i;
        }
        key[index+1]=(K)k;
        value[index+1]=(V)v;
        return null;
    }

    @Override
    public V remove(Comparable<K> k) {
        if(!containsKey(k)){
        return null;
        }else{
            V temp = null;
            int i = 0;
            for(i=0;i<key.length && key[i]!=null;i++){
                if(k.compareTo(key[i])==0){
                    temp = value[i];
                    break;
                }
            }
            for(int j=i;j<key.length && key[j]!=null;j++){
                key[j]=key[j+1];
                value[j]=value[j+1];
            }
            return temp;
        }
    }

}
