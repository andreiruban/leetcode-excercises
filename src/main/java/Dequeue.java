import java.util.LinkedList;

public class Dequeue<E> {

    private LinkedList<E> linkedList = new LinkedList<>();

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public void pushBack(E e) {
        linkedList.addLast(e);
    }

    public E popBack() {
        return linkedList.pollLast();
    }


    public void pushFront(E e) {
        linkedList.addFirst(e);
    }


    public E popFront() {
        return linkedList.pollFirst();
    }
}
