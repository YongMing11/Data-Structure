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
public class Q2Queue<T> implements ArrayQueue<T> {

    private T[] data;
    private int size;

    public Q2Queue(int arraysize) {
        data = (T[]) new Object[arraysize];
    }

    @Override
    public boolean isEmpty() {
        if (data[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (data[data.length - 1] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(T a) {
        if (isFull()) {
            return;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = a;
                    size++;
                    break;
                }
            }
        }
    }

    @Override
    public T dequeue() {
        if (data[0] == null) {
            return null;
        } else {
            size--;
            T temp = data[0];
            for (int i = 0; i < data.length; i++) {
                if (data[i + 1] != null) {
                    data[i] = data[i + 1];
                    data[i + 1] = null;
                } else {
                    break;
                }
            }
            return temp;
        }
    }

    @Override
    public T peek() {
        if (data[0] == null) {
            return null;
        } else {
            T temp = data[0];
            return temp;
        }
    }

    @Override
    public void showQueue() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.print(data[i] + " --> ");
            }else
                break;
        }
    }

}
