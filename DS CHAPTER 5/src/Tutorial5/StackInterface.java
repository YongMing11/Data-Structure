/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial5;

import java.lang.reflect.Array;

/**
 *
 * @author Forge-15 1650
 */
public interface StackInterface<T> {
    
    public boolean isEmpty();
    public boolean isFull();
    public int getSize();
    public void push(T data);
    public T pop();
    public T peek();
    public void showStack();
    
}
