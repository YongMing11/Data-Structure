/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Forge-15 1650
 */
public class Queue<T> {

    private ListNode head;
    private int size;

    public Queue() {
        this.head = null;
    }

    public void enqueue(T a) {
        ListNode newnode = new ListNode(a, null);
        size++;
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

    public T dequeue() {
        if (head == null) {
            return null;
        } else {
            T temp = (T) head.getData();
            head = head.getLink();
            size--;
            return temp;
        }
    }

    public T peek() {
        if (head == null) {
            return null;
        } else {
            T temp = (T) head.getData();
            return temp;
        }
    }

    public void showQueue() {
        ListNode currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.toString());
            currentnode = currentnode.getLink();
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
    
    public boolean contains(T a){
        ListNode currentnode = head;
        while(currentnode!=null){
            if(currentnode.getData().equals(a)){
                return true;
            }
            currentnode = currentnode.getLink();
        }
        return false;
    }

}
