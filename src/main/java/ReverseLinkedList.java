import structures.SingleLinkedList;

public class ReverseLinkedList {

    public static void reverse(SingleLinkedList list) {
        SingleLinkedList.SingleLinkedNode prev = null;
        SingleLinkedList.SingleLinkedNode current = list.head;
        SingleLinkedList.SingleLinkedNode next = list.head.next;

        while (next != null) {
            current.next = prev;
            prev = current;
            current = next;
            next = current.next;
        }

        current.next = prev;
        list.head = current;
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        System.out.println(list);

        reverse(list);

        System.out.println(list);
    }
}
