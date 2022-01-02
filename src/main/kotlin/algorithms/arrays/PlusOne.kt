package algorithms.arrays

import java.math.BigInteger

object PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var num = BigInteger.ZERO
        digits.forEachIndexed { i, n ->
            val digit = BigInteger.valueOf(10L).pow(digits.size - 1 - i)
            val number = n.toBigInteger().multiply(digit)

            num = num.plus(number)
        }
        println(num)
        num = num.inc()
        return num.toString().toCharArray().map { it.toString() }.map { it.toInt() }.toIntArray()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(plusOne(intArrayOf(9,8,7,6,5,4,3,2,1,0)).toList())
        // println(plusOne(intArrayOf(1, 2, 3)).toList())
        // println(plusOne(intArrayOf(4, 3, 2, 2)).toList())
        // println(plusOne(intArrayOf(9)).toList())
    }

    private infix fun Int.pow(exponent: Int): Int = BigInteger.valueOf(this.toLong()).pow(exponent).toInt()
}
