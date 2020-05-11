/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author Forge-15 1650
 */
public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public void check(){
        System.out.print("Hour: "+hour+" Minute: "+minute +" ");
        if(hour>=0&&hour<24&&minute>=0&&minute<60){
            if(hour>12)
            System.out.print(hour-12+":"+minute+" PM");
            else
            System.out.print(hour+":"+minute+" PM");
        
        }
        else
            System.out.print("Invalid time input");
        System.out.println("");
    }
}
