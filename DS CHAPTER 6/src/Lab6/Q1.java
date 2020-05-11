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
public class Q1 {

    public static void main(String[] args) {
        String str = "D 400 | W 300 | W 700 | D 200 | D 450 | W 120";
        System.out.println("Enter transactions : " + str);
        str = str.replaceAll(" ", "");
        String[] s = str.split("[\\|]");
        Queue<String> queue = new Queue<>();
        for (String i: s) {
            queue.enqueue(i.charAt(0)+" "+i.substring(1));
        }
        queue.showQueue();
        System.out.println("");
        int balance = 500;
        System.out.println("Initial Balance : "+balance);
        while(!queue.isEmpty()){
            String q = queue.dequeue();
//            System.out.println(q);
            char transaction = q.charAt(0);
            int fee = Integer.parseInt(q.substring(2, q.length()));
            switch(transaction){
                case 'D':{
                    balance += fee;
                    System.out.print(String.format("%-23s", "Deposit "+fee));
                    System.out.print("New Balance "+balance);
                    System.out.println("");
                    break;
                }
                case 'W':{
                    if(fee>balance){
                        System.out.print(String.format("%-23s", "Withdraw "+fee+" Rejected"));
                        System.out.print("New Balance "+balance);
                    }else{
                        balance -= fee;
                        System.out.print(String.format("%-23s", "Withdraw "+fee));
                        System.out.print("New Balance "+balance);
                    
                    }
                    System.out.println("");
                    break;
                }
            }
        }
    }
}
