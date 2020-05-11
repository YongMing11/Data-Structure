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
public class Q3LinkedList<T extends Course> {

    private Q3ListNode head;

    class LinkedListIterator implements Iterator<T> {

        private Q3ListNode currentnode = head;

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

    public Q3LinkedList() {
        head = null;
    }

    public boolean contains(T t) {
        Q3ListNode currentnode = head;
        while (currentnode != null) {
            if (currentnode.getData().equals(t)) {
                return true;
            }
        }
        return false;
    }

    public int length() {
        int i = 0;
        Q3ListNode currentnode = head;
        while (currentnode != null) {
            i++;
            currentnode = currentnode.getLink();
        }
        return i;
    }

    public void deleteNodeByPosition(int index) {
        Q3ListNode currentnode = head;
        Q3ListNode previousnode = head;
        if (index == 0) {
            deleteFront();
            return;
        } else if (length() - 1 == index) {
            while (currentnode.getLink().getLink() != null) {
                currentnode = currentnode.getLink();
            }
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
        Q3ListNode newnode = new Q3ListNode(t, null);
        if (head == null) {
            head = newnode;
        } else {
            Q3ListNode currentnode = head;
            while (currentnode.getLink() != null) {
                currentnode = currentnode.getLink();
            }
            currentnode.setLink(newnode);
        }
    }

    public void addAt(T t, int a) {
        Q3ListNode currentnode = head;
        Q3ListNode previousnode = head;
        for (int i = 0; i < a; i++) {
            previousnode = currentnode;
            currentnode = currentnode.getLink();
        }
        previousnode.setLink(new Q3ListNode(t, currentnode));
    }

    public void insertFront(T t) {
        head = new Q3ListNode(t, head);
    }

    public T get(int index) {
        Q3ListNode currentnode = head;
        while (index > 0) {
            currentnode = currentnode.getLink();
            index--;
        }
        return (T) currentnode.getData();
    }

    @Override
    public String toString() {
        String str = "";
        Q3ListNode currentnode = head;
        while (currentnode != null) {
            str += currentnode.toString();
            currentnode = currentnode.getLink();
        }
        return str;
    }

    public void totalPoint() {
        Q3ListNode currentnode = head;
        double point = 0;
        double credit = 0;
        while (currentnode != null) {
            switch (currentnode.getData().getGrade()) {
                case 'A': {
                    credit += currentnode.getData().getCredit();
                    point += 4 * currentnode.getData().getCredit();
                    break;
                }
                case 'B': {
                    credit += currentnode.getData().getCredit();
                    point += 3 * currentnode.getData().getCredit();
                    break;
                }
                case 'C': {
                    credit += currentnode.getData().getCredit();
                    point += 2 * currentnode.getData().getCredit();
                    break;
                }
                case 'D': {
                    credit += currentnode.getData().getCredit();
                    point += 1 * currentnode.getData().getCredit();
                    break;
                }
                case 'E': {
                    credit += currentnode.getData().getCredit();
                    point += 0 * currentnode.getData().getCredit();
                    break;
                }
            }
            currentnode = currentnode.getLink();
        }
        System.out.println("Total point is " + (int)point);
        System.out.println("Total credit is " + (int)credit);
        System.out.printf("Grade point average is %.2f", point/credit);
        System.out.println("");
    }
//
//    public void splitList() {
//        Q3LinkedList<T> a = new Q3LinkedList<>();
//        Q3LinkedList<T> b = new Q3LinkedList<>();
//        Q3ListNode currentnode = head;
//        int count = 0;
//        while (currentnode != null) {
//            currentnode = currentnode.getLink();
//            count++;
//        }
//        currentnode = head;
//
//        if (count % 2 != 0) { //if total number of char is odd number
//            for (int i = 0; i <= (count / 2); i++) {
//                a.add((T) currentnode.getData());
//                currentnode = currentnode.getLink();
//            }
//            for (int i = (count / 2); i < count - 1; i++) {
//                b.add((T) currentnode.getData());
//                currentnode = currentnode.getLink();
//            }
//        } else {
//            for (int i = 0; i < count / 2; i++) {
//                a.add((T) currentnode.getData());
//                currentnode = currentnode.getLink();
//            }
//            for (int i = count / 2; i < count; i++) {
//                b.add((T) currentnode.getData());
//                currentnode = currentnode.getLink();
//            }
//
//        }
//
//        System.out.println("First List : " + a.toString());
//        System.out.println("Second List : " + b.toString());
//
//    }
//
//    private ArrayList<T> first = new ArrayList<>();
//    private ArrayList<T> second = new ArrayList<>();
//
//    public void alternateList() {
//        Q3ListNode currentnode = head;
//        int i = 0;
//        while (currentnode != null) {
//            if (i == 0) {
//                first.add((T) currentnode.getData());
//            } else if (i % 2 == 0) {
//                first.add((T) currentnode.getData());
//            } else {
//                second.add((T) currentnode.getData());
//            }
//            i++;
//            currentnode = currentnode.getLink();
//        }
//        Q3LinkedList<T> a = new Q3LinkedList<>();
//        Q3LinkedList<T> b = new Q3LinkedList<>();
//        for (T x : first) {
//            a.add(x);
//        }
//        for (T x : second) {
//            b.add(x);
//        }
//        System.out.println("First List : " + a.toString());
//        System.out.println("Second List : " + b.toString());
//    }
//
//    public void mergeList() {
//        Q3ListNode currentnode = head;
//        Q3LinkedList<T> merge = new Q3LinkedList<>();
//        int count = 0;
//        int a = 0;
//        int b = 0;
//        while (currentnode != null) {
//            if (count % 2 == 0) {
//                merge.add(first.get(a));
//                a++;
////                System.out.println(a);
//            } else {
//                merge.add(second.get(b));
//                b++;
////                System.out.println(b);
//            }
//            count++;
//            currentnode = currentnode.getLink();
//        }
//        System.out.println(merge.toString());
//    }
//
//    public Q3LinkedList<T> reverse() {
//        reverse(head);
//        Q3LinkedList<T> j = new Q3LinkedList<>();
//        for (T x : r) {
//            j.add(x);
//        }
//
//        return j;
//    }
//
//    private ArrayList<T> r = new ArrayList<>();
//
//    public void reverse(Q3ListNode c) {
//        Q3ListNode currentnode = c;
//        if (currentnode != null) {
//            r.add(0, (T) currentnode.getData());
////            System.out.println(r.toString());
//            reverse(currentnode.getLink());
//
//        }
//    }

}
