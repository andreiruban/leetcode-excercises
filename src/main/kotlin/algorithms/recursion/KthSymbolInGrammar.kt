package algorithms.recursion

import algorithms.recursion.KthSymbolInGrammar.kthGrammar

object KthSymbolInGrammar {

    fun kthGrammar(N: Int, K: Int): Int = if (N == 1) 0 else K.inv() and 1 xor kthGrammar(N - 1, (K + 1) / 2)
}

fun main() {
    println(kthGrammar(30, 434991989))
}
