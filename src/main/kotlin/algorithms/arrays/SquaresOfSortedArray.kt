package algorithms.arrays

import algorithms.arrays.SquaresOfSortedArray.sortedSquares

object SquaresOfSortedArray {

    /**
     * Time O(n)
     * Space O(n)
     * */
    fun sortedSquares(A: IntArray): IntArray? {
        val n = A.size
        var j = 0
        while (j < n && A[j] < 0) j++
        var i = j - 1
        val ans = IntArray(n)
        var t = 0
        while (i >= 0 && j < n) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i]
                i--
            } else {
                ans[t++] = A[j] * A[j]
                j++
            }
        }
        while (i >= 0) {
            ans[t++] = A[i] * A[i]
            i--
        }
        while (j < n) {
            ans[t++] = A[j] * A[j]
            j++
        }
        return ans
    }
}

fun main() {
    println(sortedSquares(intArrayOf(-3, -1, 0, 1, 3, 10))?.joinToString())
}
