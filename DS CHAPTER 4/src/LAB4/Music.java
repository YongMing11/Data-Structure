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
public class Music <T> {
    protected String title;
    protected String filename;

    public Music(String title, String filename) {
        this.title = title;
        this.filename = filename;
    }

    @Override
    public String toString() {
        return title ;
    }
    
    
}
