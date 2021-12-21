package algorithms.arrays

import algorithms.arrays.RemoveDuplicatesFromSortedArray.removeDuplicates

object RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            if (i < nums.size - 1 && nums[i] == nums[i + 1]) {
                continue
            }
            nums[count] = nums[i]
            count++
            println(nums.toList())
        }
        return count
    }
}

fun main() {
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
}
