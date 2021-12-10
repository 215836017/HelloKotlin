
// 学习 Lambda 表达式

fun main(args: Array<String>) {
    println("sum1 = " + add(3, 4))
    println("sum2 = " + sum(3, 4))
    println("sum3 = " + add1(3, 4, sum))
    println("sum4 = " + add2(3, sum, 4))

    val sum5 = add1(3, 4, { x: Int, y: Int -> x + y })
    println("sum5 = " + sum5)

    // 最后一个参数是 Lambda表达式，则可以放在函数圆括号的外面
    val sum6 = add1(3, 4) { x: Int, y: Int -> x + y }
    println("sum6 = " + sum6)

    val sum7 = add2(3, { x: Int, y: Int -> x + y }, 4)
    println("sum7 = " + sum7)
}

// 以简单的求和函数为例
fun add(x: Int, y: Int): Int {
    return x + y
}

// 改成Lambda表达式
var sum = { x: Int, y: Int ->
    x + y
}

// 使用Lambda表达式，注意在参数中result后面有个：
fun add1(x: Int, y: Int, result: (a: Int, b: Int) -> Int): Int {
    return result(x, y)
}

fun add2(x: Int, result: (a: Int, b: Int) -> Int, y: Int): Int {
    return result(x, y)
}