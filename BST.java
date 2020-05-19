/**
 * BST.java
 * @author Simon Zhang
 * @author
 * CIS 22C Lab 4
 */

import java.util.NoSuchElementException;

public class BST<T extends Comparable<T>> {
    private class Node {
        private T data;
        private Node left;
        private Node right;

        public Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node root;

    /***CONSTRUCTORS***/

    /**
     * Default constructor for BST
     * sets root to null
     */
    public BST() {

    }

    /**
     * Copy constructor for BST
     * @param bst the BST to make
     * a copy of
     */
    public BST(BST<T> bst) {

    }

    /**
     * Helper method for copy constructor
     * @param node the node containing
     * data to copy
     */
    private void copyHelper(Node node) {

    }

    /***ACCESSORS***/

    /**
     * Returns the data stored in the root
     * @precondition !isEmpty()
     * @return the data stored in the root
     * @throws NoSuchElementException when
     * preconditon is violated
     */
    public T getRoot() throws NoSuchElementException{
        return null;
    }

    /**
     * Determines whether the tree is empty
     * @return whether the tree is empty
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Returns the current size of the
     * tree (number of nodes)
     * @return the size of the tree
     */
    public int getSize() {
        return -1;
    }

    /**
     * Helper method for the getSize method
     * @param node the current node to count
     * @return the size of the tree
     */
    private int getSize(Node node) {
        return -1;
    }

    /**
     * Returns the height of tree by
     * counting edges.
     * @return the height of the tree
     */
    public int getHeight() {
        return Integer.MIN_VALUE; //remove this. just a default value
    }

    /**
     * Helper method for getHeight method
     * @param node the current
     * node whose height to count
     * @return the height of the tree
     */
    private int getHeight(Node node) {
        return Integer.MIN_VALUE; //remove this. just a default value
    }

    /**
     * Returns the smallest value in the tree
     * @precondition !isEmpty()
     * @return the smallest value in the tree
     * @throws NoSuchElementException when the
     * precondition is violated
     */
    public T findMin() throws NoSuchElementException{
        return null;
    }

    /**
     * Helper method to findMin method
     * @param node the current node to check
     * if it is the smallest
     * @return the smallest value in the tree
     */
    private T findMin(Node node) {
        return null;
    }

    /**
     * Returns the largest value in the tree
     * @precondition !isEmpty()
     * @return the largest value in the tree
     * @throws NoSuchElementException when the
     * precondition is violated
     */
    public T findMax() throws NoSuchElementException{
        return null;
    }

    /**
     * Helper method to findMax method
     * @param node the current node to check
     * if it is the largest
     * @return the largest value in the tree
     */
    private T findMax(Node node) {
        return null;
    }

    /**
     * Searches for a specified value
     * in the tree
     * @param data the value to search for
     * @return whether the value is stored
     * in the tree
     */
    public boolean search(T data) {
        return false;
    }

    /**
     * Helper method for the search method
     * @param data the data to search for
     * @param node the current node to check
     * @return whether the data is stored
     * in the tree
     */
    private boolean search(T data, Node node) {
        return false;
    }


    /**
     * Determines whether two trees store
     * identical data in the same structural
     * position in the tree
     * @param o another Object
     * @return whether the two trees are equal
     */
    @Override public boolean equals(Object o) {
        return false;
    }

    /**
     * Helper method for the equals method
     * @param node1 the node of the first bst
     * @param node2 the node of the second bst
     * @return whether the two trees contain
     * identical data stored in the same structural
     * position inside the trees
     */
    private boolean equals(Node node1, Node node2) {
        return false;
    }

    /***MUTATORS***/

    /**
     * Inserts a new node in the tree
     * @param data the data to insert
     */
    public void insert(T data) {

    }

    /**
     * Helper method to insert
     * Inserts a new value in the tree
     * @param data the data to insert
     * @param node the current node in the
     * search for the correct location
     * in which to insert
     */
    private void insert(T data, Node node) {

    }

    /**
     * Removes a value from the BST
     * @param data the value to remove
     * @precondition !isEmpty()
     * @precondition the data is located in the tree
     * @throws NoSuchElementException when the
     * precondition is violated
     */
    public void remove(T data) throws NoSuchElementException{

    }

    /**
     * Helper method to the remove method
     * @param data the data to remove
     * @param node the current node
     * @return an updated reference variable
     */
    private Node remove(T data, Node node) {
        return null;
    }


    /***ADDITIONAL OPERATIONS***/

    /**
     * Prints the data in pre order
     * to the console
     */
    public void preOrderPrint() {
        System.out.println();
    }

    /**
     * Helper method to preOrderPrint method
     * Prints the data in pre order
     * to the console
     */
    private void preOrderPrint(Node node) {

    }

    /**
     * Prints the data in sorted order
     * to the console
     */
    public void inOrderPrint() {
        System.out.println();
    }

    /**
     * Helper method to inOrderPrint method
     * Prints the data in sorted order
     * to the console
     */
    private void inOrderPrint(Node node) {

    }

    /**
     * Prints the data in post order
     * to the console
     */
    public void postOrderPrint() {
        System.out.println();
    }

    /**
     * Helper method to postOrderPrint method
     * Prints the data in post order
     * to the console
     */
    private void postOrderPrint(Node node) {

    }
}
