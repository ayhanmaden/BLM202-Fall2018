package Queue_LinkedList;

/**
 * Queue using linked list
 * 
 * @file Queue.java
 * @date Oct 23, 2018 , 5:14:13 PM
 * @author Muhammet Alkan
 */
public class Queue<T> {

    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        front = null;
        rear = null;
    }

    void enqueue(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {   // addLast
            rear.nextNode = newNode;
            rear = newNode;
        }
    }

    T dequeue() {
        if (isEmpty()) {
            System.out.println("empty queue !");
            return null;
        } else {   // removeFirst
            T data = front.data;
            front = front.nextNode;

            if (isEmpty()) {
                rear = null;
            }

            return data;
        }
    }

    boolean isEmpty() {
        return (front == null);
    }

    int size() {
        Node<T> temp = front;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.nextNode;
        }

        return size;
    }

    void print() {
        Node<T> temp = front;

        while (temp != null) {
            System.out.print(temp.data + " -> ");

            temp = temp.nextNode;
        }

        System.out.println("null");
    }
}
