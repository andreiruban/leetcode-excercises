package algorithms.recursion

object ReverseString {

    fun reverseNonRecursively(s: CharArray) {
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

    fun reverseRecursively(s: CharArray) {
        reverseRecursively(start = 0, end = s.size - 1, s)
    }

    private fun reverseRecursively(start: Int, end: Int, s: CharArray) {
        if (start < end) {
            val temp = s[start]
            s[start] = s[end]
            s[end] = temp
            reverseRecursively(start = start + 1, end = end - 1, s)
        }
    }
}
