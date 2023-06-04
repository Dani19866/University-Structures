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
public class LinkedList<T> {

    public Node<T> pFirst;
    public Node<T> pLast;
    public int size;

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public LinkedList() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Additives">
    public void addLast(T datum) {
        Node<T> newNode = new Node(datum);

        if (size == 0) {
            pFirst = pLast = newNode;
        } else {
            pLast.next = newNode;
            pLast = newNode;
        }

        size++;
    }

    public void addFirst(T datum) {
        Node<T> newNode = new Node(datum);

        if (size == 0) {
            pFirst = pLast = newNode;
        } else {
            newNode.next = pFirst;
            pFirst = newNode;
        }

        size++;
    }

    public void add(T datum, int position) {
        if (position < 0 || position > (size - 1)) {
            throw new IndexOutOfBoundsException("Error in position... VALUE: " + position + ". SIZE: " + size);
        } else if (size == 0 || position == 0) {
            this.addFirst(datum);
        } else if (position == size - 1) {
            this.addLast(datum);
        } else {
            Node<T> newNode = new Node(datum);
            Node<T> aux = pFirst;

            for (int i = 0; i < position; i++) {
                aux = aux.next;
            }

            newNode.next = aux.next;
            aux.next = newNode;
            size++;
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Removers">
    public void deleteLast() {
        if (size != 0) {
            LinkedList newList = new LinkedList();
            Node aux = pFirst;

            for (int i = 0; i < size - 1; i++) {
                newList.addLast(aux.data);
                aux = aux.next;
            }

            pFirst = newList.pFirst;
            pLast = newList.pLast;
            size = newList.size;
        }
    }

    public void deleteFirst() {
        if (size != 0) {
            pFirst = pFirst.next;
            size--;
        }
    }

    public void delete(int position) {
        if (position < 0 || position > (size - 1)) {
            throw new IndexOutOfBoundsException("Error in position... VALUE: " + position + ". SIZE: " + size);
        } else if (size == 0 || position == 0) {
            this.deleteFirst();
        } else if (position == size - 1) {
            this.deleteLast();
        } else {
            Node aux = pFirst;

            for (int i = 0; i < position - 1; i++) {
                aux = aux.next;
            }

            aux.next = aux.next.next;
            size--;
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public T get(int position) {
        if (position < 0 || position > (size - 1)) {
            throw new IndexOutOfBoundsException("Error in position... VALUE: " + position + ". SIZE: " + size);
        } else {
            Node aux = pFirst;
            for (int i = 0; i < position; i++) {
                aux = aux.next;
            }

            return pFirst.data;
        }
    }

    public void orderLowerToHigher() {
        if (size != 0 || size != 1) {
            Object type = this.pFirst.data.getClass();

            // String
            if (type == String.class) {
                System.out.println("[!] WARNING: String no is supported!");
                return;
            }

            // Integer
            if (type == Integer.class) {
                Node aux = pFirst;

                for (int i = 0; i < this.size; i++) {
                    Node<T> current = aux;

                    while (current.next != null) {
                        int x = (int) current.data;
                        T xTemp = current.data;
                        int y = (int) current.next.data;
                        T yTemp = current.next.data;

                        if (x > y) {
                            current.next.data = xTemp;
                            current.data = yTemp;
                        }

                        current = current.next;
                    }
                }
                return;
            }

            // Double
            if (type == Double.class) {
                Node aux = pFirst;

                for (int i = 0; i < this.size; i++) {
                    Node<T> current = aux;

                    while (current.next != null) {
                        double x = (double) current.data;
                        T xTemp = current.data;
                        double y = (double) current.next.data;
                        T yTemp = current.next.data;

                        if (x > y) {
                            current.next.data = xTemp;
                            current.data = yTemp;
                        }

                        current = current.next;
                    }
                }
            }
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Helpers">
    public void helperShow() {
        Node<T> aux = pFirst;

        while (aux != null) {
            System.out.println(aux.data);
            aux = aux.next;
        }
    }
    //</editor-fold>
}
