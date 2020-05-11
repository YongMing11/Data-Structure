/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import Tutorial7.*;

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

    public int getSize() {
        return size;
    }

    public void enqueue(T data) {
        size++;
        if (head == null) {
            head = new ListNode(data, null);
        } else {
            ListNode currentnode = head;
            while (currentnode.getLink() != null) {
                currentnode = currentnode.getLink();
            }
            currentnode.setLink(new ListNode(data, null));
        }
    }

    public T dequeue() {
        if (head == null) {
            return null;
        } else {
            size--;
            T temp = (T) head.getData();
            head = head.getLink();
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
        if (head == null) {
            return;
        }
        ListNode currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.toString());
            currentnode = currentnode.getLink();
        }
    }
    public void Q2showQueue() {
        if (head == null) {
            return;
        }
        ListNode currentnode = head;
        while (currentnode != null) {
            System.out.println(currentnode.toString());
            currentnode = currentnode.getLink();
        }
    }
    
    public boolean contains(T data){
        if(head==null){
            return false;
        }else{
            ListNode currentnode = head;
            while(currentnode!=null){
                if(currentnode.getData().equals(data)){
                    return true;
                }
                currentnode = currentnode.getLink();
            }
            return false;
        }
    }

}
