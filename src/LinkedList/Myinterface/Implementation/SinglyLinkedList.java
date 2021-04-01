package LinkedList.Myinterface.Implementation;

import LinkedList.Myinterface.ListADT;

public class SinglyLinkedList<E> implements ListADT<E> {
    private SinglyLinkedListNode<E> head;
    private SinglyLinkedListNode<E> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }

    @Override
    public void addFirst(E element) {
        SinglyLinkedListNode<E> singlyLinkedListNode = new SinglyLinkedListNode<>(element);
        if (isEmpty()) {
            head = singlyLinkedListNode;
            tail = singlyLinkedListNode;
        } else {
            singlyLinkedListNode.setNext(head);
            head = singlyLinkedListNode;

        }
        size++;

    }

    @Override
    public void addLast(E element) {
        SinglyLinkedListNode<E> singlyLinkedListNode = new SinglyLinkedListNode<>(element);
        if (isEmpty()) {
            head = singlyLinkedListNode;
            tail = singlyLinkedListNode;
            size++;

        } else {
            tail.setNext(singlyLinkedListNode);
            tail = singlyLinkedListNode;

        }

    }

    @Override
    public void removeFirst() {
        SinglyLinkedListNode<E> deleted = null;
        if (!isEmpty()) {
            deleted = new SinglyLinkedListNode<>(head.getData());
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
        SinglyLinkedListNode<E> singlyLinkedListNodeToBeDeleted = null;
        if (!isEmpty()){
            singlyLinkedListNodeToBeDeleted = new SinglyLinkedListNode<>(tail.getData());
            // traversing the linked list to find the second last node
            SinglyLinkedListNode<E> temp = head;
            SinglyLinkedListNode<E> previous = null;
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
        SinglyLinkedListNode<E> temp = head;
        System.out.print("head -->");
        while (temp != null) {
            System.out.print(temp.getData() + "--> ");
            temp = temp.getNext();

        }
        System.out.print("null");

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

        return head == null;
    }
}