package LinkedList.Myinterface.Main;

import LinkedList.Myinterface.Implementation.SinglyLinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
        SinglyLinkedList<String> singlyLinkedList1 = new SinglyLinkedList<String>();
        singlyLinkedList.addFirst(10);
        singlyLinkedList.addFirst(20);
        singlyLinkedList.traverse();
        System.out.println();
        singlyLinkedList1.addFirst("Github");
        singlyLinkedList1.addFirst("Author");
        singlyLinkedList1.removeFirst();
        singlyLinkedList1.traverse();
    }
}