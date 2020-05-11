/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial5;

import java.util.EmptyStackException;

/**
 *
 * @author Forge-15 1650
 */
public class Q2ArrayStack<T> implements StackInterface<T> {

    private T[] a;
    private int count = 0;

    public Q2ArrayStack() {
        a = (T[]) new Object[10];
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (a[a.length] != null) {
            return true;
        }
        return false;
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public void push(T data) {
        if(count==a.length){
            System.out.println("Stack is full, data is not added");
            return ;
        }
        a[count] = data;
        count++;
    }

    @Override
    public T pop() {
        if (count == 0) {
            throw new EmptyStackException();
        }
        count--;
        T output = a[count];
        a[count] = null;
        return output;
    }

    @Override
    public T peek() {
        if (count == 0) {
            throw new EmptyStackException();
        }
        return a[count-1];
    }

    @Override
    public void showStack() {
        if (count == 0) {
            System.out.println("The stack is empty");
        } else {
            for (int i = count - 1; i >= 0; i--) {
                System.out.print(" <-- " + a[i]);
            }
        }
    }

}
