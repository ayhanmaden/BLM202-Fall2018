package Stack_LinkedList;

/**
 * @file Node.java
 * @date Oct 23, 2018 , 11:45:52 PM
 * @author Muhammet Alkan
 */
public class Node<T> {

    T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data + "";
    }

}
