import java.util.Stack;

// implementation is not synchronized
public class QueueOfTwoStacks<E> {

    private Stack<E> in = new Stack<>();
    private Stack<E> out = new Stack<>();

    // O(1)
    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }

    // O(1)
    public void push(E element) {
        in.push(element);
    }

    // best: O(1), worst O(chunk) -> amortized O(1)
    public E pop() {
        if (out.isEmpty() && !in.isEmpty()) { // O(chunk) ~ O(n)
            int chunk = in.size(); // O(1)
            for (int i = 0; i < chunk; i++) { // O(chunk) ~ O(n)
                E el = in.pop(); // O(1)
                out.push(el); // O(1)
            }
        }

        return out.pop(); // O(1)
    }

    public static void main(String[] args) {
        QueueOfTwoStacks queue = new QueueOfTwoStacks();

        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }

        System.out.println("Output: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(queue.pop());
        }
    }
}
