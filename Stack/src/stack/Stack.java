/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Daniel
 * @param <T>
 */
public class Stack<T> {

    // || 5 ||
    // || 4 ||
    // || 3 ||
    // || 2 ||
    // || 1 ||
    // ||___||
    // Definición: El último en entrar, es el primero en salir
    private Node<T> chain;
    private int size;

    // <editor-fold desc="Constructor">
    public Stack() {
        chain = null;
        size = 0;
    }
    // </editor-fold>

    // <editor-fold desc="Add/Remove">
    public void push(T datum) {
        Node newNode = new Node(datum);

        if (size == 0) {
            chain = newNode;
        } else {
            newNode.next = chain;
            chain = newNode;
        }

        size++;
    }

    public T pop() {
        if (size != 0) {
            T value = chain.data;
            chain = chain.next;
            size--;
            return value;
        } else {
            return null;
        }
    }
    // </editor-fold>

    // <editor-fold desc="Basic functions">
    public T peek() {
        return chain.data;
    }

    public int getSize() {
        return size;
    }
    // </editor-fold>

    // <editor-fold desc="Intermediate functions">
    public void show() {
        if (chain != null && size > 0){
            T data = this.pop();
            System.out.println(data);
            show();
            this.push(data);
        }
    }
    // </editor-fold>
}
