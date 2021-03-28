package LinkedList.Myinterface;

/**
     * created an interface ListADT to  declare all the methods used fpr the implementation
     * singly linked list.
     */

    public interface ListADT<E> {
    /**
     * Created addFirst method in order to add the element
     * from the front of the linked list
     * has parameter which is to be added.
     */

    void addFirst(E element);

    /**
     * Created addLast method to add the element
     * from the last of the linked list
     * has the parameter which is to be added in the last
     */

    void addLast(E element);


}
