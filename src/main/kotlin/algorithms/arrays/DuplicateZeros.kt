package algorithms.arrays

import algorithms.arrays.DuplicateZeros.duplicateZeros
import java.util.LinkedList

import java.util.Queue




object DuplicateZeros {

    /**
     * Time: 0(n)
     * Space: O(1)
     * */
    fun duplicateZeros(arr: IntArray) {
        val q: Queue<Int> = LinkedList()
        for (i in arr.indices) {
            q.add(arr[i])
            if (arr[i] == 0) q.add(0)
            arr[i] = q.remove()
        }
    }

    /**
     * Time: 0(n^2)
     * Space: O(1)
     * */
    fun duplicateZerosClassic(arr: IntArray) {
        for (i in arr.size - 1 downTo 0) {
            if (arr[i] == 0) {
                for (j in arr.size - 2 downTo i) {
                    arr[j + 1] = arr[j]
                }
            }
        }
    }
}

fun main() {
//    val arr = intArrayOf(1, 3, 4, 5)
//    val arr = intArrayOf(0, 0, 0, 0, 0, 0, 0)
    val arr = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
    println(arr.joinToString())
//    duplicateZerosClassic(arr)
    duplicateZeros(arr)
    println(arr.joinToString())
}
