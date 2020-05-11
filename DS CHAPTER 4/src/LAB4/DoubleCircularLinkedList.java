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
public class DoubleCircularLinkedList<T> {
    public DoubleCircularListNode head;
    public DoubleCircularListNode tail;

    public DoubleCircularLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    public void addRightNode(T data){
        DoubleCircularListNode currentnode = head;
        DoubleCircularListNode newnode = new DoubleCircularListNode(data, null, null);
        if(head==null){
            head = newnode;
            tail = head;
            tail.setNextLink(head);
            head.setPreviousLink(tail);
        }else{
            while(currentnode.getNextLink()!=head){
                currentnode = currentnode.getNextLink();
            }
            currentnode.setNextLink(newnode);
            newnode.setPreviousLink(currentnode);
            tail = newnode;
            tail.setNextLink(head);
            head.setPreviousLink(tail);
        }
    }
    
    public DoubleCircularListNode forward(DoubleCircularListNode current){
        DoubleCircularListNode currentnode = head;
        while(currentnode!= current){
            currentnode = currentnode.getNextLink();
        }
        return currentnode.getNextLink();
    }
    public DoubleCircularListNode backward(DoubleCircularListNode current){
        DoubleCircularListNode currentnode = head;
        while(currentnode!= current){
            currentnode = currentnode.getNextLink();
        }
        return currentnode.getPreviousLink();
    }
    
}
