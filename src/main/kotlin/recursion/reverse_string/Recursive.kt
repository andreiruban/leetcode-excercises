package recursion.reverse_string

object Recursive {
    fun reverseString(s: CharArray) {
        tailReverse(start = 0, end = s.size - 1, s)
    }

    private fun tailReverse(start: Int, end: Int, s: CharArray) {
        if (start < end) {
            val temp = s[start]
            s[start] = s[end]
            s[end] = temp
            tailReverse(start = start + 1, end = end - 1, s)
        }
    }
}
