package algorithms.arrays

import algorithms.arrays.MaxConsecutiveOnes.findMaxConsecutiveOnes

object MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxConseq = 0
        var tempConseq = 0

        var previousOne = false

        nums.forEach {
            when (it) {
                1 -> {
                    when {
                        previousOne -> {
                            tempConseq++
                        }
                        else -> {
                            tempConseq = 1
                            previousOne = true
                        }
                    }
                }
                else -> {
                    previousOne = false
                }
            }

            if (tempConseq > maxConseq) maxConseq = tempConseq
        }

        return maxConseq
    }
}

fun main() {
    check(findMaxConsecutiveOnes(intArrayOf(0)) == 0) { println("Wrong Answer!") }
    check(findMaxConsecutiveOnes(intArrayOf(1)) == 1) { println("Wrong Answer!") }
    check(findMaxConsecutiveOnes(intArrayOf(1, 0, 1, 1, 0, 1)) == 2) { println("Wrong Answer!") }
}
