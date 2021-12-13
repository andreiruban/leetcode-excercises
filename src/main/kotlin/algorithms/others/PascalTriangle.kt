package algorithms.others

object PascalTriangle {
    private val triangle = mutableListOf<List<Int>>()

    fun generate(numRows: Int): List<List<Int>> {
        (1..numRows).forEach {
            triangle.add(generateRow(it))
        }
        return triangle
    }

    private fun generateRow(row: Int): List<Int> {
        val generated = mutableListOf(1)

        if (row == 1) {
            return generated
        }

        val prev = triangle.last()

        for (i in 1 until prev.size) {
            generated.add(prev[i - 1] + prev[i])
        }

        generated.add(1)
        return generated
    }
}

fun main() {
    println(PascalTriangle.generate(5))
}
