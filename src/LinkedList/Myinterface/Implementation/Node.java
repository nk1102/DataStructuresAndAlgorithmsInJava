package LinkedList.Myinterface.Implementation;

public class Node<E>{
    /**
     * Created private field data of generic type E
     */
    private E data;
    /**
     * Created private field  next of Node<E> type
     */
    private Node<E> next;

    /**
     * Created default constructor of the class
     */

    public Node(E data) {
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

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}