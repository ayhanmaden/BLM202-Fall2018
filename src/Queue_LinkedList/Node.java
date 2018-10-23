package Queue_LinkedList;

/**
 * @file Node.java
 * @date Oct 23, 2018 , 5:13:17 PM
 * @author Muhammet Alkan
 */
public class Node<T> {
    T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }
}
