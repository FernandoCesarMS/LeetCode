package stack;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

https://leetcode.com/problems/min-stack/description/

*/

public class MinStack {

    private Node head;

    public MinStack() {
        this.head = null;
    }

    public void push(int val) {
        if (head == null) {
            this.head = new Node(val, null, val);
        } else {
            this.head = new Node(val, this.head, Math.min(val, this.head.minimumValue));
        }
    }

    public void pop() {
        if (this.head != null) {
            if (this.head.next == null) {
                this.head = null;
            } else {
                this.head = this.head.next;
            }
        }
    }

    public int top() {
        return this.head.val;
    }

    public int getMin() {
        return this.head.minimumValue;
    }

    private static class Node {
        int val;
        Node next;
        int minimumValue;

        private Node(int val, Node next, int minimumValue) {
            this.val = val;
            this.next = next;
            this.minimumValue = minimumValue;
        }
    }
}