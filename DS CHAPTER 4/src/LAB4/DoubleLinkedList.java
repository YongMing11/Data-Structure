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
public class DoubleLinkedList<T> {

    private DoubleListNode head;

    public DoubleLinkedList() {
        this.head = null;
    }

    public int length() {
        int count = 0;
        DoubleListNode currentnode = head;
        while (currentnode != null) {
            currentnode = currentnode.getNextLink();
            count++;
        }
        return count;
    }

    public void showList() {
        DoubleListNode currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode);
            currentnode = currentnode.getNextLink();
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
    }

    public void addLeftNode(T a) {
        head = new DoubleListNode(a, null, head);
    }

    public void addRightNode(T a) {
        DoubleListNode newnode = new DoubleListNode(a, null, null);
        DoubleListNode currentnode = head;
        if (head == null) {
            head = newnode;
            return;
        }
        while (currentnode.getNextLink() != null) {
            currentnode = currentnode.getNextLink();
        }
        currentnode.setNextLink(newnode);
        newnode.setPreviousLink(currentnode);
    }

    public void deleteLeftNode() {
        if (head != null) {
            head = head.getNextLink();
            head.setPreviousLink(null);
        } else {
            System.out.println("The list is empty");
        }

    }

    public void deleteRightNode() {
        DoubleListNode currentnode = head;
        DoubleListNode previousnode = head;
        if (head != null) {
            if (currentnode.getNextLink() == null) {
                head = null;
            } else {
                while (currentnode.getNextLink() != null) {
                    previousnode = currentnode;
                    currentnode = currentnode.getNextLink();
                }
                currentnode = null;
                previousnode.setNextLink(null);
            }
        } else {
            System.out.println("The list is empty");
        }
    }

    public void addNodeByPosition(T a, int index) {
        if (index == 0) {
            addLeftNode(a);
        } else if (index == length()) {
            addRightNode(a);
        } else if (index > length()) {
            System.out.println("Invalid index. No node inserted");
        } else {
            DoubleListNode currentnode = head;
            DoubleListNode newnode = new DoubleListNode(a, null, null);
            for (int i = 0; i < index - 1; i++) {
                currentnode = currentnode.getNextLink();
            }
            currentnode.getNextLink().setPreviousLink(newnode);
            newnode.setNextLink(currentnode.getNextLink());
            currentnode.setNextLink(newnode);
            newnode.setPreviousLink(currentnode);
        }
    }

    public void deleteNodeByPosition(int index) {
        if (index == 0) {
            deleteLeftNode();
        } else if (index == length()) {
            deleteRightNode();
        } else if (index > length()) {
            System.out.println("Invalid index. No node inserted");
        } else {
            DoubleListNode currentnode = head;
            for (int i = 0; i < index - 1; i++) {
                currentnode = currentnode.getNextLink();
            }
            DoubleListNode temp = currentnode.getNextLink().getNextLink();
            currentnode.setNextLink(temp);
            temp.setPreviousLink(currentnode);
        }
    }

    public void removeEvenNumber() {
        DoubleListNode currentnode = head;
        int count = 0;
        if (head != null) {
            while (currentnode != null) {
                if (count == 0) {
                    if ((int) head.getData() % 2 == 0) {
                        deleteLeftNode();
                        currentnode = head;
                    } else {
                        count++;
                        currentnode = currentnode.getNextLink();
                    }
                } else if (currentnode.getNextLink()==null) {
                    if ((int) currentnode.getData() % 2 == 0) {
                        deleteRightNode();
                    }
                    currentnode = currentnode.getNextLink();
                } else if ((int) currentnode.getData() % 2 == 0) {
                    deleteNodeByPosition(count);
                    currentnode = currentnode.getNextLink();
                } else {
                    count++;
                    currentnode = currentnode.getNextLink();
                }

            }
        } else {
            System.out.println("The list is empty");
        }
    }

}
