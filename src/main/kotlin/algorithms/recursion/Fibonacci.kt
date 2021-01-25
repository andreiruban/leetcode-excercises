package algorithms.recursion

object Fibonacci {
    private val cache = mutableMapOf<Int, Int>()

    fun fib(n: Int): Int {
        if (cache.containsKey(n)) return cache[n]!!

        if (n < 2) return n

        val number = fib(n - 1) + fib(n - 2)
        cache[n] = number
        return number
    }
}
