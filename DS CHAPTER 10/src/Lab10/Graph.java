/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10;

import java.util.ArrayList;

/**
 *
 * @author Forge-15 1650
 */
public class Graph<V extends Comparable<V>, E> {

    private GraphNode head;

    public Graph() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int getSize() {
        int count = 0;
        GraphNode currentnode = head;
        while (currentnode != null) {
            count++;
            currentnode = currentnode.getVerticelink();
        }
        return count;
    }

    public void clear() {
        head = null;
    }

    public void showGraph() {
        GraphNode currentnode = head;
        while (currentnode != null) {
            System.out.println(currentnode.getVertice() + " --> ");
            Edge e = (Edge) currentnode.getEdgelink();
            while (e != null) {
                System.out.print(e.toString());
                e = e.getEdgelink();
            }
            System.out.println("");
            currentnode = currentnode.getVerticelink();
        }
    }

    public GraphNode hasVertice(Comparable<V> v) {
        GraphNode currentnode = head;
        while (currentnode != null) {
            if (v.compareTo((V) currentnode.getVertice()) == 0) {
                return currentnode;
            }
            currentnode = currentnode.getVerticelink();
        }
        return null;
    }

    public void addVertice(V a) {
        GraphNode newnode = new GraphNode(a, null);
        GraphNode currentnode = head;
        if (head == null) {
            head = newnode;
            return;
        }
        while (currentnode.getVerticelink() != null) {
            currentnode = currentnode.getVerticelink();
        }
        currentnode.setVerticelink(newnode);
    }

    public boolean addEdge(V from, V to, E weight) {
        if (hasVertice(to) == null || hasVertice(from) == null) {
            return false;
        }
        GraphNode currentnode = head;
        while (currentnode != null) {
            if (currentnode.getVertice().compareTo(from) == 0) {
                GraphNode temp = hasVertice(to);
                Edge newnode = new Edge(temp, weight, null);
                Edge edgenode = (Edge) currentnode.getEdgelink();
                if (edgenode == null) {
                    currentnode.setEdgelink(newnode);
                } else {
                    while (edgenode.getEdgelink() != null) {
                        edgenode = edgenode.getEdgelink();
                    }
                    edgenode.setEdgelink(newnode);
                }
                return true;
            }
            currentnode = currentnode.getVerticelink();
        }
        return false;
    }

    public boolean deleteEdge(V from, V to) {
        GraphNode currentnode = head;
        if (hasVertice(from) == null || hasVertice(to) == null) {
            return false;
        }
        while (currentnode != null) {
            if (currentnode.getVertice().compareTo(from) == 0) {
                GraphNode end = hasVertice(to);
                Edge previousnode = null;
                Edge edgenode = (Edge) currentnode.getEdgelink();
                while (edgenode != null) {
                    if (edgenode.getVerticelink().equals(end)) {
                        if (previousnode == null) {
                            currentnode.setEdgelink(edgenode.getEdgelink());
                        } else {
                            previousnode.setEdgelink(edgenode.getEdgelink());
                        }
                        return true;
                    } else {
                        previousnode = edgenode;
                        edgenode = edgenode.getEdgelink();
                    }
                }
            }
        }
        return false;
    }

    public boolean isEdge(V to, V from) {
        if (hasVertice(to) == null || hasVertice(from) == null) {
            return false;
        }
        GraphNode currentnode = head;
        while (currentnode != null) {
            if (currentnode.getVertice().compareTo(to) == 0) {
                Edge edgenode = (Edge) currentnode.getEdgelink();
                while (edgenode != null) {
                    if (edgenode.getVerticelink().equals(from)) {
                        return true;
                    }
                    edgenode = edgenode.getEdgelink();
                }
                return false;
            }
            currentnode = currentnode.getVerticelink();
        }
        return false;
    }

    public E getWeight(V from, V to) {
        if (isEdge(from, to)) {
            GraphNode currentnode = head;
            while (currentnode != null) {
                if (currentnode.getVertice().compareTo(from) == 0) {
                    Edge edgenode = (Edge) currentnode.getEdgelink();
                    while (edgenode != null) {
                        if (edgenode.getVerticelink().equals(to)) {
                            return (E) edgenode.getWeight();
                        }
                        edgenode = edgenode.getEdgelink();
                    }
                }
                currentnode = currentnode.getVerticelink();
            }
        }
        return null;
    }

    public void findPath(V from, V to) {
        if (hasVertice(to) == null || hasVertice(from) == null) {
            return;
        }
        GraphNode currentnode = head;
        Stack<V> a = new Stack<>();
        while (currentnode != null) {
            if (currentnode.getVertice().compareTo(from) == 0) {
//                a.showStack();
                if (!a.contains(from)) {
                    a.push(from);
                }
                mark(from);
                Edge edgenode = (Edge) currentnode.getEdgelink();
                if (edgenode == null) {
                    a.pop();
                } else {
//                    System.out.println(edgenode.getVerticelink().getVertice());
                    while (getMarked((V) edgenode.getVerticelink().getVertice())) {
                        edgenode = edgenode.getEdgelink();
                        if (edgenode == null) {
                            a.pop();
                            break;
                        }
                    }
                    if (edgenode != null) {
//                        System.out.println("pushpush");
                        mark((V) edgenode.getVerticelink().getVertice());
                        a.push((V) edgenode.getVerticelink().getVertice());
                        if (edgenode.getVerticelink().getVertice().equals(to)) {
                            a.showStack();
                            return;
                        }
                    }
                }
                from = a.peek();
                currentnode = head;
            } else {
                currentnode = currentnode.getVerticelink();
            }
        }

    }

    public void mark(V a) {
        GraphNode currentnode = head;
        while (currentnode != null) {
            if (currentnode.getVertice().compareTo(a) == 0) {
                currentnode.setMarked(true);
            }
            currentnode = currentnode.getVerticelink();
        }
    }

    public boolean getMarked(V a) {
        if (a == null) {
            return false;
        }
        GraphNode currentnode = head;
        while (currentnode != null) {
            if (currentnode.getVertice().compareTo(a) == 0) {
                return currentnode.isMarked();
            }
            currentnode = currentnode.getVerticelink();
        }
        return false;
    }

}
