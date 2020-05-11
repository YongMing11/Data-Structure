/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {

    public static void main(String[] args) {
        Random r = new Random();
        String[] number = {"One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] colour = {"Yellow", "Red", "Green", "Blue"};
        System.out.println("Player 1 Card");
        Queue<String> p1 = new Queue<>();
        int[] p1n = new int[5];
        int[] p1c = new int[5];
        for (int i = 0; i < p1n.length; i++) {
            p1n[i] = r.nextInt(10) + 1;
            p1c[i] = r.nextInt(4) + 1;
            if (!p1.contains(number[p1n[i] - 1] + " " + colour[p1c[i] - 1])) {
                p1.enqueue(number[p1n[i] - 1] + " " + colour[p1c[i] - 1]);
            } else {
                i--;
            }
        }
        p1.showQueue();
        System.out.println("");
        System.out.println("Player 2 Card");
        Queue<String> p2 = new Queue<>();
        int[] p2n = new int[5];
        int[] p2c = new int[5];
        for (int i = 0; i < p2n.length; i++) {
            p2n[i] = r.nextInt(10) + 1;
            p2c[i] = r.nextInt(4) + 1;
            if (!p2.contains(number[p2n[i] - 1] + " " + colour[p2c[i] - 1])
                    && !p1.contains(number[p2n[i] - 1] + " " + colour[p2c[i] - 1])) {
                p2.enqueue(number[p2n[i] - 1] + " " + colour[p2c[i] - 1]);
            } else {
                i--;
            }
        }
        p2.showQueue();
        System.out.println("");

        int player1 = 0;
        int player2 = 0;
        for (int i = 0; i < 5; i++) {
            if (p1n[i] > p2n[i]) {
                player1++;
            } else if (p2n[i] > p1n[i]) {
                player2++;
            } else {
                if (p1c[i] > p2c[i]) {
                    player1++;
                } else {
                    player2++;
                }
            }
        }
        System.out.println("Player 1 Score : "+player1);
        System.out.println("Player 2 Score : "+player2);
        if(player1>player2){
            System.out.println("Player 1 WINS!");
        }else
            System.out.println("Player 2 WINS!");
            
    }
}
