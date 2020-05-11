/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL4;

/**
 *
 * @author Forge-15 1650
 */
public class ListNode<T> {

    private T data;
    private ListNode link;

    public ListNode() {
        this.data = null;
        this.link = null;
    }

    public ListNode(T a, ListNode b) {
        this.data = a;
        this.link = b;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode getLink() {
        return link;
    }

    public void setLink(ListNode link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return data + " --> ";
    }

}
