package algorithms.recursion

object ClimbingStairs {

    private val cache = mutableMapOf<Int, Int>()

    fun climbStairs(n: Int): Int {
        if (cache.containsKey(n)) return cache[n]!!

        if (n < 4) {
            cache[n] = n
            return n
        }

        val ways = climbStairs(n - 1) + climbStairs(n - 2)
        cache[n] = ways

        return ways
    }
}
