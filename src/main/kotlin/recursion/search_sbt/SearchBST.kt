package recursion.search_sbt

import recursion.TreeNode


/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

object SearchBST {

    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? = when {
        root == null || root.`val` == `val` -> root
        else -> when {
            `val` < root.`val` -> {
                searchBST(root.left, `val`)
            }
            else -> {
                searchBST(root.right, `val`)
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

//    print(given.printed())
    val node = SearchBST.searchBST(given, 2)
    print("[${node?.`val`},${node?.left?.`val`},${node?.right?.`val`}]")
}
