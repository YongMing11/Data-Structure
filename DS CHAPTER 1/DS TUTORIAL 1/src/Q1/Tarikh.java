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
public class Tarikh {

    private int day;
    private int month;
    private int year;

    public Tarikh(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d", day)+"/"+ String.format("%02d", month)+"/"+year;
    }

    //DR ADELEH ANSWER
//    public String toString() {
//        String str ;
//        if (day >= 10) {
//            str = day + "/";
//        }else
//            str = "0"+day+"/";
//        if(month>=10){
//            str += month+"/"+year;
//        }else
//            str += "0"+month+"/"+year;
//
//        return str;
//    }

}
