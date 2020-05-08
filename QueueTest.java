/**
 * QueueTest.java
 * @author Simon Zhang
 * @author Daniil Durnev
 * CIS 22C, Lab 3
 */

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {

        System.out.println("***Testing queue empty constructor***");
        Queue<Integer> Q = new Queue<>();
        System.out.println("Queue is empty, should print nothing:" + Q);

        System.out.println("\n***Testing enqueue***");
        Q.enqueue(3);
        System.out.println("Should print 3: " + Q);
        Q.enqueue(2);
        Q.enqueue(1);
        System.out.println("Should print 3 2 1: " + Q);

        System.out.println("\n***Testing dequeue***");
        Q.dequeue();
        System.out.println("Should print 2 1: " + Q);
        Q.dequeue();
        System.out.println("Should print 1: " + Q);
        Q.dequeue();
        System.out.println("Should print an empty queue: " + Q);

        try {
          System.out.println("Queue is empty, trying to dequeue, should throw an exception");
          Q.dequeue();
        } catch (NoSuchElementException e) {
          System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\n\n***Testing getFront***");
        Q.enqueue(1);
        System.out.println("Should print 1: " + Q.getFront());
        Q.dequeue();
        Q.enqueue(2);
        System.out.println("Should print 2: " + Q.getFront());


        System.out.println("\n\n***Testing getLength***");
        System.out.println("Should print 1: " + Q.getLength());
        Q.dequeue();
        System.out.println("Should print 0: " + Q.getLength());;


        System.out.println("\n\n***Testing isEmpty***");
        System.out.println("Is queue empty? (true): " + Q.isEmpty());
        Q.enqueue(3);
        Q.enqueue(2);
        Q.enqueue(1);
        Q.enqueue(0);
        System.out.println("Is queue empty? (false): " + Q.isEmpty());


        System.out.println("\n\n***Testing copy constructor***");
        Queue<Integer> Q2 = new Queue<>(Q);
        System.out.println("Queue1: " + Q);
        System.out.println("Queue2: " + Q);


        System.out.println("\n\n***Testing equals***");
        System.out.println("Queue1 equals Queue2? (true): " + Q.equals(Q2));
        Q.dequeue();
        System.out.println("Dequeuing from Queue1, is it equal to Queue2? (false): " + Q.equals(Q2));

        System.out.println("\n\n***Testing isSorted***");
        Queue<Integer> queue = new Queue<>();
        for(int i = 10; i >= 0; i--) queue.enqueue(i);
        System.out.print("Queue1: " + queue);
        System.out.println("Is Queue1 sorted? (false): " + queue.isSorted());

        Queue<Integer> queue2 = new Queue<>();
        for(int i = 0; i <= 10; i++) queue2.enqueue(i);
        System.out.print("\nQueue2: " + queue2);
        System.out.println("Is Queue2 sorted? (true): " + queue2.isSorted());


        System.out.println("\n\n***Testing linearSearch***");
        System.out.print("Searching for 20, which is not in the queue: " + queue);
        System.out.println("Should print -1: " + queue.linearSearch(20));

        System.out.print("Searching for 7 in the queue: " + queue);
        System.out.println("Should print 4: " + queue.linearSearch(7));

        System.out.println("\n\n***Testing binarySearch***");
        System.out.print("Queue2: " + queue2);

        System.out.println("Searching for 5 in Queue2, its index should be 6: " + queue2.binarySearch(5));
        System.out.println("Searching for 11 in Queue2, its index should be -1: " + queue2.binarySearch(11));

        System.out.print("\nQueue: " + queue);
        try {
          System.out.println("Queue is not sorted, should throw an exception");
          System.out.println(queue.binarySearch(6));
        } catch (IllegalStateException e) {
          System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\n\n***Testing printReverse***");
        System.out.print("Queue1: " + queue);
        System.out.print("Queue1 in reverse: " );
        queue.printReverse();


        System.out.print("\nQueue2: " + queue2);
        System.out.print("Queue2 in reverse: " );
        queue2.printReverse();
    }
}
