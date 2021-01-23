package recursion

class ListNode(var `val`: Int, var next: ListNode? = null) {

    override fun toString(): String {
        val printed = "$`val`"
        val cursorNode = next
        return printed + printNode(cursorNode)
    }

    private fun printNode(cursorNode: ListNode?): String = when {
        cursorNode != null -> {
            val result = "->${cursorNode.`val`}"
            result + printNode(cursorNode.next)
        }
        else -> {
            "->null"
        }
    }
}

fun main() {
    val given = ListNode(`val` = 1, ListNode(`val` = 2, ListNode(`val` = 3)))
    println(given)
}
