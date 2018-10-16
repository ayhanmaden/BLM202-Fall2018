package Stack;

/**
 * Stack using array
 *
 * @file Stack.java
 * @date Oct 16, 2018 , 5:17:43 PM
 * @author Muhammet Alkan
 */
public class Stack<T> {

    private int top;
    private T dataArray[];

    public Stack(int capacity) {
        top = -1;
        dataArray = (T[]) new Object[capacity];
    }

    void push(T data) {
        if (isFull()) {
            System.out.println("full !");
        } else {
            dataArray[++top] = data;
        }
    }

    T pop() {
        if (isEmpty()) {
            System.out.println("empty !");
            return null;
        } else {
            return dataArray[top--];
        }
    }

    boolean isFull() {
        return (top + 1 == dataArray.length);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    int size() {
        return top + 1;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("stack is empty !");
        } else {
            System.out.println("Stack elements are:");
            for (int i = 0; i <= top; i++) {
                System.out.println(dataArray[i]);
            }
        }
    }

    String getText() {
        String text = "";

        if (!isEmpty()) {
            for (int i = 0; i < size(); i++) {
                text += dataArray[i];
            }
        }

        return text;
    }
}
