package algorithms.recursion

class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

fun TreeNode.printed(): String {
    val sb = StringBuilder("[")

    sb.append(this.`val`)

    printNode(sb, this)
    sb.append("]")

    return sb.toString()
}

private fun printNode(sb: StringBuilder, node: TreeNode?) {
    node?.let { current ->

        val left = current.left
        val right = current.right

        left?.let { sb.append(",${it.`val`}") }
        right?.let { sb.append(",${it.`val`}") }

        left?.let { printNode(sb, it) }
        right?.let { printNode(sb, it) }
    }
}

fun main() {
    val given = TreeNode(
        4,
        left = TreeNode(
            2, left = TreeNode(1), right = TreeNode(3)
        ),
        right = TreeNode(7)
    )

    print(given.printed())
}
