package algorithms.recursion

import algorithms.recursion.BinaryTreeDepth.maxDepth
import kotlin.math.max

object BinaryTreeDepth {

    fun maxDepth(root: TreeNode?): Int =
        when (root) {
            null -> {
                0
            }
            else -> {
                val leftHeight = maxDepth(root.left)
                val rightHeight = maxDepth(root.right)
                max(leftHeight, rightHeight) + 1
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

    val depth = maxDepth(given)
    println(depth)
}
