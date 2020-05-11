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
public class PriorityQueue<T extends Packet> {

    private Q5ListNode head;
    private int size;

    public PriorityQueue() {
        this.head = null;
    }

    public void enqueue(T a) {
        size++;
        Q5ListNode newnode = new Q5ListNode(a, null);
        if (head == null) {
            head = newnode;
        } else {
            Q5ListNode currentnode = head;
            if(head.getData().getPriority()<a.getPriority()){
                head = new Q5ListNode(a, head);
                return;
            }
            while (currentnode.getLink().getData().getPriority()
                   >= a.getPriority()) {
                currentnode = currentnode.getLink();
                if(currentnode.getLink()==null){
                break;
                }
            }
            newnode = new Q5ListNode(a, currentnode.getLink());
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
        Q5ListNode currentnode = head;
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

    public boolean contains(T a) {
        Q5ListNode currentnode = head;
        while (currentnode != null) {
            if (currentnode.getData().equals(a)) {
                return true;
            }
            currentnode = currentnode.getLink();
        }
        return false;
    }

}
