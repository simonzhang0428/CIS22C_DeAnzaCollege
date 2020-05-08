/**
 * StackTest.java
 * @author Simon Zhang
 * @author Daniil Durnev
 * CIS 22C, Lab 3
 */

import java.util.NoSuchElementException;

public class StackTest {
    public static void main(String[] args) {

        System.out.println("***Testing empty Stack Constructor***");
        Stack<Integer> S = new Stack<>();
        System.out.println("top is null, should print an empty stack using toString" + S);

        System.out.println("\n\n***Testing push***");
        S.push(1);
        System.out.println("Should print 1: " + S);
        S.push(2);
        System.out.println("Should print 2 1: " + S);


        System.out.println("\n\n***Testing pop***");
        S.pop();
        System.out.println("Should print 1: " + S);
        S.pop();
        System.out.println("Should print empty stack: " + S);
        try {
          System.out.println("Stack is empty, testing stack.pop() exception handling");
          S.pop();
        } catch (NoSuchElementException e) {
          System.out.println("Exception caught: " + e.getMessage());
        }


        System.out.println("\n\n***Testing peek***");
        try {
          System.out.println("Stack is empty, testing stack.peek() exception handling");
          System.out.println(S.peek());
        } catch (NoSuchElementException e) {
          System.out.println("Exception caught: " + e.getMessage());
        }
        S.push(1);
        System.out.println("Should print 1: " + S.peek());


        System.out.println("\n\n***Testing getLength***");
        System.out.println("Should print 1: " + S.getLength());
        S.pop();
        System.out.println("Should print 0: " + S.getLength());

        System.out.println("\n\n***Testing isEmpty***");
        System.out.println("Is stack empty? (true): " + S.isEmpty());
        S.push(1);
        System.out.println("Is stack empty? (false): " + S.isEmpty());
        S.push(2);
        S.push(3);
        S.push(4);


        System.out.println("\n\n***Testing copy constructor***");
        Stack<Integer> S2 = new Stack<>(S);
        System.out.println("Stack1: " + S);
        System.out.println("Stack2: " + S2);

        System.out.println("\n\n***Testing equals***");
        System.out.print("Stack1: " + S);
        System.out.print("Stack2: " + S2);
        System.out.println("Is stack1 equals stack2? (true): " + S.equals(S2));
        System.out.println("Pushing an integer 4 to S2");
        S2.push(4);
        System.out.print("Stack1: " + S);
        System.out.print("Stack2: " + S2);
        System.out.println("Is stack1 equals stack2? (false): " + S.equals(S2));


        System.out.println("\n\n***Testing isSorted***");
        Stack<Integer> st1 = new Stack<>();
        for(int i = 0; i <= 10; i++) st1.push(i);
        System.out.print("Stack1: " + st1);
        System.out.println("Is Stack1 sorted? (false): " + st1.isSorted());

        Stack<Integer> st2 = new Stack<>();
        for(int i = 10; i >= 0; i--) st2.push(i);
        System.out.print("\nStack2: " + st2);
        System.out.println("Is Stack2 sorted? (true): " + st2.isSorted());

        System.out.println("\n\n***Testing linearSearch***");
        System.out.print("Searching for 25, which is not present in stack: " + st2);
        System.out.println("Should print -1: " + st2.linearSearch(25));

        System.out.print("\nSearching for 5 in: " + st2);
        System.out.println("Should print 6: " + st2.linearSearch(5));


        System.out.println("\n\n***Testing binarySearch***");
        System.out.print("Stack2: " + st2);

        System.out.println("Searching for 7 in Stack2, its index is 8: " + st2.binarySearch(7));
        System.out.println("Searching for 12 in Stack2, its index is -1: " + st2.binarySearch(12));

        System.out.print("\nStack1: " + st1);
        System.out.println("Is Stack1 sorted? (false): " + st1.isSorted());
        try {
          System.out.println("Searching for 3 in Stack1, should throw an exception");
          System.out.println(st1.binarySearch(3));
        } catch (IllegalStateException e) {
          System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\n\n***Testing printReverse***");
        System.out.print("Stack1: " + st1);
        System.out.print("Stack1 in reverse: ");
        st1.printReverse();

        System.out.print("\nStack2: " + st2);
        System.out.print("Stack2 in reverse: ");
        st2.printReverse();
    }
}
