package algorithms.math_deduction

import algorithms.math_deduction.UniqueBinarySearchTrees.numTrees

object UniqueBinarySearchTrees {
    fun numTrees(n: Int): Int {
        var c: Long = 1
        (0 until n).forEach { i ->
            c = c * 2 * (2 * i + 1) / (i + 2)
        }
        return c.toInt()
    }
}

fun main() {
    println(numTrees(11))
}
