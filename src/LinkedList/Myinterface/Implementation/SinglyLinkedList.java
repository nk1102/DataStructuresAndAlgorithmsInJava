package LinkedList.Myinterface.Implementation;

import LinkedList.Myinterface.ListADT;

public class SinglyLinkedList<E> implements ListADT<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }
    @Override
    public void addFirst(E element) {

    }

    @Override
    public void addLast(E element) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void traverse() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}