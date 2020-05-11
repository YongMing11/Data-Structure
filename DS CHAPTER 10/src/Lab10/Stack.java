/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10;

/**
 *
 * @author Forge-15 1650
 */
public class Stack<T> {

    private ListNode head;

    public Stack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void push(T data) {
        ListNode newnode = new ListNode(data, null);
        if (head == null) {
            head = newnode;
        } else {
            ListNode currentnode = head;
            while (currentnode.getLink() != null) {
                currentnode = currentnode.getLink();
            }
            currentnode.setLink(newnode);
        }
    }

    public T pop() {
        if (head == null) {
            return null;
        } else {
            ListNode previousnode = null;
            ListNode currentnode = head;
            while (currentnode.getLink() != null) {
                previousnode = currentnode;
                currentnode = currentnode.getLink();
            }
            T temp = (T) currentnode.getData();
            previousnode.setLink(null);
            return temp;
        }
    }

    public T peek() {
        if (head == null) {
            return null;
        } else {
            ListNode currentnode = head;
            while (currentnode.getLink() != null) {
                currentnode = currentnode.getLink();
            }
            T temp = (T) currentnode.getData();
            return temp;
        }
    }

    public void showStack() {
        ListNode currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.toString());
            currentnode = currentnode.getLink();
        }
    }

    public boolean contains(T data) {
        ListNode currentnode = head;
        while (currentnode != null) {
            if (currentnode.getData().equals(data)) {
                return true;
            }
            currentnode = currentnode.getLink();
        }
        return false;
    }
}
