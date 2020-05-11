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
public class DPlan extends ISP {
    private double dplan;
    public DPlan(int mbps, int gb) {
        super(mbps, gb);
    }
    public double price(){
        dplan = 10*mbps + 0.2*gb;
        return dplan;
        
    }
    
}
