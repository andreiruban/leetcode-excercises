package recursion.swap_pairs

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
        var current = head

        while (current?.next != null) {
            swapPair(current, current.next)
            current = current.next?.next
        }

        return head
    }

    private fun swapPair(left: ListNode?, right: ListNode?) {
        val temp: Int? = left?.`val`
        right?.let {
            left?.`val` = it.`val`
        }
        right?.let {
            it.`val` = temp ?: 0
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
