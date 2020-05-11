/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRLIEWQUIZ;

/**
 *
 * @author Forge-15 1650
 */
public class Tester {
    public static void main(String[] args) {
        
        COVID19 a = new COVID19();
        a.record();
        System.out.println(a.returnid("523456-11-9100").toString());
    }
}
