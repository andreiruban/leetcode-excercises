package algorithms.arrays

import algorithms.arrays.DeletingItemsFromArray.removeElement

object DeletingItemsFromArray {

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        for (j in nums.indices) {
            if (nums[j] != `val`) {
                nums[i] = nums[j]
                i++
            }
            // println(nums.toList())
        }
        return i
    }
}

fun main() {
    // println(removeElement(intArrayOf(3,2,2,3), 3))
    // println(removeElement(intArrayOf(3, 3, 2, 5, 7, 2, 3), 3))
    println(removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2))
}