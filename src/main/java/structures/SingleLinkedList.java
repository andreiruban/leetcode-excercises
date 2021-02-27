package structures;

public class SingleLinkedList {
    public void pushFront(int x) {
        head = new SingleLinkedNode(this.head, x);
    }

    public void popFront() {
        SingleLinkedNode p = head;
        if (p != null) {
            head = p.next;
        }
    }

    public void pushBack(int x) {
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

    public void popBack() {
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


    public void pushAfter(int pos, int x) {
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

    public void popAfter(int pos) {
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

    public SingleLinkedNode head = null;

    public class SingleLinkedNode {
        SingleLinkedNode(SingleLinkedNode next, int val) {
            this.next = next;
            this.item = val;
        }

        public SingleLinkedNode next;
        public int item;

        @Override
        public String toString() {
            if(next == null) {
                return "[{ val=" + item + ", next=null]";
            } else {
                return "[{ val=" + item + ", next=" + next.item + "]";
            }
        }
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
