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
public class Queue<T> {

    private ListNode head;
    private int size = 0;

    public Queue() {
        this.head = null;
    }

    public void enqueue(T data) {
        ListNode newnode = new ListNode(data, null);
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
        }
        size--;
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }

    public T peek() {
        if (head == null) {
            return null;
        }
        T temp = (T) head.getData();
        return temp;
    }

    public int getSize() {
        return size;
    }

    public void showQueue() {
        ListNode currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.toString());
            currentnode = currentnode.getLink();
        }
    }

    public void reverseShowQueue() {
        ListNode currentnode = head;
        String str = "";
        while(currentnode!=null){
            str = currentnode.toString() + str;
            currentnode = currentnode.getLink();
        }
        System.out.print(str);
    }
}
