package recursion.reverse_string

import recursion.reverse_string.NonRecursive.reverseString

object NonRecursive {
    fun reverseString(s: CharArray) {
        var left = 0
        var right = s.size - 1
        while (left < right) {
            val temp = s[left]
            s[left] = s[right]
            s[right] = temp
            left++
            right--
        }
    }
}

fun main() {
    val s = charArrayOf('h', 'e', 'l', 'l', 'o')
    reverseString(s)
    println(s)
}
