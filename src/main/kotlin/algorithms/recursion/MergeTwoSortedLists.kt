package algorithms.recursion

import algorithms.ListNode
import algorithms.recursion.MergeTwoSortedLists.mergeTwoLists

object MergeTwoSortedLists {

    /**
     * Time complexity: O(n+m)
     * Space complexity: O(n+m)
     * */
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? = when {
        l1 == null -> {
            l2
        }
        l2 == null -> {
            l1
        }
        l1.`val` < l2.`val` -> {
            l1.next = mergeTwoLists(l1.next, l2)
            l1
        }
        else -> {
            l2.next = mergeTwoLists(l1, l2.next)
            l2
        }
    }
}

fun main() {
//    val given1 = ListNode(`val` = 1, ListNode(`val` = 2, ListNode(`val` = 4)))
//    val given2 = ListNode(`val` = 1, ListNode(`val` = 3, ListNode(`val` = 4)))

    val given1 = null
    val given2 = ListNode(`val` = 1, null)

    val merged = mergeTwoLists(given1, given2)

    println(merged)
}
