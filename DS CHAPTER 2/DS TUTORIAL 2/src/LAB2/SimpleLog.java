/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

/**
 *
 * @author Forge-15 1650
 */
public interface SimpleLog<T> {
    public void set(T[] t);
    public void full();
    public void getsize();
    public void search(String s);
    public void delete();
    public void display();
}
