package algorithms.recursion

import algorithms.recursion.PascalsTriangle2.getRow

object PascalsTriangle2 {

    fun getRow(rowIndex: Int): List<Int> = generate(rowIndex).last()

    private fun generate(rowIndex: Int): List<List<Int>> {

        val triangle = mutableListOf(listOf(1))

        if (rowIndex == 0) return triangle

        (1..rowIndex).forEach { rowI ->
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