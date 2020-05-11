/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial6;

/**
 *
 * @author Forge-15 1650
 */
public interface ArrayQueue<T> {
    
    public boolean isEmpty();
    public boolean isFull();
    public int getSize();
    public void enqueue(T data);
    public T dequeue();
    public T peek();
    public void showQueue();
}
