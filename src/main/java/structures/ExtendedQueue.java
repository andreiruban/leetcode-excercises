package structures;

import java.util.Stack;

public class ExtendedQueue {
    private final Stack<Integer> data;
    private final Stack<Integer> min;
    private final Stack<Integer> max;
    private int sum;

    public ExtendedQueue() {
        this.data = new Stack<>();
        this.min = new Stack<>();
        this.max = new Stack<>();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public Integer max() {
        return max.peek();
    }

    public Integer min() {
        return min.peek();
    }

    public Integer sum() {
        return sum;
    }

    public void push(Integer element) {
        data.add(element);

        if (min.isEmpty()) {
            min.push(element);
        } else {
            min.push(Math.min(element, min.peek()));
        }

        if (max.isEmpty()) {
            max.push(element);
        } else {
            max.push(Math.min(element, max.peek()));
        }

        sum += element;
    }

    public Integer pop() {
        int element = data.pop();
        sum -= element;
        max.pop();
        min.pop();

        return element;
    }

    public static void main(String[] args) {
        ExtendedQueue queue = new ExtendedQueue();

        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }

        System.out.println("Min: " + queue.min());
        System.out.println("Max: " + queue.max());
        System.out.println("Sum: " + queue.sum());

        System.out.println("Output: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(queue.pop());
        }
    }
}
