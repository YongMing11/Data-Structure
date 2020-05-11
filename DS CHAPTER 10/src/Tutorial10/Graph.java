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
public class Graph<V, E> implements ArrayGraph<V, E> {

    private V[] vertice;
    private E[][] edge;
    private final int max = 20;

    public Graph() {
        this.vertice = (V[]) new Comparable[max];
        this.edge = (E[][]) new Comparable[max][max];
    }

    @Override
    public boolean isEmpty() {
        return (vertice[0] == null);
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVerticeSize() {
        int i = 0;
        for (i = 0; i < vertice.length && vertice[i] != null; i++);
        return i;
    }

    @Override
    public void clear() {
        vertice = null;
        edge = null;
    }

    @Override
    public void addVertice(V v) {
        for (int i = 0; i < vertice.length; i++) {
            if (vertice[i] == null) {
                vertice[i] = v;
//                System.out.println(vertice[i]);
                break;
            }
        }
    }

    @Override
    public boolean hasVertice(Comparable<V> v) {
        for (int i = 0; i < vertice.length; i++) {
            if (v.compareTo(vertice[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addEdge(Comparable<V> from, Comparable<V> to, E weight) {
        if (!hasVertice(from) || !hasVertice(to)) {
            return false;
        }
        int source = 0;
        int destination = 0;
        for (int i = 0; i < vertice.length && vertice[i]!=null ; i++) {
//            System.out.println(i);
            if (from.compareTo(vertice[i]) == 0) {
                source = i;
            } else if (to.compareTo(vertice[i]) == 0) {
                destination = i;
            }
        }
        edge[source][destination] = weight;
        return true;
    }

    @Override
    public boolean deleteEdge(Comparable<V> from, Comparable<V> to) {
        if (!hasVertice(from) || !hasVertice(to)) {
            return false;
        }
        int source = 0;
        int destination = 0;
        for (int i = 0; i < vertice.length && vertice[i]!=null; i++) {
            if (from.compareTo(vertice[i]) == 0) {
                source = i;
            } else if (to.compareTo(vertice[i]) == 0) {
                destination = i;
            }
        }
        edge[source][destination] = null;
        return true;
    }

    @Override
    public boolean isEdge(Comparable<V> from, Comparable<V> to) {
        if (!hasVertice(from) || !hasVertice(to)) {
            return false;
        }
        int source = 0;
        int destination = 0;
        for (int i = 0; i < vertice.length; i++) {
            if (from.compareTo(vertice[i]) == 0) {
                source = i;
            } else if (to.compareTo(vertice[i]) == 0) {
                destination = i;
            }
        }
        return (edge[source][destination] != null);
    }

    @Override
    public E getWeight(Comparable<V> from, Comparable<V> to) {
        if (!hasVertice(from) || !hasVertice(to)) {
            return null;
        }
        int source = 0;
        int destination = 0;
        for (int i = 0; i < vertice.length && vertice[i]!=null; i++) {
            if (from.compareTo(vertice[i]) == 0) {
                source = i;
            } else if (to.compareTo(vertice[i]) == 0) {
                destination = i;
            }
        }
        return (edge[source][destination]);
    }

    @Override
    public void markVertice(Comparable<V> v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isMarked(Comparable<V> v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList getAdjacent(Comparable<V> v) {
        ArrayList<Character> a = new ArrayList<>();
        int index = 0;
        for(int i=0;i<vertice.length;i++){
            if(v.compareTo(vertice[i])==0){
            index =i;
            break;
            }
        }
        for(int destination=0;destination<edge[index].length;destination++){
            if(edge[index][destination]!=null){
                a.add((Character)vertice[destination]);
            }
        }
        return a;
    }

    public void showGraph() {
        for (int source = 0; source < edge.length && vertice[source] != null; source++) {
            System.out.println(vertice[source] + " -->");
            for (int i = 0; i < edge[source].length; i++) {
                if (edge[source][i] != null) {
                    System.out.print(" -> " + vertice[i] + " : " + edge[source][i]);
                }
            }
            System.out.println("");
        }
    }

}
