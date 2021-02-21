package structures;

import java.util.Stack;

public class ExtendedQueue {
    private final Stack<Integer> in = new Stack<>();
    private final Stack<Integer> out = new Stack<>();

    private int max;
    private int min;
    private int sum;

    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }

    public Integer max() {
        return max;
    }

    public Integer min() {
        return min;
    }

    public Integer sum() {
        return sum;
    }

    public void push(Integer element) {
        if (element > max) max = element;
        if (element < min) min = element;
        sum += element;

        in.push(element);
    }

    public Integer pop() {
        if (out.isEmpty() && !in.isEmpty()) {
            while (!in.isEmpty()) {
                Integer el = in.pop();
                out.push(el);
            }
        }

        Integer poped = out.pop();
        sum -= poped;

        if (!out.isEmpty()) {
            max = out.stream().max(Integer::compare).get();
            min = out.stream().min(Integer::compare).get();
        }
        return poped;
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
