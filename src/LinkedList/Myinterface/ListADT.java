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
    /**
     * Created removeFirst method to remove the element from the first
     * of the linked list
     * has the element which has to be removed from the first.
     */

    void removeFirst();

    /**
     * Created removeLast method to remove the element from the first
     * of the linked list
     * has the element which has to be removed from the Last.
     *
     */
    void removeLast();

    /**
     * Created traverse method to traverse the linked list
     * And to find all the node of the linked list
     */

    void traverse();

    /**\
     *Created size method to return the size of the linked list
     * @return size
     */


    int size();

    /**
     * Created isEmpty method to check whether the linked list is empty or not
     * @return true or false
     */

    boolean isEmpty();



}
