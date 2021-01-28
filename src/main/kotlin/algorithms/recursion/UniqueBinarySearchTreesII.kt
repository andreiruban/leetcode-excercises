package algorithms.recursion

import algorithms.recursion.UniqueBinarySearchTreesII.generateTrees
import java.util.LinkedList

object UniqueBinarySearchTreesII {

    fun generateTrees(n: Int): List<TreeNode?> {
        if (n == 0) {
            return LinkedList<TreeNode?>()
        }

        return generateTrees(1, n)
    }

    fun generateTrees(start: Int, end: Int): List<TreeNode?> {
        val allTrees = LinkedList<TreeNode?>()
        if (start > end) {
            allTrees.add(null)
            return allTrees
        }

        (start until end + 1).forEach { i ->
            val leftTrees = generateTrees(start, i - 1)
            val rightTrees = generateTrees(i + 1, end)

            for (l in leftTrees) {
                for (r in rightTrees) {
                    val currentNode = TreeNode(i)
                    currentNode.left = l
                    currentNode.right = r
                    allTrees.add(currentNode)
                }
            }
        }

        return allTrees
    }
}

fun main() {
    println(generateTrees(10).map { it?.printed() })
}
