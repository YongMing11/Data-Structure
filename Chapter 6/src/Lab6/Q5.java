/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Forge-15 1650
 */
public class Q5 {
    public static void main(String[] args) {
        Packet[] p = new Packet[10];
        p[0]=new Packet("Video 1", 1);
        p[1]=new Packet("Voice 2", 2);
        p[2]=new Packet("Data 3", 0);
        p[3]=new Packet("Data 4", 0);
        p[4]=new Packet("Voice 5", 2);
        p[5]=new Packet("Video 6", 1);
        p[6]=new Packet("Voice 7", 2);
        p[7]=new Packet("Voice 8", 2);
        p[8]=new Packet("Data 9", 0);
        p[9]=new Packet("Video 10", 1);
        System.out.println("10 packets arrived");
        PriorityQueue<Packet> queue = new PriorityQueue<>();
        for(Packet i : p){
            System.out.println(i.toString());
            queue.enqueue(i);
        }
        System.out.println("");
        System.out.println("Processing 10 network packets");
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue().toString());
        }
    }
}
