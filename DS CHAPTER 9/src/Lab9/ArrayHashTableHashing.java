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
public class ArrayHashTableHashing<K, V> {

    private K[] key;
    private V[] value;
    private int max = 20;

    public ArrayHashTableHashing() {
        this.key = (K[]) new Comparable[max];
        this.value = (V[]) new Comparable[max];
    }

    public V put(Comparable<K> k, V v) {
        int index = Integer.parseInt(k.toString()) % max;
        for (int i = index; i < max; i++) {
            if (key[i] == null) {
                index = i;
                break;
            }
        }
        key[index] = (K) k;
        V temp = value[index];
        value[index] = (V) v;
        return temp;
    }

    
    //Khai
//     public V put(Comparable<K> k, V v) {
//        int index = Integer.parseInt(k.toString())%max;
//        int i = 0;
//        while(key[(index+i)%max]!= null && i<max){
////            System.out.println(index+i);
//            if(k.compareTo(key[(index+i)%max])==0){
//                V temp = value[(index+i)%max];
//                value[(index+i)%max] = v;
//                return temp;
//            }
//            i++;
//        }
////        System.out.println(i);
////        System.out.println(index+i);
////        System.out.println((index+i)%MAX);
//        if(i == max){
//            System.out.println("The Hash Table is full");
//            return null;
//        }else{
////            System.out.println(k);
////            System.out.println(v);
//            key[(index+i)%max] = (K)k;
//            value[(index+i)%max] = v;
//            return null;
//        }
//    }

    public V remove(Comparable<K> k) {
        int index = Integer.parseInt(k.toString()) % max;

        for (int i = index; i < max; i++) {
            if (k.compareTo(key[i]) == 0) {
                key[i] = null;
                V temp = value[i];
                value[i] = null;
                return temp;
            }
        }
        return null;
    }

    public int getSize() {
        int count = 0;
        for (int i = 0; i < max; i++) {
            if (key[i] != null) {
                count++;
            }
        }
        return count;
    }

    public V get(Comparable<K> k) {
        int index = Integer.parseInt(k.toString()) % max;
        for (int i = index; i < max; i++) {
            if (k.compareTo(key[i]) == 0) {
                return value[i];
            }
        }
        return null;
    }

    public int getIndex(Comparable<K> k) {
        int index = Integer.parseInt(k.toString()) % max;
        for (int i = index; i < max; i++) {
            if (k.compareTo(key[i]) == 0) {
                return i;
            }
        }
        return (Integer) null;
    }

    public void showHashTable() {
        for (int i = 0; i < max; i++) {
            if (key[i] != null) {
                System.out.println(key[i] + " : " + value[i]);
            }
        }
    }

    public boolean containsKey(Comparable<K> k) {
        int index = Integer.parseInt(k.toString()) % max;
        for (int i = index; i < max && key[i]!=null; i++) {
            if (k.compareTo(key[i]) == 0) {
                return true;
            }
        }
        return false;
    }


}
