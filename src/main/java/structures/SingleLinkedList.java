package structures;

public class SingleLinkedList {
    void pushFront(int x) {
        head = new SingleLinkedNode(this.head, x);
    }

    void popFront() {
        SingleLinkedNode p = head;
        if (p != null) {
            head = p.next;
        }
    }

    void pushBack(int x) {
        SingleLinkedNode p = head, prev = null;
        while (p != null) {
            prev = p;
            p = p.next;
        }
        p = new SingleLinkedNode(null, x);
        if (prev != null)
            prev.next = p;
        else
            head = p;
    }

    void popBack() {
        SingleLinkedNode p = head, prev = null;
        while (p != null && p.next != null) {
            prev = p;
            p = p.next;
        }
        if (p != null) {
            if (prev != null)
                prev.next = null;
            else
                head = null;
        }
    }


    void pushAfter(int pos, int x) {
        int i = 0;
        SingleLinkedNode p = head;
        while (i < pos && p != null) {
            ++i;
            p = p.next;
        }
        if (i == pos && p != null) {
            p.next = new SingleLinkedNode(p.next, x);
        }
    }

    void popAfter(int pos) {
        int i = 0;
        SingleLinkedNode p = head;
        while (i < pos && p != null) {
            ++i;
            p = p.next;
        }
        if (i == pos && p != null && p.next != null) {
            p.next = p.next.next;
        }
    }

    SingleLinkedNode head = null;

    private class SingleLinkedNode {
        SingleLinkedNode(SingleLinkedNode next, int val) {
            this.next = next;
            this.item = val;
        }

        SingleLinkedNode next;
        int item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        SingleLinkedNode cursor = head;

        while (cursor != null) {
            sb.append(cursor.item);
            if (cursor.next != null) {
                sb.append(",");
            }
            cursor = cursor.next;
        }

        sb.append("]");
        return sb.toString();
    }
}
