
// 学习 函数字面量

fun main() {
    printMsg("测试函数字面量")

    println("普通的递归：start: " + System.currentTimeMillis())
    println("普通的递归：result = " + fibo(40))
    println("普通的递归：end: " + System.currentTimeMillis())

    println("使用尾递归的递归: start: " + System.currentTimeMillis())
    println("使用尾递归的递归：result = " + fibo2(40))
    println("使用尾递归的递归: end: " + System.currentTimeMillis())
//    println("普通的递归：")
//    println(fact(5))
//    println("使用尾递归的递归: ")
//    println(fact2(5))
//    println(testFact2(5))
}

val printMsg = { msg: String -> println(msg) }


// 之前的递归
fun fibo(startNum: Int): Int {
//    println("startNum = " + startNum)
    return when (startNum) {
        0 -> 1
        1 -> 1
        else -> {
            var re = fibo(startNum - 1) + fibo(startNum - 2)
//            println("re = " + re)
            return re
        }
    }
}

// 使用尾递归
fun fibo2(startNum: Int): Int {

    tailrec fun fiboTail(index: Int, ant: Int, act: Int): Int {
//        println("index = " + index + ", ant = " + ant + ", act = " + act)
        return when (index) {
            0 -> ant
            else -> {
                var re = fiboTail(index - 1, act, ant + act)
//                println("re = " + re)
                return re
            }
        }
    }

    return fiboTail(startNum, 1, 1)
}

fun fact(k: Int): Int {
    println("k = " + k)
    if (k == 1) {
        return 1
    } else {
        var re = k + fact(k - 1)
        println("re = " + re)
        return re
    }
}

fun fact2(k: Int): Int {
    fun tailFact2(m: Int, n: Int): Int {
        println("m = " + m + ", n = " + n)
        if (m == 1) {
            return n
        } else {
            var re = tailFact2(m - 1, m + n)
            println("re = " + re)
            return re
        }
    }

    return tailFact2(k, 1)
}

fun testFact2(k: Int): Int {

    tailrec fun factTail(m: Int, n: Int): Int {
        println("m = " + m + ", n = " + n)
        if (m == 0) {
            return n
        } else {
            var re = factTail(m - 1, m * n)
            println("re = " + re)
            return re
        }
    }
    return factTail(k, 1)
}