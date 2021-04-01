package LinkedList.Myinterface.Implementation;

public class SinglyLinkedListNode<E>{
    /**
     * Created private field data of generic type E
     */
    private E data;
    /**
     * Created private field  next of SinglyLinkedListNode<E> type
     */
    private SinglyLinkedListNode<E> next;

    /**
     * Created default constructor of the class
     */

    public SinglyLinkedListNode(E data) {
        this.data = data;
        next = null;
    }

    /**
     * Getter and setter methods
     * for data
     */

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    /**
     * getter and setter methods
     * for next field
     * @return
     */

    public SinglyLinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListNode<E> next) {
        this.next = next;
    }
}