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
public class Stack<T> {

    private ListNode head;
    private int count;
    
    public Stack() {
        this.head = null;
    }

    public void push(T data) {
        head = new ListNode(data, head);
        count++;
    }

    public T pop() {
        if (head == null) {
            return null;
        } else {
            T data = (T)head.getData();
            head = head.getLink();
            count--;
            return data;
        }
    }
    public T peek() {
        if (head == null) {
            return null;
        } else {
            return (T)head.getData();
        }
    }
    public int length(){
        return count;
    }
    public void showStack(){
        ListNode currentnode = head;
        if(head==null){
            System.out.println("The stack is empty");
        }else{
            while(currentnode!=null){
                System.out.print(currentnode.toString());
                currentnode =currentnode.getLink();
            }
        }
    }
    
    
    

    

}
