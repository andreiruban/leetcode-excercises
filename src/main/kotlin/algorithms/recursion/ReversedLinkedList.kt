package algorithms.recursion

import algorithms.recursion.ReversedLinkedList.reverseList

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

object ReversedLinkedList {

    fun reverseList(head: ListNode?): ListNode? {
        var backCursor = 0
        var current = head
        while (current?.next != null) {
            current = current.next
            backCursor++
        }

        reverseNodes(head, backCursor)
        return head
    }

    private fun reverseNodes(current: ListNode?, backCursor: Int) {
        if (backCursor > 0) {
            current?.let { currentNode ->
                val temp = currentNode.`val`
                var target = currentNode
                var subCursor = 0
                while (subCursor < backCursor) {
                    target = target.next!!
                    subCursor++
                }
                currentNode.`val` = target.`val`
                target.`val` = temp

                reverseNodes(currentNode.next, backCursor - 2)
            }
        }
    }
}

fun main() {
    val given = ListNode(1, ListNode(2, null))
//    val given = ListNode(1, ListNode(2, ListNode(3, null)))
    println(given)
    reverseList(given)
    println(given)
}
