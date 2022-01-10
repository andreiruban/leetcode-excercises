package algorithms.dynamic_programming

import kotlin.math.max

class HouseRobber {

    private val memo = HashMap<Int, Int>()
    private lateinit var nums: IntArray

    private fun dp(i: Int): Int {
        if (i == 0) return nums[0]
        if (i == 1) return max(nums[0], nums[1])

        if (!memo.containsKey(i)) {
            memo[i] = max(dp(i - 1), dp(i - 2) + nums[i])
        }
        return memo[i]!!
    }

    fun rob(nums: IntArray): Int {
        this.nums = nums
        return dp(nums.size - 1)
    }
}

fun main() {
    val unit = HouseRobber()
    println(unit.rob(intArrayOf(2, 1, 1, 2)))
}
