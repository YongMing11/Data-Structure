/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Forge-15 1650
 */
public class Q4 {

    public static void main(String[] args) {
//        ArrayList<String> name = new ArrayList<>();
//        ArrayList<Integer> price = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        int i = 0;
//        while (!(name.get(i).equals("end"))) {
//            System.out.print("Enter phone and price: ");
//            name.add(sc.next());
//            if (!(name.get(i).equals("end"))) {
//                price.add(sc.nextInt());
//                i++;
//            }
//        }
//
//        SmartPhone[] x = new SmartPhone[i];
//        for(int j=0;j<i;j++){
//            x[j]= new SmartPhone(name.get(j),price.get(j));
//        }

        ArrayList<SmartPhone> a = new ArrayList<SmartPhone>();
        a.add(new SmartPhone("iPhone", 2400));
        a.add(new SmartPhone("Samsung", 2200));
        a.add(new SmartPhone("Nokia", 1400));
        a.add(new SmartPhone("LG", 1800));

        System.out.println("List of Smart Phone : ");
        for (SmartPhone x : a) {
            System.out.print(x.toString());
        }
        Collections.sort(a);
        System.out.println("\nList of Smart Phone : ");
        for (SmartPhone x : a) {
            System.out.print(x.toString());
        }

    }
}
