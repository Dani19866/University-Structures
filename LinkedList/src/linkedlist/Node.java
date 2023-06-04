/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Daniel
 * @param <T>
 */
public class Node<T> {
    public T data;
    public Node<T> next;
    
    public Node(T datum){
        this.data = datum;
        this.next = null;
    }
}
