/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Daniel
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList();
        
        // Adding
        newList.addLast(700);       // 0
        newList.addLast(1000);      // 1
        newList.addLast(150);       // 2
        newList.addLast(20000);     // 3
        newList.addLast(250);       // 4
        newList.addLast(3000000);   // 5
        newList.addLast(350);       // 6
        
        // Removers
        // newList.deleteLast();
        // newList.deleteFirst();
        // newList.delete(4);
        
        // Functions
        newList.orderLowerToHigher();
        
        // Helper
        newList.helperShow();
    }
}
