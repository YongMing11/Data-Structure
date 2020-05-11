/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Forge-15 1650
 */
public class LinkedList<T extends Comparable<T>> {

    private ListNode head;

    class LinkedListIterator implements Iterator<T> {

        private ListNode currentnode = head;

        @Override
        public boolean hasNext() {
            return (currentnode.getLink() != null); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException(); //To change body of generated methods, choose Tools | Templates.
            } else {
                currentnode = currentnode.getLink();
                return (T) currentnode.getData();
            }

        }

        public void remove(int i) {
            deleteNodeByPosition(i);
            //To change body of generated methods, choose Tools | Templates.
        }

    }

    public LinkedList() {
        head = null;
    }

    public boolean contains(T t) {
        ListNode currentnode = head;
        while (currentnode != null) {
            if (currentnode.getData().equals(t)) {
                return true;
            }
        }
        return false;
    }

    public int length() {
        int i = 0;
        ListNode currentnode = head;
        while (currentnode != null) {
            i++;
            currentnode = currentnode.getLink();
        }
        return i;
    }

    public void deleteNodeByPosition(int index) {
        ListNode currentnode = head;
        ListNode previousnode = head;
        if (index == 0) {
            deleteFront();
            return;
        }else if(length()-1==index){
            while(currentnode.getLink().getLink()!=null){
            currentnode = currentnode.getLink();}
            currentnode.setLink(null);
            return;
        }
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                currentnode.setLink(currentnode.getLink().getLink());
                break;
            }
            previousnode = currentnode;
            currentnode = currentnode.getLink();
        }

    }

    public void deleteFront() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.getLink() != null) {
            head = head.getLink();
        } else {
            head = null;
        }
    }

    public void add(T t) {
        ListNode newnode = new ListNode(t, null);
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

    public void addAt(T t, int a) {
        ListNode currentnode = head;
        ListNode previousnode = head;
        for (int i = 0; i < a; i++) {
            previousnode = currentnode;
            currentnode = currentnode.getLink();
        }
        previousnode.setLink(new ListNode(t, currentnode));
    }

    public void insertFront(T t) {
        head = new ListNode(t, head);
    }

    public void addSortNode(T t) {
        int i = 0;
        ListNode previousnode = head;
        ListNode currentnode = head;
        if (head == null) {
            add(t);
        } else if (head.getData().compareTo(t) > 0) {
            insertFront(t);
        } else {
            while (currentnode != null) {
                if ((currentnode.getData().compareTo(t) > 0)
                        && (previousnode.getData().compareTo(t) <= 0)) {
                    addAt(t, i);
                    break;
                } else if (currentnode.getData().compareTo(t) <= 0
                        && currentnode.getLink() == null) {
                    add(t);
                    break;
                }
                previousnode = currentnode;
                currentnode = currentnode.getLink();
                i++; //i is pointing to the previousnode
            }
        }
    }

    public T get(int index) {
        ListNode currentnode = head;
        while (index > 0) {
            currentnode = currentnode.getLink();
            index--;
        }
        return (T) currentnode.getData();
    }

    @Override
    public String toString() {
        String str = "";
        ListNode currentnode = head;
        while (currentnode != null) {
            str += currentnode.toString();
            currentnode = currentnode.getLink();
        }
        return str;
    }

    public void splitList() {
        LinkedList<T> a = new LinkedList<>();
        LinkedList<T> b = new LinkedList<>();
        ListNode currentnode = head;
        int count = 0;
        while (currentnode != null) {
            currentnode = currentnode.getLink();
            count++;
        }
        currentnode = head;

        if (count % 2 != 0) { //if total number of char is odd number
            for (int i = 0; i <= (count / 2); i++) {
                a.add((T) currentnode.getData());
                currentnode = currentnode.getLink();
            }
            for (int i = (count / 2); i < count - 1; i++) {
                b.add((T) currentnode.getData());
                currentnode = currentnode.getLink();
            }
        } else {
            for (int i = 0; i < count / 2; i++) {
                a.add((T) currentnode.getData());
                currentnode = currentnode.getLink();
            }
            for (int i = count / 2; i < count; i++) {
                b.add((T) currentnode.getData());
                currentnode = currentnode.getLink();
            }

        }

        System.out.println("First List : " + a.toString());
        System.out.println("Second List : " + b.toString());

    }

    private ArrayList<T> first = new ArrayList<>();
    private ArrayList<T> second = new ArrayList<>();

    public void alternateList() {
        ListNode currentnode = head;
        int i = 0;
        while (currentnode != null) {
            if (i == 0) {
                first.add((T) currentnode.getData());
            } else if (i % 2 == 0) {
                first.add((T) currentnode.getData());
            } else {
                second.add((T) currentnode.getData());
            }
            i++;
            currentnode = currentnode.getLink();
        }
        LinkedList<T> a = new LinkedList<>();
        LinkedList<T> b = new LinkedList<>();
        for (T x : first) {
            a.add(x);
        }
        for (T x : second) {
            b.add(x);
        }
        System.out.println("First List : " + a.toString());
        System.out.println("Second List : " + b.toString());
    }

    public void mergeList() {
        ListNode currentnode = head;
        LinkedList<T> merge = new LinkedList<>();
        int count = 0;
        int a = 0;
        int b = 0;
        while (currentnode != null) {
            if (count % 2 == 0) {
                merge.add(first.get(a));
                a++;
//                System.out.println(a);
            } else {
                merge.add(second.get(b));
                b++;
//                System.out.println(b);
            }
            count++;
            currentnode = currentnode.getLink();
        }
        System.out.println(merge.toString());
    }

    public LinkedList<T> reverse() {
        reverse(head);
        LinkedList<T> j = new LinkedList<>();
        for (T x : r) {
            j.add(x);
        }

        return j;
    }

    private ArrayList<T> r = new ArrayList<>();

    public void reverse(ListNode c) {
        ListNode currentnode = c;
        if (currentnode != null) {
            r.add(0, (T) currentnode.getData());
//            System.out.println(r.toString());
            reverse(currentnode.getLink());

        }
    }

}
