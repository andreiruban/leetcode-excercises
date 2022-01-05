package algorithms.design

import java.util.Stack

class MaxStack {

    val base = Stack<Int>()
    val maxs = Stack<Int>()

    fun push(x: Int) {
        if (maxs.isEmpty() || x > maxs.peek()) {
            maxs.push(x)
        } else {
            maxs.push(maxs.peek())
        }

        base.push(x)
    }

    fun pop(): Int {
        maxs.pop()
        return base.pop()
    }

    fun top(): Int {
        return base.peek()
    }

    fun peekMax(): Int {
        return maxs.peek()
    }

    fun popMax(): Int {
        val max = peekMax()
        val temp = Stack<Int>()
        while (top() != max) {
            temp.push(pop())
        }
        pop()
        while (!temp.isEmpty()) push(temp.pop())
        return max
    }
}

fun main() {
    val stack = MaxStack()
    stack.push(5)
    stack.push(1)
    println("popped max: ${stack.popMax()}")
    println("peeked max: ${stack.peekMax()}")
    // stack.push(3)
    // stack.push(2)
    // stack.push(5)
    // stack.push(8)
    //
    // println("popped max: ${stack.popMax()}")
    //
    // stack.push(4)
    // stack.push(1)
    //
    // println("popped: ${stack.pop()}")
    // println("top : ${stack.top()}")
}
