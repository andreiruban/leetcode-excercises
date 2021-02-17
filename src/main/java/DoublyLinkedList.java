import java.util.NoSuchElementException;

class DoublyLinkedList {
    private int size;

    private Node front;
    private Node back;

    public DoublyLinkedList() {
        size = 0;
    }

    class Node {

        public Node(Node prev, Integer value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        Integer value;
        Node prev;
        Node next;

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append("value: ").append(value);
            if (prev != null) {
                sb.append(",").append("prev: ").append(prev.value);
            }
            if (next != null) {
                sb.append(",").append("next: ").append(next.value);
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public int front() {
        if (front == null) throw new NoSuchElementException();

        return front.value;
    }

    public Integer back() {
        if (back == null) throw new NoSuchElementException();

        return back.value;
    }

    public int get(int index) {
        checkElementIndex(index);
        return node(index).value;
    }

    public void set(int index, int element) {
        checkElementIndex(index);
        Node x = node(index);
        x.value = element;
    }

    public void pushFront(int element) {
        linkFirst(element);
    }

    public void pushBack(int element) {
        linkLast(element);
    }

    public int popFront() {
        if (front == null) throw new NoSuchElementException();
        return unlinkFirst(front);
    }

    public int popBack() {
        if (back == null) throw new NoSuchElementException();
        return unlinkLast(back);
    }

    private Node node(int index) {
        Node x;
        if (index < (size >> 1)) {
            x = front;
            for (int i = 0; i < index; i++)
                x = x.next;
        } else {
            x = back;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
        }
        return x;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) throw new IndexOutOfBoundsException();
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private void linkFirst(int element) {
        Node f = front;
        Node newNode = new Node(null, element, f);
        front = newNode;
        if (f == null) {
            back = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }

    private void linkLast(int element) {
        Node b = back;
        Node newNode = new Node(b, element, null);
        back = newNode;
        if (b == null)
            front = newNode;
        else
            b.next = newNode;
        size++;
    }

    private int unlinkFirst(Node f) {
        int element = f.value;
        Node next = f.next;
        f.value = null;
        f.next = null;
        front = next;
        if (next == null)
            back = null;
        else
            next.prev = null;
        size--;
        return element;
    }

    private int unlinkLast(Node l) {
        int element = l.value;
        Node prev = l.prev;
        l.value = null;
        l.prev = null;
        back = prev;
        if (prev == null)
            front = null;
        else
            prev.next = null;
        size--;
        return element;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.pushBack(3);
        System.out.println("front: " + list.front());
        System.out.println("back: " + list.back());

        list.pushFront(9);
        System.out.println("front: " + list.front());
        System.out.println("back: " + list.back());

        list.pushBack(5);
        System.out.println("front: " + list.front());
        System.out.println("back: " + list.back());

        System.out.println("Element 2: " + list.get(2));

        list.set(0, 2);
        System.out.println("front: " + list.front());
        System.out.println("back: " + list.back());

        list.popFront();
        System.out.println("front: " + list.front());
        System.out.println("back: " + list.back());

        list.popBack();
        System.out.println("front: " + list.front());
        System.out.println("back: " + list.back());
    }
}
