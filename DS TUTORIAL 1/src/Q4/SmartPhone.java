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
public class SmartPhone implements Comparable<SmartPhone> {

    private String name;
    private int price;

    public SmartPhone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int compareTo(SmartPhone o) {
        if (price == o.getPrice()) {
            return 0;
        } else if (price > o.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return  name + "(RM " + price + ')';
    }
    

}
