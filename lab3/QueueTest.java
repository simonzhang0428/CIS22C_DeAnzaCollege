/**
 * QueueTest.java
 * @author Simon Zhang
 * @author Daniil Durnev
 * CIS 22C, Lab 3
 */

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> Q = new Queue<>();
        System.out.println("Should print nothing:" + Q);
        try{
            Q.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        Q.enqueue(3);
        System.out.println("Should print 3: " + Q);
        Q.enqueue(2);
        Q.enqueue(1);
        System.out.println("Should print 3 2 1: " + Q);
        Q.dequeue();
        System.out.println("Should print 2 1: " + Q);

        Queue<Integer> Q2 = new Queue<>(Q);
        System.out.println("Should print 2 1: " + Q2);
        System.out.println("Should print true: " + Q.equals(Q2));
        System.out.println("Size (2): " + Q2.getLength());
        System.out.println("Empty (false): " + Q2.isEmpty());
        System.out.println("Should print 2: " + Q2.getFront());
        Q2.dequeue();
        Q2.dequeue();
        try {
            Q2.getFront();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Equal (false): " + Q.equals(Q2));
    }
}