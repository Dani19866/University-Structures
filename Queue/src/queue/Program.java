/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Daniel
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> newQueue = new Queue();
        newQueue.enqueue(100);
        newQueue.enqueue(500);
        newQueue.enqueue(1000);
        newQueue.enqueue(3000);
        newQueue.enqueue(5000);
        
    }
}
