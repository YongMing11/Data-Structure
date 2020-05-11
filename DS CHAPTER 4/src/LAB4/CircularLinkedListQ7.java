/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

/**
 *
 * @author Forge-15 1650
 */
public class CircularLinkedListQ7<T extends Comparable<T>> {


    private ListNode head;
    private ListNode tail;
    private int count;

    public CircularLinkedListQ7() {
        this.head = null;
        this.tail = null;
    }

    public int length() {
        return count;
    }

    public void addCircularNode(T a) {
        ListNode newnode = new ListNode(a, null);

        if (head == null) {
            head = newnode;
        } else {
            tail.setLink(newnode);
        }
        tail = newnode;
        tail.setLink(head);
        count++;
    }

    public void deleteCircularNode() {
        ListNode currentnode = head;
        count--;
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                while (currentnode.getLink() != tail) {
                    currentnode = currentnode.getLink();
                }
                tail = currentnode;
                tail.setLink(head);
            }
        } else {
            System.out.println("The list is empty");
        }
    }

    public void showCircularList() {
        ListNode currentnode = head;
        while (currentnode != tail) {
            System.out.print(currentnode);
            currentnode = currentnode.getLink();
        }
        if (head != tail) {
            System.out.print(tail);
        }
        System.out.print(head);
    }

    public T getCircularItem(int index) {
        ListNode currentnode = head;
        if (index == 0) {
            return (T) head.getData();
        } else if (index == length() - 1) {
            return (T) tail.getData();
        } else if (index >= length()) {
            System.out.println("Cannot be found");
            return null;
        } else {
            for (int i = 0; i < index; i++) {
                currentnode = currentnode.getLink();
            }
            return (T) currentnode.getData();
        }
    }

}

