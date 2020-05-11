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
public class Q3ListNode<T> {
    private T data;
    private Q3ListNode link;

    public Q3ListNode(T data, Q3ListNode link) {
        this.data = data;
        this.link = link;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Q3ListNode getLink() {
        return link;
    }

    public void setLink(Q3ListNode link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return ""+data ;
    }
}
