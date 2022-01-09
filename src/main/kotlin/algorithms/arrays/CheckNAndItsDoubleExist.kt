package algorithms.arrays

import algorithms.arrays.CheckNAndItsDoubleExist.checkIfExist

object CheckNAndItsDoubleExist {
    fun checkIfExist(arr: IntArray): Boolean {
        arr.forEachIndexed { i, a ->
            if (a % 2 == 0) {
                arr.forEachIndexed { j, b ->
                    if (i != j && b * 2 == a) {
                        return true
                    }
                }
            }

        }

        return false
    }
}

fun main() {
    println(checkIfExist(intArrayOf(-2, 0, 10, -19, 4, 6, -8)))
    // println(checkIfExist(intArrayOf(0, 0)))
    // println(checkIfExist(intArrayOf(10,2,5,3)))
}
