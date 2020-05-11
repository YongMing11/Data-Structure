/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial6;

/**
 *
 * @author Forge-15 1650
 */
public class Stack<T> {

    private ListNode head;
    private int count = 0;

    public Stack() {
        this.head = null;
    }

    public int getSize() {
        return count;
    }

    public void push(T data) {
        head = new ListNode(data, head);
        count++;
    }

    public T pop() {
        if (head == null) {
            return null;
        } else {
            T data = (T) head.getData();
            head = head.getLink();
            count--;
            return data;
        }
    }

    public T peek() {
        if (head == null) {
            return null;
        } else {
            return (T) head.getData();
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

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }
}
