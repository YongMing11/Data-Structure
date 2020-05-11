/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

import java.nio.file.Paths;
import javax.print.attribute.standard.Media;
import static javax.swing.UIManager.get;

/**
 *
 * @author Forge-15 1650
 */
public class Q8CircularLinkedList<T extends Music> {

    private Q8ListNode head;
    private Q8ListNode tail;
    private int count;

    public Q8CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int length() {
        return count;
    }

    public void addCircularNode(T a) {
        Q8ListNode newnode = new Q8ListNode(a, null);

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
        Q8ListNode currentnode = head;
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
        Q8ListNode currentnode = head;
        while (currentnode != tail) {
            System.out.print(currentnode);
            currentnode = currentnode.getLink();
        }
        if (head != tail) {
            System.out.print(tail);
        }
        System.out.print(head);
    }

    public String getCircularItem(int index) {
        Q8ListNode currentnode = head;
        if (index == 0) {
            return head.getData().toString();
        } else if (index == length() - 1) {
            return tail.getData().toString();
        } else if (index >= length()) {
            System.out.println("Cannot be found");
            return null;
        } else {
            for (int i = 0; i < index; i++) {
                currentnode = currentnode.getLink();
            }
            return currentnode.getData().toString();
        }
    }

}
