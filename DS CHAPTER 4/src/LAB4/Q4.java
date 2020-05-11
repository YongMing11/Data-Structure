/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class Q4 {
    public static void main(String[] args) {
        LinkedList<Character> p1 = new LinkedList<>();
        LinkedList<Character> p2 = new LinkedList<>();
        int c = 0;
        int c2 = 0;
        Random r = new Random();
        System.out.println("Player 2 start first");
        do{ 
            c = r.nextInt(6)+1;
            for(int i=0;i<c;i++){
            p1.add('*');
            }
            c = r.nextInt(6)+1;
            for(int i=0;i<c;i++){
            p2.add('*');
            }
            System.out.println("Player 2:"+p2.toString());
            System.out.println("Player 1:"+p1.toString());
            if(p1.length()>=20){
                System.out.println("Player 1 wins the game");
                break;
            }else if(p2.length()>=20){
                System.out.println("Player 2 wins the game");
                break;
            }
        }while(true);
    }
}
