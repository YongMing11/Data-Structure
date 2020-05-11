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
public class Q8ListNode<T> {
    private T data;
    private Q8ListNode link;

    public Q8ListNode(T node, Q8ListNode link) {
        this.data = node;
        this.link = link;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Q8ListNode getLink() {
        return link;
    }

    public void setLink(Q8ListNode link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return getData()+ "--> " ;
    }


    
    
}
