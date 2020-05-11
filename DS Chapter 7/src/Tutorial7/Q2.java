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
public class Q2 {
    public static void main(String[] args) {
        char[] c = {'F','A','C','U','L','T','Y'};
        BST<Character> bst = new BST<>();
        for(char i: c){
            bst.addNode(i);
        }
        System.out.println("The number of elements in the tree : "+bst.getSize());
        bst.setOrder(bst.PREORDER);
        System.out.print("The tree elements - PREORDER : ");
        bst.Q.showQueue();
        System.out.println("");
        bst.setOrder(bst.INORDER);
        System.out.print("The tree elements - INORDER : ");
        bst.Q.showQueue();
        System.out.println("");
        bst.setOrder(bst.POSTORDER);
        System.out.print("The tree elements - POSTORDER : ");
        bst.Q.showQueue();
        System.out.println("");
        
        System.out.println("Remove 1 Character L");
        bst.remove('L');
        System.out.println("The number of elements in the tree : "+bst.getSize());
        bst.setOrder(bst.PREORDER);
        System.out.print("The tree elements - PREORDER : ");
        bst.Q.showQueue();
        System.out.println("");
        bst.setOrder(bst.INORDER);
        System.out.print("The tree elements - INORDER : ");
        bst.Q.showQueue();
        System.out.println("");
        bst.setOrder(bst.POSTORDER);
        System.out.print("The tree elements - POSTORDER : ");
        bst.Q.showQueue();
        System.out.println("");
    }
}
