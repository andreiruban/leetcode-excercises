package algorithms.recursion

import algorithms.recursion.PascalsTriangle2.getRow

@SuppressWarnings("DUPLICATES")
object PascalsTriangle2 {

    fun getRow(rowIndex: Int): List<Int> {
        return generate(rowIndex + 1).last()
    }

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
    println(getRow(3))
}