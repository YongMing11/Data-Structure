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
public class Q3 {

    public static void main(String[] args) {
        SimpleNetwork a = new SimpleNetwork("10.1.1.1", "255.255.255.224", true);
        SimpleNetwork b = new SimpleNetwork("10.1.1.2", "255.255.255.224", false);
        SimpleNetwork c = new SimpleNetwork("10.1.2.70", "255.255.255.224", true);
        SimpleNetwork d = new SimpleNetwork("10.1.1.15", "255.255.255.224", true);
        System.out.println("Host Name: Host 1 " + a.toString());
        System.out.println("Host Name: Host 2 " + b.toString());
        System.out.println("Host Name: Host 3 " + c.toString());
        System.out.println("Host Name: Host 4 " + d.toString());
        boolean ping = false;
        String[] x = a.getIP();
        String[] y = b.getIP();

        for (int i = 0; i < 3; i++) {

            if (Integer.parseInt(x[i]) == Integer.parseInt(y[i])) {
                ping = true;
            } else {
                System.out.println("Host 1 cannot ping Host 2 because the destination Host 2 is located in different network.");
                ping = false;
                break;
            }
        }
        x = a.getSM();
        y = b.getSM();
        if (ping) {

            for (int i = 0; i < 3; i++) {

                if (Integer.parseInt(x[i]) == Integer.parseInt(y[i])) {
                    ping = true;
                } else {
                    System.out.println("Host 1 cannot ping Host 2 because the destination Host 2 is located in different network.");
                    ping = false;
                    break;
                }
            }
        }
        if (ping) {
            if (a.isStatus() && b.isStatus()) {
                System.out.println("Host 1 can ping Host 2");
            } else {
                System.out.println("Host 1 cannot ping Host 2 because the destination Host 2 is down");
            }
        }
        //HOST3
        x = a.getIP();
        y = c.getIP();

        for (int i = 0; i < 3; i++) {

            if (Integer.parseInt(x[i]) == Integer.parseInt(y[i])) {
                ping = true;
            } else {
                System.out.println("Host 1 cannot ping Host 3 because the destination Host 3 is located in different network.");
                ping = false;
                break;
            }
        }
        x = a.getSM();
        y = c.getSM();
        if (ping) {

            for (int i = 0; i < 3; i++) {

                if (Integer.parseInt(x[i]) == Integer.parseInt(y[i])) {
                    ping = true;
                } else {
                    System.out.println("Host 1 cannot ping Host 3 because the destination Host 3 is located in different network.");
                    ping = false;
                    break;
                }
            }
        }
        if (ping) {
            if (a.isStatus() && c.isStatus()) {
                System.out.println("Host 1 can ping Host 3");
            } else {
                System.out.println("Host 1 cannot ping Host 3 because the destination Host 3 is down");
            }
        }
        //HOST4
        x = a.getIP();
        y = d.getIP();

        for (int i = 0; i < 3; i++) {

            if (Integer.parseInt(x[i]) == Integer.parseInt(y[i])) {
                ping = true;
            } else {
                System.out.println("Host 1 cannot ping Host 4 because the destination Host 4 is located in different network.");
                ping = false;
                break;
            }
        }
        x = a.getSM();
        y = d.getSM();
        if (ping) {

            for (int i = 0; i < 3; i++) {

                if (Integer.parseInt(x[i]) == Integer.parseInt(y[i])) {
                    ping = true;
                } else {
                    System.out.println("Host 1 cannot ping Host 4 because the destination Host 4 is located in different network.");
                    ping = false;
                    break;
                }
            }
        }
        if (ping) {
            if (a.isStatus() && d.isStatus()) {
                System.out.println("Host 1 can ping Host 4");
            } else {
                System.out.println("Host 1 cannot ping Host 4 because the destination Host 4 is down");
            }
        }
    }
}
