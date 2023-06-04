/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Daniel
 * @param <T>
 */
public class Queue<T> {

    // -----------------------
    // |6| |5| |4| |3| |2| |1|
    // -----------------------
    // Definición: El primero en agregarse va a ser el primero el eliminarse
    public Node<T> first;
    public Node<T> last;
    public int size;

    // <editor-fold desc="Constructor">
    /**
     * Constructor of class Create a Queue in empty Uses the functions to
     * add/remove elements
     */
    public Queue() {
        first = last = null;
    }
    // </editor-fold>

    // <editor-fold desc="Add/Remove">
    public void enqueue(T datum) {
        Node newNode = new Node(datum);
        if (size == 0) {
            first = last = newNode;
        } else {
            // El siguiente de |2| es el nuevo nodo (|3|). El último de la cola (last) es el nuevo nodo (|3|)
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (size != 0) {
            T data;
            // -------------------
            data = first.data;
            first = first.next;
            if (first == null) {
                last = null;
            }
            // -------------------
            size--;
            return data;
        } else {
            return null;
        }
    }
    // </editor-fold>

    // <editor-fold desc="Basic function">
    public T top() {
        return first.data;
    }

    public int getSize() {
        return size;
    }
    // </editor-fold>

    // <editor-fold desc="Static functions">
    public void flip() {
        if (size > 1){
            T datum = this.dequeue();
            flip();
            this.enqueue(datum);
        }
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            T datum = this.dequeue();
            System.out.println(datum);
            this.enqueue(datum);
        }
    }
    // </editor-fold>
}
