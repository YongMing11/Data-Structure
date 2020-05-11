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
public class Q3 {

    public static void main(String[] args) {
        char[] c = {'F', 'A', 'C', 'U', 'L', 'T', 'Y'};
        Q3BST<Character> a = new Q3BST<>();
        for (char i : c) {
            a.addNode(i);
        }
        System.out.println("BST Implementation Using Array");
        System.out.println("The number of elements in the tree : " + a.getSize());
        a.setOrder(a.PREORDER);
        System.out.print("The tree elements - PREORDER : ");
        a.Q.showQueue();
        System.out.println("");
        a.setOrder(a.INORDER);
        System.out.print("The tree elements - INORDER : ");
        a.Q.showQueue();
        System.out.println("");
        a.setOrder(a.POSTORDER);
        System.out.print("The tree elements - POSTORDER : ");
        a.Q.showQueue();
        System.out.println("");

        System.out.println("Remove 1 Character L");
        a.removeNode('L');
        System.out.println("The number of elements in the tree : " + a.getSize());
        a.setOrder(a.PREORDER);
        System.out.print("The tree elements - PREORDER : ");
        a.Q.showQueue();
        System.out.println("");
        a.setOrder(a.INORDER);
        System.out.print("The tree elements - INORDER : ");
        a.Q.showQueue();
        System.out.println("");
        a.setOrder(a.POSTORDER);
        System.out.print("The tree elements - POSTORDER : ");
        a.Q.showQueue();
        System.out.println("");
    }
}
