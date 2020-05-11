/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Forge-15 1650
 */
public class Q5ListNode<T extends Packet> {
    private T data;
    private Q5ListNode link;

    public Q5ListNode(T data, Q5ListNode link) {
        this.data = data;
        this.link = link;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Q5ListNode getLink() {
        return link;
    }

    public void setLink(Q5ListNode link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return data+ " --> ";
    }
    
    
}
