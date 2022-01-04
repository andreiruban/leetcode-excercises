package algorithms.design

import java.util.Stack

class MinStack {

    private val mins = Stack<Int>()
    private val base = Stack<Int>()

    fun push(`val`: Int) {
        if (base.empty() || `val` <= mins.peek()) {
            mins.push(`val`)
        }

        base.push(`val`)
    }

    fun pop() {
        if (base.peek() == mins.peek()) {
            mins.pop()
        }
        base.pop()
    }

    fun top(): Int {
        return base.peek()
    }

    fun getMin(): Int {
        return mins.peek()
    }
}

fun main() {
    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    val param1 = minStack.getMin()
    minStack.pop()
    val param2 = minStack.top()
    val param3 = minStack.getMin()

    println(param1)
    println(param2)
    println(param3)
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */