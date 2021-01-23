package recursion

class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

fun TreeNode.printed(): String {
    val sb = StringBuilder("[")

    sb.append(this.`val`)

    printNode(sb, this)
    sb.append("]")

    return sb.toString()
}

private fun printNode(sb: StringBuilder, node: TreeNode?) {
    if (node != null) {
        val left = node.left
        val right = node.right

        if (left != null) {
            sb.append(",${left.`val`}")
        }

        if (right != null) {
            sb.append(",${right.`val`}")
        }

        if (left != null) {
            printNode(sb, left)
        }

        if (right != null) {
            printNode(sb, right)
        }
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