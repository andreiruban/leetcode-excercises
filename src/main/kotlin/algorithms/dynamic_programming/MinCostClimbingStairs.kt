package algorithms.dynamic_programming

import algorithms.dynamic_programming.MinCostClimbingStairs.minCostClimbingStairs
import kotlin.math.min

object MinCostClimbingStairs {

    fun minCostClimbingStairs(cost: IntArray): Int {
        val mins = IntArray(cost.size + 1)

        for (i in 2 until mins.size) {
            val priceOneStep = mins[i - 1] + cost[i - 1]
            val priceTwoSteps = mins[i - 2] + cost[i - 2]
            mins[i] = min(priceOneStep, priceTwoSteps)
        }

        return mins[mins.size - 1]
    }
}

fun main() {
    println(minCostClimbingStairs(intArrayOf(10, 15, 20)))
}
