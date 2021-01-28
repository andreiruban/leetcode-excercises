package algorithms.recursion

import algorithms.TreeNode
import algorithms.recursion.BinaryTreeDepth.recursion
import kotlin.math.max

object BinaryTreeDepth {

    /**
     * Time: O(N)
     * Space: O(N) unbalanced tree, O(log(N)) - balanced tree
     * */
    fun recursion(root: TreeNode?): Int =
        when (root) {
            null -> {
                0
            }
            else -> {
                val leftHeight = recursion(root.left)
                val rightHeight = recursion(root.right)
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

    val depth = recursion(given)
    println(depth)
}
