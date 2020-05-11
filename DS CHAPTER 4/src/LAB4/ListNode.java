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
public class ListNode<T extends Comparable<T>> {
    private T data;
    private ListNode link;

    public ListNode(T node, ListNode link) {
        this.data = node;
        this.link = link;
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
        return getData()+ "--> " ;
    }


    
    
}
