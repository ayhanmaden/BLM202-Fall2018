package LinkedList;

/**
 * @file LinkedList.java
 * @date Oct 9, 2018 , 5:18:37 PM
 * @author Muhammet Alkan
 */
public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    void addFirst(T newData) {
        addFirst(new Node<T>(newData));
    }

    void addFirst(Node<T> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    void addLast(T newData) {
        addLast(new Node<T>(newData));
    }

    void addLast(Node<T> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;

            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }

            temp.nextNode = newNode;
        }
    }

    void insertAfter(T afterData, T newData) {
        Node<T> temp = head;

        while (temp != null && !temp.data.equals(afterData)) {
            temp = temp.nextNode;
        }

        if (temp != null) {
            Node<T> newNode = new Node<>(newData);
            newNode.nextNode = temp.nextNode;
            temp.nextNode = newNode;
        }
    }

    void print() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");

            temp = temp.nextNode;
        }

        System.out.println("null");
    }

    boolean isEmpty() {
        return (head == null);
    }

    int size() {
        Node<T> temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.nextNode;
        }

        return size;
    }

    T maxGeneric() {

        if (head != null) {
            T max = head.data;
            Node<T> temp = head.nextNode;

            while (temp != null) {
                if (max.hashCode() < temp.data.hashCode()) {
                    max = temp.data;
                }
                temp = temp.nextNode;
            }
            return max;
        }

        return null;
    }

    Integer max() {

        if (head != null) {
            int max = (Integer) head.data;
            Node<T> temp = head.nextNode;

            while (temp != null) {
                if (max < (Integer) (temp.data)) {
                    max = (Integer) (temp.data);
                }
                temp = temp.nextNode;
            }
            return max;
        }

        return null;
    }
}
