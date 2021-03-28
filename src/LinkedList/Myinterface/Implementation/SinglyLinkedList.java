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
        Node<E> node = new Node<>(element);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;

        }
        size++;

    }

    @Override
    public void addLast(E element) {
        Node<E> node = new Node<>(element);
        if (isEmpty()) {
            head = node;
            tail = node;
            size++;

        } else {
            tail.setNext(node);
            tail = node;

        }

    }

    @Override
    public void removeFirst() {
        Node<E> deleted = null;
        if (!isEmpty()) {
            deleted = new Node<>(head.getData());
            if (size == 1) { // special case if linked list has only one node
                head = null;
                tail = null;
            } else {
                head = head.getNext();

            }
            size--;

        }


    }

    @Override
    public void removeLast() {
        Node<E> nodeToBeDeleted = null;
        if (!isEmpty()){
            nodeToBeDeleted = new Node<>(tail.getData());
            // traversing the linked list to find the second last node
            Node<E> temp = head;
            Node<E> previous = null;
            while (temp.getNext() != null){
                previous =temp;
                temp=temp.getNext();

            }
            if (previous == null){
                // it means linked list has only one node
                head = null;
                tail = null;
            }
            else{
                previous.setNext(null);
                tail = previous;

            }
            size--;


        }

    }

    @Override
    public void traverse() {
        Node<E> temp = head;
        System.out.print("head -->");
        while (temp != null) {
            System.out.println(temp.getData() + "--> ");
            temp = temp.getNext();

        }
        System.out.println("null");

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