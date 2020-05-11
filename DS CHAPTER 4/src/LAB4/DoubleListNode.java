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
public class DoubleListNode<T> {
    private T data;
    private DoubleListNode previousLink;
    private DoubleListNode nextLink;

    public DoubleListNode() {
        this.data = null;
        this.previousLink = null;
        this.nextLink = null;
    }

    public DoubleListNode(T data, DoubleListNode previousLink, DoubleListNode nextLink) {
        this.data = data;
        this.previousLink = previousLink;
        this.nextLink = nextLink;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubleListNode getPreviousLink() {
        return previousLink;
    }

    public void setPreviousLink(DoubleListNode previousLink) {
        this.previousLink = previousLink;
    }

    public DoubleListNode getNextLink() {
        return nextLink;
    }

    public void setNextLink(DoubleListNode nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public String toString() {
        return " <-- " + data + " --> ";
    }
    
    
}
