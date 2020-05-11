/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class LinkedList<T extends Comparable<T>> {

    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(T type, int size) {
        this.head = null;
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            if (type instanceof Integer) {
                add((T) (Integer) r.nextInt(21));
            }
        }
    }

    public int getSize() {
        int size = 0;
        ListNode currentnode = head;
        while (currentnode != null) {
            size++;
            currentnode = currentnode.getLink();
        }
        return size;
    }

    public void showList() {
        ListNode currentnode = head;
        while (currentnode != null) {
            System.out.println(currentnode);
            currentnode = currentnode.getLink();
        }
    }

    public void add(T data) {
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

    public boolean contains(T element) {
        ListNode currentnode = head;
        if (head == null) {
            return false;
        }
        while (currentnode != null) {
            if (currentnode.getData().equals(element)) {
                return true;
            }
            currentnode = currentnode.getLink();
        }
        return false;
    }

    public int count(T element) {
        int count = 0;
        ListNode currentnode = head;
        while (currentnode != null) {
            if (currentnode.getData().equals(element)) {
                count++;
            }
            currentnode = currentnode.getLink();
        }
        return count;
    }

    public boolean contains(T start, T end) {
        ListNode currentnode = head;
        if (head == null) {
            return false;
        }
        while (currentnode != null) {
            if (((T) currentnode.getData()).compareTo(start) >= 0
                    && ((T) currentnode.getData()).compareTo(end) <= 0) {
                return true;
            }
            currentnode = currentnode.getLink();
        }
        return false;
    }

    public int count(T start, T end) {
        ListNode currentnode = head;
        int count = 0;
        while (currentnode != null) {
            if (((T) currentnode.getData()).compareTo(start) >= 0
                    && ((T) currentnode.getData()).compareTo(end) <= 0) {
                count++;
            }
            currentnode = currentnode.getLink();
        }
        return count;
    }

    public T remove() {
        ListNode currentnode = head;
        if (head == null) {
            T temp = (T) head.getData();
            head = null;
            return temp;
        }
        while (currentnode.getLink() != null) {
            currentnode = currentnode.getLink();
        }
        T temp = (T) currentnode.getLink().getData();
        currentnode.setLink(null);
        return temp;
    }

    public void remove(int index) {
        ListNode currentnode = head;
        if (head == null) {
            return;
        }
        if (index == 0) {
            head = head.getLink();
        } else {
            for (int i = 0; i < index - 1; i++) {
                currentnode = currentnode.getLink();
                if (currentnode == null) {
                    return;
                }
            }
            currentnode.setLink(currentnode.getLink());
        }

    }

    public int getIndex(T data) {
        ListNode currentnode = head;
        int index = 0;
        while (currentnode != null) {
            if (currentnode.getData().equals(data)) {
                return index;
            }
            index++;
            currentnode = currentnode.getLink();
        }
        return -1;
    }

    public T get(int index) {
        ListNode currentnode = head;
        for (int i = 0; i < index; i++) {
            currentnode = currentnode.getLink();
        }
        return (T) currentnode.getData();
    }

}
