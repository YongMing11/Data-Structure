/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class UNOARRAY<T> implements UNO<T> {

    private int n;
    private String[] colour={"Red","Yellow","Green","Blue","Draw Four","Pick Colour"};
    private String[] card={"Zero","One","Two","Three","Four","Five","Six","Seven",
        "Eight","Nine","Ten","Skip","Reverse","Draw Two"};
    private int random;
    private String out= "";

    public UNOARRAY(T num) {
        this.n = (int) num;
    }

    public void draw() {
        Random r = new Random();
        
        for(int i=0;i<n;i++){
            random = r.nextInt(6);
            if(random==4||random==5){
                out+=colour[random]+" ::";
            }else{
                out+=colour[random];
                random = r.nextInt(14);
                out+= " "+card[random]+" ::";
            }
                
        
        }
        
    }

    @Override
    public String toString() {
        return out;
    }

}
