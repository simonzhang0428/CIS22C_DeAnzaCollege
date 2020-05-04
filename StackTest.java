/**
 * StackTest.java
 * @author Simon Zhang
 * @author Daniil Durnev
 * CIS 22C, Lab 3
 */

import java.util.NoSuchElementException;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        System.out.println("print nothing: " + S);

        try {
            S.pop();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        S.push(1);
        S.push(2);
        System.out.println("print 2 1: " + S);
        System.out.println("print 2: " + S.peek());

        Stack<Integer> S2 = new Stack<>(S);
        System.out.println("print 2 1: " + S2);
        System.out.println("equals (true): " + S.equals(S2));
        S2.pop();
        System.out.println("print 1: " + S2.peek());
        S2.pop();
        try {
            S2.peek();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("length (0): " + S2.getLength());
        System.out.println("empty (true): " + S2.isEmpty());
        System.out.println("equals (false): " + S.equals(S2));


        System.out.println("\n\n***Testing isSorted***");
        Stack<Integer> st1 = new Stack<>();
        for(int i = 0; i <= 10; i++) st1.push(i);
        System.out.println("Stack1: " + st1);
        System.out.println("Is Stack1 sorted? (false): " + st1.isSorted());

        Stack<Integer> st2 = new Stack<>();
        for(int i = 10; i >= 0; i--) st2.push(i);
        System.out.println("Stack2: " + st2);
        System.out.println("Is Stack2 sorted? (true): " + st2.isSorted());

        System.out.println("\n\n***Testing linearSearch***");
        System.out.println("Searching for 25, which is not present in stack: " + st2);
        System.out.println("Should print -1: " + st2.linearSearch(25));

        System.out.println("Searching for 5 in: " + st2);
        System.out.println("Should print 6: " + st2.linearSearch(5));
    }
}
