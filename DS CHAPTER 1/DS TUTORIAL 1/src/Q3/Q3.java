/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mbps: ");
        int mbps = sc.nextInt();
        System.out.print("Gb: ");
        int gb = sc.nextInt();
        System.out.println(mbps + "Mbps Subscription and " + gb + "Gb");
        ISP a = new ISP(mbps, gb);
        DPlan b = new DPlan(mbps, gb);
        MPlan c = new MPlan(mbps, gb);
        System.out.println("Plan : DPlanwith price RM: " + b.price());
        System.out.println("Plan : MPlanwith price RM: " + c.price());

        if (b.price() > c.price()) {
            System.out.println("MPlan is cheaper as compared to DPlan");
        } else if (b.price() < c.price()) {
            System.out.println("DPlan is cheaper as compared to MPlan");
        } else if (b.price() == c.price()) {
            System.out.println("MPlan is same as compared to MPlan");
        }
    }
}
