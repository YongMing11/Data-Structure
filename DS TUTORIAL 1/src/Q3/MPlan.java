/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

/**
 *
 * @author Forge-15 1650
 */
public class MPlan extends ISP {

    private double mplan;

    public MPlan(int mbps, int gb) {
        super(mbps, gb);
    }

    public double price() {
        mplan = 5 * mbps + 0.8 * gb;
        return mplan;

    }
}
