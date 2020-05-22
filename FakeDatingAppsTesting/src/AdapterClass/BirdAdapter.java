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
public class BirdAdapter implements Duck {
    private Bird bird ;
    public BirdAdapter(Bird b) {
        bird = b;
    }
    
    @Override
    public void squek() {
        bird.chirk();
    }
    
}
