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
public class BSTNode<T> {
    private T data;
    private BSTNode left;
    private BSTNode right;

    public BSTNode(T data, BSTNode left, BSTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return data + " --> ";
    }
    
    
    
    
}
