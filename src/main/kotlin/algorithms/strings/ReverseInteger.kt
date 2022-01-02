package algorithms.strings

object ReverseInteger {

    fun reverse(x: Int): Int {
        var a = x
        var rev = 0
        while (a != 0) {
            val pop = a % 10
            a /= 10
            if (rev > Int.MAX_VALUE / 10 || rev == Int.MAX_VALUE / 10 && pop > 7) return 0
            if (rev < Int.MIN_VALUE / 10 || rev == Int.MIN_VALUE / 10 && pop < -8) return 0
            rev = rev * 10 + pop
        }
        return rev
    }

    fun reverse2(x: Int): Int {
        val rev = x.toString().replace("-", "").reversed().toIntOrNull() ?: 0

        return if (x < 0 && rev > 0) {
            -rev
        } else {
            rev
        }
    }
}

fun main() {
    println(ReverseInteger.reverse(320))
    println(ReverseInteger.reverse(-123))
}