/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Forge-15 1650
 */
public class Q8 {

    static int count = 0;
    static int start = 0;

    public static void main(String[] args) {
        System.out.println("My Music Play List");
        Scanner sc = new Scanner(System.in);
        Music a = new Music("one", "1.mp3");
        Music b = new Music("two", "2.mp3");
        Music c = new Music("three", "3.mp3");
        Music d = new Music("four", "4.mp3");
        Q8CircularLinkedList<Music> list = new Q8CircularLinkedList<>();
        list.addCircularNode(a);
        list.addCircularNode(b);
        list.addCircularNode(c);
        list.addCircularNode(d);
        int x;
        do {
            System.out.print("1 Play Music | 2 Forward | 3 Back | 4 Stop | -1 Exit : ");
            x = sc.nextInt();
            switch (x) {
                case 1: {
//                    System.out.println(count);
                    System.out.println("Play Music : " + list.getCircularItem(count));
                    break;
                }
                case 2: {
                    if (start == 0) {
                        System.err.println("Music is not playing");
                        break;
                    }
                    count++;
                    if (count == 4) {
                        count = 0;
                    }
//                    System.out.println(count);
                    System.out.println("Forward One Position - Play Music : " + list.getCircularItem(count));
                    break;
                }
                case 3: {
                    if (start == 0) {
                        System.err.println("Music is not playing");
                        break;
                    }
                    count--;
                    if (count == -1) {
                        count = 3;
                    }
//                    System.out.println(count);
                    System.out.println("Backward One Position - Play Music : " + list.getCircularItem(count));
                    break;
                }
                case 4: {
                    if (start == 0) {
                        System.err.println("Music is not playing");
                        break;
                    }
                    System.out.println("Stop Playing");
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
            start++;

        } while (x != -1);
    }

    public void playSound(String mp3) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:/MusicPlayer/fml.mp3").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}
