package algorithms.arrays

import algorithms.arrays.NumbersWithEvenNumberOfDigits.findNumbers

object NumbersWithEvenNumberOfDigits {
    fun findNumbers(nums: IntArray): Int = nums.map { isEven(it) }.filter { it }.count()

    private fun isEven(num: Int): Boolean {
        var digits = 0
        var n = num
        while (n > 0) {
            n /= 10
            digits++
        }
        return digits % 2 == 0
    }
}

fun main() {
    println(findNumbers(intArrayOf(1, 22, 3, 5, 6, 88)))
}