package algorithms.dynamic_programming

object BestTimeToBuyAndSell {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0
        for (i in prices.indices) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice
            }
        }
        return maxProfit
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        println(maxProfit(intArrayOf(7, 6, 4, 3, 1)))
        println(maxProfit(intArrayOf(2, 4, 1)))
    }
}
