package algorithms.arrays

import algorithms.arrays.ValidMountainArray.validMountainArray

object ValidMountainArray {
    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3) return false

        var peakIdLeft = 0

        for (i in 1 until arr.size) {
            if (arr[i] > arr[i - 1]) {
                peakIdLeft++
            } else break
        }

        var peakIdRight = arr.size - 1

        for (i in arr.size - 2 downTo 0) {
            if (arr[i] > arr[i + 1]) {
                peakIdRight--
            } else break
        }

        return peakIdLeft < arr.size - 1
            && peakIdRight > 0
            && peakIdLeft == peakIdRight
    }
}

fun main() {
    println(validMountainArray(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)))
    // println(validMountainArray(intArrayOf(0, 3, 2, 1)))
}
