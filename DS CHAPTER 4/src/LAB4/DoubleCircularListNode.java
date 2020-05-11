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
public class DoubleCircularListNode<T> {
    private T data;
    private DoubleCircularListNode nextLink;
    private DoubleCircularListNode previousLink;

    public DoubleCircularListNode(T data, DoubleCircularListNode nextLink, DoubleCircularListNode previousLink) {
        this.data = data;
        this.nextLink = nextLink;
        this.previousLink = previousLink;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubleCircularListNode getNextLink() {
        return nextLink;
    }

    public void setNextLink(DoubleCircularListNode nextLink) {
        this.nextLink = nextLink;
    }

    public DoubleCircularListNode getPreviousLink() {
        return previousLink;
    }

    public void setPreviousLink(DoubleCircularListNode previousLink) {
        this.previousLink = previousLink;
    }

    @Override
    public String toString() {
        return data +"";
    }
    
    
}
