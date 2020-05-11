/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q4 {

    public static void main(String[] args) {
        Q4Queue<String> transaction = new Q4Queue<>();
        Q4Queue<Integer> priceBuy = new Q4Queue<>();
        Q4Queue<Integer> amountBuy = new Q4Queue<>();
        Q4Queue<Integer> priceSell = new Q4Queue<>();
        Q4Queue<Integer> amountSell = new Q4Queue<>();
        System.out.println("List of Transactions");
        try {
            Scanner sc = new Scanner(new FileInputStream("lab6Q4.txt"));
            while (sc.hasNext()) {
                String str = sc.nextLine();
                String[] s = str.split(" ");
                if (s[1].equals("B")) {
                    amountBuy.enqueue(Integer.parseInt(s[2]));
                    priceBuy.enqueue(Integer.parseInt(s[3]));
                    transaction.enqueue("Day " + s[0] + " : Buy " + s[2]
                            + " shares at RM " + s[3]);
                } else {
                    amountSell.enqueue(Integer.parseInt(s[2]));
                    priceSell.enqueue(Integer.parseInt(s[3]));
                    transaction.enqueue("Day " + s[0] + " : Sell " + s[2]
                            + " shares at RM " + s[3]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        transaction.showQueue();
        int sellPrice = priceSell.dequeue();
        int sellAmount = amountSell.dequeue();
        int gainloss = 0;
        while (!amountBuy.isEmpty()) {
            int buyAmount = amountBuy.dequeue();
            int buyPrice = priceBuy.dequeue();
            if (sellAmount > buyAmount) {
                sellAmount = sellAmount - buyAmount;
                gainloss += buyAmount * (sellPrice - buyPrice);
            } else if (sellAmount < buyAmount) {
                gainloss += sellAmount * (sellPrice - buyPrice);
                if (!amountSell.isEmpty()) {
                    sellPrice = priceSell.dequeue();
                    sellAmount = amountSell.dequeue();
                } else {
                    break;
                }
            }
        }
        if (gainloss > 0) {
            System.out.println("Total Gain " + gainloss);
        } else if (gainloss < 0) {
            System.out.println("Total Loss" + gainloss);
        } else {
            System.out.println("No Gain No Loss");
        }
    }
}
