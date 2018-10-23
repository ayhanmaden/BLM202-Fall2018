package Queue_Array;

/**
 * Queue using array
 * 
 * @file Queue.java
 * @date Oct 23, 2018 , 5:42:32 PM
 * @author Muhammet Alkan
 */
public class Queue<T> {

    private int front, rear;
    private T dataArray[];
    private int size;

    public Queue(int capacity) {
        front = 0;
        rear = 0;
        dataArray = (T[]) new Object[capacity];
    }

    void enqueue(T data) {
        if (isFull()) {
            System.out.println("queue is full !");
        } else {
            dataArray[rear] = data;
            rear++;

            if (rear % dataArray.length == 0) {
                rear = 0;
            }

            size++;
        }
    }

    T dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty !");
            return null;
        } else {
            front++;

            if (front % dataArray.length == 0) {
                front = 0;
            }

            size--;
            return dataArray[front - 1];
        }
    }

    void print() {
        int index = front;

        for (int i = 0; i < size(); i++) {
            System.out.print(dataArray[index++] + " -> ");

            if (index % dataArray.length == 0) {
                index = 0;
            }
        }
    }

    boolean isFull() {
        return (size() == dataArray.length);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    int size() {
        return size;
    }

}
