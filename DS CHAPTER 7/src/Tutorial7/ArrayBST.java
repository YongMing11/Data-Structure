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
public interface ArrayBST<T> {
    public boolean isEmpty();
    public int getSize();
    public int getHeight();
    public void addNode(T data);
    public void inOrder(BSTNode<T> a);
    public void preOrder(BSTNode<T> a);
    public void postOrder(BSTNode<T> a);
    public boolean removeNode(T data);
}
