package algorithms.linked_list

import algorithms.ListNode

object DeleteNodeInLinkedList {
    fun deleteNode(node: ListNode?) {
        var nod = node
        nod!!.`val` = nod.next!!.`val`
        nod.next = nod.next!!.next
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val given = ListNode(`val` = 1, ListNode(`val` = 2, ListNode(`val` = 3)))
        deleteNode(given.next)

        println(given)

    }
}
