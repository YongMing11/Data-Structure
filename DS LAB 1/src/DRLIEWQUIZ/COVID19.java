/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRLIEWQUIZ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class COVID19 {

    private int count;
    private String[] date;
    private int[] time;
    private String[] id;
    private double[] amount;

    public COVID19() {
    }

    public void record() {
        try {
            count = 0;
            Scanner sc = new Scanner(new FileInputStream("virus.txt"));
            while (sc.hasNext()) {
                sc.nextLine();
                count++;
                
            }
            sc.close();
            sc = new Scanner(new FileInputStream("virus.txt"));
            date = new String[count];
            time = new int[count];
            id = new String[count];
            amount = new double[count];
            for (int i = 0; i < count; i++) {
                date[i] = sc.next();
                time[i] = sc.nextInt();
                id[i] = sc.next();
                amount[i] = sc.nextDouble();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error!!!");
        }

    }

    public ArrayList<String> returnid(String in) {
        int pointer=0;
        String day="";
        for(int i=0;i<count;i++){
            if(id[i].equals(in)){
                pointer = time[i];
                day=date[i];
            }}
        ArrayList<String>x=new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if((pointer-100<time[i])&&(pointer+100>time[i])&&(day.equals(date[i]))){
                x.add(id[i]);
            }
        }
        x.remove(in);
        return x;
    
    }
}

