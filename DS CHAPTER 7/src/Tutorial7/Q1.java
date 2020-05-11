/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial7;

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
        BST<Integer> a = new BST<>();
        int[] arr = {50,30,25,71,80,99,40,1,7,5};
        for(int i: arr){
            a.addNode(i);
        }
        a.setOrder(a.PREORDER);
        System.out.print("PREORDER : ");
        a.Q.showQueue();
        System.out.println("");
        a.setOrder(a.INORDER);
        System.out.print("INORDER : ");
        a.Q.showQueue();
        System.out.println("");
        a.setOrder(a.POSTORDER);
        System.out.print("POSTORDER : ");
        a.Q.showQueue();
        System.out.println("");
    }
    
}
