/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial8;

/**
 *
 * @author Forge-15 1650
 */
public class LinkedList<T extends Comparable<T>> {

    public final int ASCENDING = 0;
    public final int DESCENDING = 1;
    private ListNode head;
    private int size = 0;
    private int orderType;

    public LinkedList() {
        this.head = null;
    }

    public void add(T data) {
        size++;
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

    public void selectionSort() {
        ListNode sort = new ListNode(null, null);

        for (int i = 0; i < size - 1; i++) {
            ListNode currentnode = head;
            int index = 0;
            for (int j = 0; j < i; j++) {
                currentnode = currentnode.getLink();
                index++;
            }
            int index1 = index;
            T min = (T) currentnode.getData();
            while (currentnode != null) {
                if (min.compareTo((T) currentnode.getData()) > 0) {
                    min = (T) currentnode.getData();
                    index1 = index;
                }
                currentnode = currentnode.getLink();
                index++;
            }
            swap(i, index1);
        }
    }

    public void swap(int index1, int index2) {
//        System.out.println("index1 " + index1);
//        System.out.println("index2 " + index2);
        T temp;
        ListNode currentnode = head;
        if (index1 == 0) {
            int index = 0;
            while (index < index2) {
                currentnode = currentnode.getLink();
                index++;
            }
            temp = (T) currentnode.getData();
            currentnode.setData(head.getData());
            head.setData(temp);
        } else {
            ListNode a = head;
            int index = 0;
            while (index < index1) {
                a = a.getLink();
                index++;
            }
            temp = (T) a.getData();
            index = 0;
            while (index < index2) {
                currentnode = currentnode.getLink();
                index++;
            }
            a.setData(currentnode.getData());
            currentnode.setData(temp);
        }
//        showList();
    }

    public void bubbleSort(int orderType) {
        for (int iteration = 0; iteration < size - 1; iteration++) {
            ListNode currentnode = head;
            for (int i = 0; i < size - 1 - iteration; i++) {
                T current = (T) currentnode.getData();
                T next = (T) currentnode.getLink().getData();
                if (current.compareTo(next) > 0 && orderType == ASCENDING) {
                    swap(i, i + 1);
                } else if (current.compareTo(next) < 0 && orderType == DESCENDING) {
                    swap(i, i + 1);
                }
                currentnode = currentnode.getLink();
            }
        }
    }

    public void showList() {
        ListNode currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode);
            currentnode = currentnode.getLink();
        }
        System.out.println("");
    }
}
