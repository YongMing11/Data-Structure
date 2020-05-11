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
public class Q3ListNode<T extends Course> {
    private T data;
    private Q3ListNode link;

    public Q3ListNode(T node, Q3ListNode link) {
        this.data = node;
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
        return "Course : "+getData().name +
                " ("+getData().getCode()+") - "+ 
                getData().getCredit()+" credit hours. Grade : "+getData().getGrade()
                +" -->\n" ;
    }
}
