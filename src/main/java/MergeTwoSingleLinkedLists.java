import structures.SingleLinkedList;
import structures.SingleLinkedList.SingleLinkedNode;

public class MergeTwoSingleLinkedLists {

    public static SingleLinkedList mergeAndSort(SingleLinkedNode nodeA, SingleLinkedNode nodeB) {
        SingleLinkedList merged = new SingleLinkedList();

        SingleLinkedNode cursorA = nodeA;
        SingleLinkedNode cursorB = nodeB;

        while (cursorA != null || cursorB != null) {
            if (cursorA != null && cursorB != null) {
                if (cursorA.item < cursorB.item) {
                    merged.pushBack(cursorA.item);
                    cursorA = cursorA.next;
                } else {
                    merged.pushBack(cursorB.item);
                    cursorB = cursorB.next;
                }
            } else if (cursorA != null) {
                merged.pushBack(cursorA.item);
                cursorA = cursorA.next;
            } else {
                merged.pushBack(cursorB.item);
                cursorB = cursorB.next;
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        SingleLinkedList list1 = new SingleLinkedList();
        list1.pushBack(2);
        list1.pushBack(5);
        list1.pushBack(9);
        list1.pushBack(17);
        list1.pushBack(28);

        SingleLinkedList list2 = new SingleLinkedList();
        for (int i = 1; i < 11; i++) {
            list2.pushBack(i);
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(mergeAndSort(list1.head, list2.head));
    }
}
