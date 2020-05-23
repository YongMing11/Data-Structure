/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUTORIAL2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner sc = new Scanner(System.in);
//        System.out.print("The parameters value are : ");
//        String x = sc.nextLine();
//        String[] y = x.split(" ");
//        List<String> z = new ArrayList<String>(Arrays.asList(y));
//        generic(z);
            
            generic("Hello","World");
            generic(12.4,64.3);
            generic(20,35);
            generic("Welcome","Welcome");
            
    }
    
    public static<T> void generic(T t, T u){
        if( t instanceof Integer){
            System.out.println("The parameters value are "+(Integer)t+" and "+(Integer)u);
            System.out.println("The sum of the integer is "+ ((Integer)t+(Integer)u));
        }else if( t instanceof Double){
             System.out.println("The parameters value are "+(Double)t+" and "+(Double)u);
             System.out.println("The sum of the double is "+ ((Double)t+(Double)u));
        }
        else if( t instanceof String){
             System.out.println("The parameters value are "+(String)t+" and "+(String)u);
             if(((String)t).equals((String)u)){
                 System.out.println("The string is equal");
             
             }
             else{
                 System.out.println("The string is not equal");
             
             }
        }
        
    
    
    
    
    
    }
    
    
    
    //METHOD 2
//    public static<T extends List<String>> void generic(T y){
//        int digit = 0;
//        for(int i=0;i<y.get(0).length();i++){
//            if(Character.isDigit(y.get(0).charAt(i))){
//                digit=0;
//            }else if (y.get(0).charAt(i) == '.') {
//                digit = 1;
//                break;
//            } else {
//                digit = 2;
//            }
//        }
//        if (digit == 0) {
//            System.out.println("The sum of the integer is " + (Integer.parseInt(y.get(0)) + Integer.parseInt(y.get(2))));
//        } else if (digit == 1) {
//            System.out.println("The sum of the double is " + (Double.parseDouble(y.get(0)) + Double.parseDouble(y.get(2))));
//        } else if (digit == 2) {
//            if (y.get(0).equals(y.get(2))) {
//                System.out.println("The string is equal");
//            } else {
//                System.out.println("The string is not equal");
//            }
//        
//        }
//    
//    
//    
//    }
//
    
    
    //METHOD 3
//    public static void generic(String[] y) {
//        int digit = 0;
//        for (int i = 0; i < y[0].length(); i++) {
//            if (Character.isDigit(y[0].charAt(i))) {
//                digit = 0;
//            } else if (y[0].charAt(i) == '.') {
//                digit = 1;
//                break;
//            } else {
//                digit = 2;
//            }
//        }
//        if (digit == 0) {
//            System.out.println("The sum of the integer is " + (Integer.parseInt(y[0]) + Integer.parseInt(y[2])));
//        } else if (digit == 1) {
//            System.out.println("The sum of the double is " + (Double.parseDouble(y[0]) + Double.parseDouble(y[2])));
//        } else if (digit == 2) {
//            if (y[0].equals(y[2])) {
//                System.out.println("The string is equal");
//            } else {
//                System.out.println("The string is not equal");
//            }
//        }
//    }

}
