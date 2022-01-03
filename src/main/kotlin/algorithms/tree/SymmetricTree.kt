package algorithms.tree

import algorithms.TreeNode
import algorithms.printed

object SymmetricTree {
    fun isSymmetric(root: TreeNode?): Boolean = if(root == null) {
        true
    } else {
        isMirror(root.left, root.right)
    }

    fun isMirror(left: TreeNode?, right: TreeNode?): Boolean = if (left == null && right == null) {
        true
    } else if(left == null || right == null) {
        false
    } else (
        left.`val` == right.`val` &&
        isMirror(left.left, right.right) &&
        isMirror(left.right, right.left)
    )



    @JvmStatic
    fun main(args: Array<String>) {
        var given = TreeNode(
            4,
            left = TreeNode(
                2, left = TreeNode(1), right = TreeNode(3)
            ),
            right = TreeNode(7)
        )

        println(isSymmetric(given))

        given = TreeNode(
            4,
            left = TreeNode(
                2, left = TreeNode(1), right = TreeNode(3)
            ),
            right = TreeNode(
                2, left = TreeNode(1), right = TreeNode(3)
            )
        )

       println(isSymmetric(given))

        given = TreeNode(
            4,
            left = TreeNode(
                2, left = TreeNode(1), right = TreeNode(3)
            ),
            right = TreeNode(
                2, left = TreeNode(3), right = TreeNode(1)
            )
        )

        println(isSymmetric(given))
    }
}
