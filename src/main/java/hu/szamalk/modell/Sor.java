package hu.szamalk.modell;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Sor {

    private Queue<Integer> queue;
    private Stack<Integer> stack;
    private int k;

    public Sor(int size) {
        queue = new LinkedList<>();
        stack = new Stack<>();
        k = size;
    }

    public void enqueue(int item) {
        queue.add(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A sor üres.");
        }
        return queue.poll();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("A sor üres.");
        }
        return queue.peek();
    }

    public void reverseFirstK(int k) {
        if (k > size() || k <= 0) {
            throw new IllegalArgumentException("Érvénytelen k érték.");
        }

        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.poll());
        }
    }

    public void printQueue() {
        for (Integer item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

}