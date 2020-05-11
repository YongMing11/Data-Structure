/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Forge-15 1650
 */
public class BST<T extends Comparable<T>> {

    private BSTNode root;
    private boolean found = false;
    public Queue<T> Q;
    public Queue<String> Q2;
    public final int INORDER = 1;
    public final int PREORDER = 2;
    public final int POSTORDER = 3;

    public BST() {
        this.root = null;
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

    public T minimum() {
        return (T) minimum(root);
    }

    public T minimum(BSTNode<T> a) {
        if (a.getLeft() == null) {
            return a.getData();
        } else {
            while (a.getLeft() != null) {
                a = a.getLeft();
            }
            return a.getData();
        }
    }

    public T maximum() {
        return (T) maximum(root);
    }

    public T maximum(BSTNode<T> a) {
        if (a.getRight() == null) {
            return a.getData();
        } else {
            while (a.getRight() != null) {
                a = a.getRight();
            }
            return a.getData();
        }
    }

    public int getTotal() {
        return (int) getTotal(root);
    }

    public int getTotal(BSTNode<T> a) {
        if (a == null) {
            return 0;
        } else {
            String data = a.getData() + "";
            return getTotal(a.getLeft()) + getTotal(a.getRight()) + Integer.parseInt(data);
        }
    }

    public void addNode(T data) {
        root = add(root, data);
    }

    public BSTNode<T> add(BSTNode<T> a, T data) {
        if (a == null) {
            a = new BSTNode(data, null, null);
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
        } else if (data.compareTo(a.getData()) > 0) {
            a.setRight(remove(a.getRight(), data));
        } else {
            a = removeNode(a);
            found = true;
        }
        return a;
    }

    public BSTNode<T> removeNode(BSTNode<T> a) {
        if (a.getLeft() == null) {
            a = a.getRight();
        } else if (a.getRight() == null) {
            a = a.getLeft();
        } else {
            T t = (T) getPredescent(a.getLeft());
            a.setData(t);
            a.setLeft(remove(a.getLeft(), t));
        }

        return a;
    }

    public T getPredescent(BSTNode<T> a) {
        while (a.getRight() != null) {
            a = a.getRight();
        }
        return a.getData();
    }

    public void setOrder(int i) {
        Q = new Queue<>();
        if (i == INORDER) {
            inOrder(root);
        } else if (i == PREORDER) {
            preOrder(root);
        } else {
            postOrder(root);
        }
    }

    public void inOrder(BSTNode<T> a) {
        if (a != null) {
            inOrder(a.getLeft());
            Q.enqueue(a.getData());
            inOrder(a.getRight());
        }
    }

    public void preOrder(BSTNode<T> a) {
        if (a != null) {
            Q.enqueue(a.getData());
            preOrder(a.getLeft());
            preOrder(a.getRight());
        }
    }

    public void postOrder(BSTNode<T> a) {
        if (a != null) {
            postOrder(a.getLeft());
            postOrder(a.getRight());
            Q.enqueue(a.getData());
        }
    }

    public int getOccurence(T data) {
        return getOccurence(root, data);
    }
    private int occur = 0;

    public int getOccurence(BSTNode<T> a, T data) {
        if (a != null) {
            if (a.getData().compareTo(data) == 0) {
                occur++;
            }
            getOccurence(a.getLeft(), data);
            getOccurence(a.getRight(), data);
        }
        return occur;
    }

    public void fGenerator() {
        Q2 = new Queue<>();
        fGenerator(root);
    }

    public void fGenerator(BSTNode<T> a) {
        occur = 0;
        if (a != null) {
            fGenerator(a.getLeft());
            String str = String.format("%04d", getOccurence(a.getData()));
            if (!Q2.contains(str+" " + a.getData())) {
                Q2.enqueue(str + " " + a.getData());
            }
            fGenerator(a.getRight());
        }
    }
}
