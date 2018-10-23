package Queue_Array;

/**
 * @file Test.java
 * @date Oct 23, 2018 , 5:59:33 PM
 * @author Muhammet Alkan
 */
public class Test {

    public static void main(String[] args) {
        // max capacity
        Queue<String> kuyruk = new Queue<>(10);

        kuyruk.enqueue("to");
        kuyruk.enqueue("be");
        kuyruk.enqueue("or");
        kuyruk.enqueue("not");
        kuyruk.enqueue("to");
        kuyruk.enqueue("be");

        kuyruk.print();
        System.out.println("size : " + kuyruk.size());

        kuyruk.dequeue();
        kuyruk.dequeue();

        kuyruk.print();
        System.out.println("size : " + kuyruk.size());

    }
}
