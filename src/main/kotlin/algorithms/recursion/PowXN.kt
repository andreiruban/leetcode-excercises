package algorithms.recursion

import algorithms.recursion.Pow.recursive

object Pow {

    /**
     * Time: O(log(N))
     * Space: O(log(N))
     * */
    fun recursive(x: Double, n: Int): Double = when {
        n < 0 -> {
            fastPow(1 / x, -n.toLong())
        }
        else -> {
            fastPow(x, n.toLong())
        }
    }

    private fun fastPow(x: Double, n: Long): Double {
        if (n == 0L) {
            return 1.0
        }

        val half = fastPow(x, n / 2)
        return when {
            n % 2 == 0L -> {
                half * half
            }
            else -> {
                half * half * x
            }
        }
    }
}

fun main() {
    println(recursive(2.0, 100))
}
