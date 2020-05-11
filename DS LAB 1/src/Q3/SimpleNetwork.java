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
public class SimpleNetwork {

    private String ip = "";
    private String sm = "";
    private boolean status;
    private String[] IP;
    private String[] SM;

    public SimpleNetwork(String ip, String sm, boolean status) {
        this.ip = ip;
        this.sm = sm;
        this.status = status;
        this.IP = ip.split("\\.");
        this.SM = sm.split("\\.");

    }

    public boolean isStatus() {
        return status;
    }

    public String[] getIP() {
        return IP;
    }

    public String[] getSM() {
        return SM;
    }

    @Override
    public String toString() {
        if (status) {
            return "IP: " + ip + " Subnet Mask:" + sm + " Status: UP";
        } else {
            return "IP: " + ip + " Subnet Mask:" + sm + " Status: DOWN";
        }
    }

}
