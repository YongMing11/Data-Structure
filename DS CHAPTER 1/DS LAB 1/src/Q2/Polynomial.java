/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author Forge-15 1650
 */
public class Polynomial {

    private double input;
    private double[] co;

    public Polynomial(double input, double[] co) {
        this.input = input;
        this.co = co;
    }

    public double operation() {
        double ans = 0;
        for (int i = 3,j=0; i >= 0; i--,j++) {
            ans += co[j]*Math.pow(input, i);
        }
        return ans;
    }
}
