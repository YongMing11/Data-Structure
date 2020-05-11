/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q8v2 {

    public static void main(String[] args) {
        DoubleCircularLinkedList<String> list = new DoubleCircularLinkedList<>();
        list.addRightNode("one");
        list.addRightNode("two");
        list.addRightNode("three");
        list.addRightNode("four");
        System.out.println("My Music Play List");
        Scanner sc = new Scanner(System.in);
        int input = 0;
        DoubleCircularListNode currentnode = null;
        boolean on = false;
        while (input != -1) {
            System.out.print("1 Play Music | 2 Forward | 3 Back | 4 Stop | -1 Exit : ");
            input = sc.nextInt();
            switch (input) {
                case 1: {
                    if (currentnode == null) {
                        currentnode = list.head;
                        System.out.println("Play Music : " + currentnode.getData());
                    } else {
                        System.out.println("Play Music : " + currentnode.getData());
                    }
                    on = true;
                    break;
                }
                case 2: {
                    if (on == true) {
                        currentnode = list.forward(currentnode);
                        System.out.println("Forward One Position - Play Music : " + currentnode.getData());
                    }else{
                        System.out.println("The music is off");
                    }
                    break;
                }
                case 3: {
                    if(on==true){
                    currentnode = list.backward(currentnode);
                    System.out.println("Backward One Position - Play Music : " + currentnode.getData());
                    }else{
                        System.out.println("The music is off");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Stop Playing");
                    on = false;
                    break;
                }
                case -1: {
                    System.out.println("Exit Music Player");
                    break;
                }
                default: {
                    System.out.println("Input error!");
                }
            }

        }
    }
}
