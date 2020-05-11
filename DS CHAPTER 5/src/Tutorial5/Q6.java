/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial5;

import java.util.Random;

/**
 *
 * @author Forge-15 1650
 */
public class Q6 {
    public static void main(String[] args) {
        Stack<Integer> x = new Stack<>();
        System.out.print("The random numbers are : ");
        int[] test = {22,83,85,100,63,23,35,9,52,16};
        for(int i:test){
            System.out.print(i+" ");
        }
        Random r = new Random();
        int[] a = new int[10];
//        for(int i=0;i<a.length;i++){
//            a[i]=r.nextInt(100)+1;
//            System.out.print(a[i] +" ");
//        }
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a.length;j++){
//                if(i%2==0){
//                    if(a[j]%2!=0){
//                        x.push(a[j]);
//                        a[j]=0;
//                        break;
//                    }
//                }else{
//                    if(a[j]%2==0 && a[j]!=0){
//                        x.push(a[j]);
//                        a[j]=0;
//                        break;
//                    }
//                }
//            }
//        }
        for(int i=0;i<test.length;i++){
            for(int j=0;j<test.length;j++){
                if(i%2==0){
                    if(test[j]%2!=0){
                        x.push(test[j]);
                        test[j]=0;
                        break;
                    }
                }else{
                    if(test[j]%2==0 && test[j]!=0){
                        x.push(test[j]);
                        test[j]=0;
                        break;
                    }
                }
            }
        }
        System.out.print("\nThe numbers in the stack : ");
        x.showStack();
        System.out.println("\nThe numbers remain in the array : "+x.length());
    }
}
