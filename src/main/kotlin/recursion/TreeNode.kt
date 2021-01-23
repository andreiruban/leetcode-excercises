package recursion

import java.lang.StringBuilder

class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null) {

    // FIXME: fix wrong representation
    override fun toString(): String {
        val sb = StringBuilder("[$`val`")
        if (left != null) {
            printNode(sb, left)
        }

        if (right != null) {
            printNode(sb, right)
        }

        sb.append("]")

        return sb.toString()
    }

    private fun printNode(sb: StringBuilder, node: TreeNode?) {
        if (node != null) {
            sb.append(",").append(node.`val`)

            if (node.left != null) {
                printNode(sb, node.left)
            }


            if (node.right != null) {
                printNode(sb, node.right)
            }
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

    print(given.toString())
}