/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL4;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class LinkedList<T extends Comparable<T>> {

    private ListNode head;

    public LinkedList() {
        head = null;
    }

    public int length() {
        ListNode currentnode = head;
        int count = 0;
        while (currentnode != null) {
            currentnode = currentnode.getLink();
            count++;
        }
        return count;
    }

    public void addNode(T a) {
        ListNode<T> newnode = new ListNode<>(a, null);
        ListNode<T> currentnode = new ListNode<>();
        currentnode = head;
        if (currentnode == null) {
            head = newnode;
        } else {
            while (currentnode.getLink() != null) {
                currentnode = currentnode.getLink();
            }
            currentnode.setLink(newnode);

        }

    }

    public void showList() {
        ListNode currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.toString());
            currentnode = currentnode.getLink();
        }
    }

    public void operation(int num) {
        ListNode currentnode = head;
        while (currentnode != null) {
            if ((double) currentnode.getData() > num) {
                currentnode.setData((double) currentnode.getData() + 10.5);
            }
            currentnode = currentnode.getLink();
        }

    }

    public T getFront() {

        if (head != null) {
            return (T) head.getData();
        } else {
            return null;
        }
    }

    public T getBack() {
        ListNode currentnode = head;
        if (head != null) {
            while (currentnode.getLink() != null) {
                currentnode = currentnode.getLink();
            }
            return (T) currentnode.getData();
        } else {
            return null;
        }
    }

    public T get(int index) {
        if (index == 0) {
            return getFront();
        } else if (index == length() - 1) {
            return getBack();
        } else if (index > length() - 1) {
            return null;
        } else {
            ListNode currentnode = head;

            for (int i = 0; i < index; i++) {
                currentnode = currentnode.getLink();
            }
            return (T) currentnode.getData();
        }

    }

    public int sum() {
        ListNode currentnode = head;
        int sum = 0;
        while (currentnode != null) {
            sum += (int) currentnode.getData();
            currentnode = currentnode.getLink();
        }
        return sum;
    }

    public int even() {
        ListNode currentnode = head;
        int even = 0;
        while (currentnode != null) {
            if ((int) currentnode.getData() % 2 == 0) {
                even++;
            }
            currentnode = currentnode.getLink();
        }
        return even;
    }

    public int generate() {
        Random r = new Random();
        return r.nextInt(11);

    }

//    public void delete(int d) {
//        ListNode currentnode = head;
//        while (currentnode != null) {
//            if ((int) currentnode.getData() == d) {
//                ListNode x = currentnode.getLink();
////                currentnode = null;
//                System.out.println("sohai");
//                while (x.getLink() != null) {
//                    if (currentnode.getLink() != null) {
//                        currentnode.setLink(currentnode.getLink());
////                    System.out.print(currentnode.getLink());
//                    }
//                        currentnode = currentnode.getLink();
//                        x = currentnode.getLink();
//                }
//            } else {
//                currentnode = currentnode.getLink();
//            }
//        }
//
//    }
//    public void deleteNode(T x) {
//        ListNode currentnode = head;
//        ListNode previousnode = head;
//        if (currentnode == null) {
//            System.out.println("The list is empty.");
//        }
//        int count = 0;
//        while (currentnode != null) {
////            System.out.print(count+"\t");
////            System.out.print(currentnode.getData()+"\t");
////            System.out.print(previousnode.getData());
////            System.out.println("");
//            if (head.getData().equals(x)) {
////                showList();
////                System.out.println("first node deleted");
//                head = head.getLink();
//                previousnode = head;
//                currentnode = head.getLink();
////                showList();
////                System.out.println("");
//            } else if (currentnode.getLink() == null) {
////                System.out.println("condition 2");
//                if (currentnode.getData().equals(x)) {
//                    previousnode.setLink(null);
//                }
//                currentnode = currentnode.getLink();
//            } else if (currentnode.getData().equals(x)) {
////                System.out.println("condition 3");
////                System.out.println(currentnode.getLink().getData());
//                previousnode.setLink(currentnode.getLink());
//                currentnode = currentnode.getLink();
//
//            } else {
////                System.out.println("condition 4");
//                previousnode = currentnode;
//                currentnode = currentnode.getLink();
//
//            }
////            count++;
//        }
//    }
    public ListNode deleteNodeByPosition(int index) {
        ListNode currentnode = head;
        if (index == 0) {
            head = head.getLink();
        } else {
            ListNode previousnode = head;
            for (int i = 0; i < index; i++) {
                previousnode = currentnode;
                currentnode = currentnode.getLink();
            }
            previousnode.setLink(currentnode.getLink());
        }
        return currentnode.getLink();
    }

    public void deleteAllNode(T data) {
        ListNode currentnode = head;
        for (int i = 0; i < length();) {
            if (currentnode.getData().equals(data)) {
                currentnode = deleteNodeByPosition(i);
            } else {
                i++;
                currentnode = currentnode.getLink();
            }
        }
    }

    public void insertFront(T a) {

        head = new ListNode(a, head);

    }

    public T median() {
        ListNode currentnode = head;
        int count = 0;
        while (currentnode != null) {
            currentnode = currentnode.getLink();
            count++;
        }
        currentnode = head;
        for (int i = 0; i < (count - 1) / 2; i++) {
            currentnode = currentnode.getLink();
        }
        return (T) currentnode.getData();
    }
}
