package dynamic_programming

import dynamic_programming.PascalsTriangle.generate

object PascalsTriangle {
    fun generate(numRows: Int): List<List<Int>> {

        if (numRows == 0) return emptyList()

        val triangle = mutableListOf(listOf(1))

        (1 until numRows).forEach { rowI ->
            val prev = triangle.last()
            val next = listOf(1) + (1 until rowI).map { rowJ -> prev[rowJ] + prev[rowJ - 1] }.toList() + listOf(1)
            triangle.add(next)
        }

        return triangle
    }
}

fun main() {
    println(generate(5))
}