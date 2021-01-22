package recursion.swap_pairs

import recursion.ListNode
import recursion.swap_pairs.SwapPairs.swapPairs

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

object SwapPairs {
    fun swapPairs(head: ListNode?): ListNode? {
        swapPair(head, head?.next)
        return head
    }

    private fun swapPair(left: ListNode?, right: ListNode?) {
        if (left != null && right != null) {
            val temp: Int = left.`val`
            left.`val` = right.`val`
            right.`val` = temp
        }

        if (right?.next != null && right.next?.next != null) {
            swapPair(right.next, right.next?.next)
        }
    }
}

fun main() {
    val given = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, null)))))
    println(given)
    swapPairs(given)
    println(given)
}
