/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial7;

/**
 *
 * @author Forge-15 1650
 */
public class BST<T extends Comparable<T>> {

    private BSTNode root;
    private boolean found;
    public final int PREORDER = 1;
    public final int INORDER = 2;
    public final int POSTORDER = 3;
    public Queue<T> Q;

    public BST() {
        root = null;
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public int getSize() {
        return getSize(root);
    }

    public int getSize(BSTNode<T> a) {
        if (a == null) {
            return 0;
        } else {
            return getSize(a.getLeft()) + getSize(a.getRight()) + 1;
        }
    }

    public boolean contains(T t) {
        return find(root, t);
    }

    public boolean find(BSTNode<T> a, T t) {
        if (a == null) {
            return false;
        } else if (t.compareTo(a.getData()) < 0) {
            return find(a.getLeft(), t);
        } else if (t.compareTo(a.getData()) > 0) {
            return find(a.getRight(), t);
        } else {
            return true;
        }
    }

    public void addNode(T data) {
        root = add(root, data);
    }

    public BSTNode<T> add(BSTNode<T> a, T data) {
        if (a == null) {
            a = new BSTNode<T>(data, null, null);
        } else if (data.compareTo(a.getData()) <= 0) {
            a.setLeft(add(a.getLeft(), data));
        } else {
            a.setRight(add(a.getRight(), data));
        }
        return a;
    }

    public boolean remove(T data) {
        root = remove(root, data);
        return found;
    }

    public BSTNode<T> remove(BSTNode<T> a, T data) {
        if (a == null) {
            found = false;
        } else if (data.compareTo(a.getData()) < 0) {
            a.setLeft(remove(a.getLeft(), data)); 
//using recursion to construct tree starting from root
        } else if (data.compareTo(a.getData()) > 0) {
            a.setRight(remove(a.getRight(), data));
        } else {
            found = true;
            a = removeNode(a); //remove the node we want to delete
        }
        return a;
    }

    //return all nodes after the removed note into a
    public BSTNode<T> removeNode(BSTNode<T> a) {
        if (a.getLeft() == null) {
            return a.getRight(); //return the node from right link 
            //if both left right node are null, no node will be returned
        } else if (a.getRight() == null) {
            return a.getLeft();  //return the node from left link 
        } else{ //both left right not null
            T t = (T) getPredecessor(a.getLeft());
            a.setData(t);
            a.setLeft(remove(a.getLeft(),t));
            return a; //return the node that will be replaced the removed note
        }
    }
    
    public T getPredecessor(BSTNode<T> a){
        while(a.getRight()!=null){
            a = a.getRight();
        }
        return a.getData();
    }
    
    public void setOrder(int a){
        Q = new Queue<>();
        if(a == INORDER){
            inOrder(root);
        }else if(a == PREORDER){
            preOrder(root);
        }else
            postOrder(root);
    }
    
    public void inOrder(BSTNode<T> a){
        if(a!=null){
            inOrder(a.getLeft());
            Q.enqueue(a.getData());
            inOrder(a.getRight());
        }
    }
    
    public void preOrder(BSTNode<T> a){
        if(a!=null){
            Q.enqueue(a.getData());
            preOrder(a.getLeft());
            preOrder(a.getRight());
        }
    }
    
    public void postOrder(BSTNode<T> a){
        if(a!=null){
            postOrder(a.getLeft());
            postOrder(a.getRight());
            Q.enqueue(a.getData());         
        }
    }
}
