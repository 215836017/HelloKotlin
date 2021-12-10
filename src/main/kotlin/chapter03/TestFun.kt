
// 学习 函数

fun main(args: Array<String>) {
    println("result = " + maxNum(3, 2, 9))

    println("sum: " + sum(1, 2, 3, 4))
    println("sum: " + sum(1, 2, 3, 4, 5))
    println("sum: " + sum(1, 2, 3, 4, 5, 6))

    val a = intArrayOf(1, 2, 3, 4, 5, 10)
    println(sum(*a))
    testFields(one = "ss", two = 1, three = 3.1f, four = "String", five = 4)
    testFields("ss", 1, 3.1f, four = "String", five = 4)

    testFields(three = 3.1f, four = "String", five = 4, one = "ss", two = 1)
}

fun valueOf(one: Int = 1, two: String = "", three: Boolean = true, four: Float = 1.0f, five: String = ""){
    // ...
}

fun testFields(one: String, two: Int, three: Float, four: String, five: Int) {
    print("hahaha...")
}

fun sum(vararg x: Int): Int {

    var total = 0
    for (i in x) {
        total += i
    }
    return total
}

fun maxNum(a: Int, b: Int, c: Int): Int {

    fun maxNum(a: Int, b: Int): Int {
        if (a >= b) {
            return a
        }
        return b
    }

    return maxNum(maxNum(a, b), maxNum(b, c))
}