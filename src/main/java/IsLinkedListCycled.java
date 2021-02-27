import structures.SingleLinkedList;
import structures.SingleLinkedList.SingleLinkedNode;

public class IsLinkedListCycled {

    public static boolean isListCycled(SingleLinkedNode head) {
        SingleLinkedNode fastPointer = head;
        SingleLinkedNode slowPointer = head;

        do {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(fastPointer == null) return false;
        }
        while (fastPointer != slowPointer);

        return true;
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);

        System.out.println(isListCycled(list.head));
    }
}
