package algorithms.arrays

object TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indices = mutableListOf<Int>()
        nums.forEachIndexed { i, a ->
            indices.forEach { j ->
                if (a + nums[j] == target) return intArrayOf(j, i)
            }
            indices.add(i)
        }


        return intArrayOf()
    }
}

fun main() {
    println(TwoSum.twoSum(intArrayOf(2,7,11,15), 9).joinToString(","))
    println(TwoSum.twoSum(intArrayOf(3,2,4), 6).joinToString(","))
    println(TwoSum.twoSum(intArrayOf(3,3), 6).joinToString(","))
    println(TwoSum.twoSum(intArrayOf(0, 4, 3, 0), 0).joinToString(","))
}
