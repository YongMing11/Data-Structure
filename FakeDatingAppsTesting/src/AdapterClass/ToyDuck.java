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
public class ToyDuck implements Duck {
    private String name ;
    
    public ToyDuck(String name) {
        this.name = name;
    }

    @Override
    public void squek() {
        System.out.println("Squek");
    }
    
}
