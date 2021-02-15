package algorithms.arrays

import algorithms.arrays.MergeSortedArray.merge

object MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var p1 = m - 1
        var p2 = n - 1

        for (p in m + n - 1 downTo 0) {
            if (p2 < 0) break
            if (p1 > -1 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1--]
            } else {
                nums1[p] = nums2[p2--]
            }
        }
    }
}

fun main() {
    val num1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val num2 = intArrayOf(2, 5, 6)

    merge(num1, 3, num2, 3)

    println(num1.joinToString())
}
