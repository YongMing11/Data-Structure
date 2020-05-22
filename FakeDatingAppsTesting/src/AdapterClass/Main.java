/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterClass;

/**
 *
 * @author Forge-15 1650
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck td = new ToyDuck("Duck");
        td.squek();
        Bird b = new Bird("Bird");
        b.chirk();
        Duck fakebird = new BirdAdapter(b);
        fakebird.squek();
    }
    
}
