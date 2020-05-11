/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial5;

/**
 *
 * @author Forge-15 1650
 */
public class Q3Stack<T> {

    private Q3ListNode head;
    private int count;

    public Q3Stack() {
        this.head = null;
    }

    public void push(T data) {
        head = new Q3ListNode(data, head);
        count++;
    }

    public T pop() {
        if (head == null) {
            System.out.println("The stack is empty");
            return null;
        } else {
            T data = (T) head.getData();
            head = head.getLink();
            count--;
            return data;
        }
    }

    public T peek() {
        if (head == null) {
            System.out.println("The stack is empty");
            return null;
        } else {
            return (T) head.getData();
        }
    }

    public int length() {
        return count;
    }

    public void showStack() {
        Q3ListNode currentnode = head;
        if (head == null) {
            System.out.println("The stack is empty");
        } else {
            while (currentnode != null) {
                System.out.print(currentnode.toString());
                currentnode = currentnode.getLink();
            }
        }
    }
}
