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
public class Q3BST<T extends Comparable<T>> implements ArrayBST<T> {

    private T[] bst;
    private int index = 0;
    public final int PREORDER = 1;
    public final int INORDER = 2;
    public final int POSTORDER = 3;
    public Queue<T> Q;

    public Q3BST() {
        this.bst = (T[]) new Comparable[20];
    }

    public int getLeft(int k) {
        return (2 * k + 1);
    }

    public int getRight(int k) {
        return (2 * k + 2);
    }

    @Override
    public boolean isEmpty() {
        return (bst[0] == null);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (T i : bst) {
            if (i != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public int getHeight() {
        if (bst[0] == null) {
            return 0;
        }
        int L = 1;
        int h = 1;
        for (int i = 1; i < 20; i++, L = 2 * L + L) {
            if (bst[i] != null) {
                i = L;
                h++;
            }
        }
        return h;
    }

    @Override
    public void addNode(T data) {
        if (bst[index] == null) {
//            System.out.println(index);
//            System.out.println(data);
            bst[index] = data;
            index = 0;
        } else {
            if (data.compareTo(bst[index]) <= 0) {
                index = getLeft(index);
                addNode(data);
            } else{
                index = getRight(index);
                addNode(data);
            }
        }
    }

    @Override
    public void inOrder(BSTNode<T> a) {
    }

    @Override
    public void preOrder(BSTNode<T> a) {
    }

    @Override
    public void postOrder(BSTNode<T> a) {
    }

    @Override
    public boolean removeNode(T data) {
        index = 0;
        if (bst[index] == null) {
            return false;
        } else {
            while (true && index<20) {
                if (data.compareTo(bst[index]) < 0) {
                    index=getLeft(index);
                } else if (data.compareTo(bst[index]) > 0) {
                    index=getRight(index);
                } else {
                    remove(index);
                    return true;
                }
            }
        }
        return true;
    }
    

    public void remove(int k) {
        if (bst[(2*k + 1)] == null) { //left link is empty
            bst[k]= bst[getRight(k)];
            bst[getRight(k)] = null;
            return;
        } else if (bst[(2 * k + 2)] == null) { //right link is empty
            bst[k]= bst[getLeft(k)];
            bst[getLeft(k)] = null;
            return;
        } else {
            int left = 2 * k + 1;
            while (bst[left] != null) {
                if(getRight(left)<20){
                    left = getRight(left);
                }
            }
            bst[k] = bst[left];
            bst[left] = null;
        }
    }
    

    public void setOrder(int a) {
        Q = new Queue<>();
        if (a == INORDER) {
            inOrder(0);
        } else if (a == PREORDER) {
            preOrder(0);
        } else {
            postOrder(0);
        }
    }

    public void inOrder(int i) {
        if (i >= 20) {
            return;
        }
        if (bst[i] != null) {
            inOrder(i * 2 + 1);
//            System.out.println(bst[i]);
            Q.enqueue(bst[i]);
            inOrder(i * 2 + 2);
        }
    }

    public void preOrder(int i) {
        if (i >= 20) {
            return;
        }
        if (bst[i] != null) {
            Q.enqueue(bst[i]);
            preOrder(getLeft(i));
            preOrder(getRight(i));
        }
    }

    public void postOrder(int index) {
        if (index >= 20) {
            return;
        }

        if (bst[index] != null) {
            postOrder(index * 2 + 1);
            postOrder(index * 2 + 2);
            Q.enqueue(bst[index]);
        }
    }

}
