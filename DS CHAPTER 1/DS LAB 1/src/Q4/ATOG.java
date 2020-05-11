/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

/**
 *
 * @author Forge-15 1650
 */
public class ATOG extends banner {

    public ATOG(char w) {
        this.w = w;
    }
    public void display(){
        
        if(w=='A'){
        System.out.println("  *");
        System.out.println(" * *");
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        }
        if(w=='B'){
        System.out.println("****");
        System.out.println("*   *");
        System.out.println("****");
        System.out.println("*   *");
        System.out.println("****");
        }
        if(w=='F'){
        System.out.println("****");
        System.out.println("*");
        System.out.println("***");
        System.out.println("*");
        System.out.println("*");
        }
    }
}
