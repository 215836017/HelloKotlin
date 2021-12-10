
// 学习 When

fun main(args: Array<String>) {

    // testWhen_01(10)

//    println("result2 = " + testWhen_02(10))

//    println("result3 = " + testWhen_03(10))

//    println("result4 = " + testWhen_04(10))

//    println("result5 = " + testWhen_05(10))

//    println("是否是单个数字： " + testWhen_06(12))

//    println("1--是否是字符串： " + testWhen_07(12))
//    println("2--是否是字符串： " + testWhen_07("12"))

//    testWhen_08(1, 2)
//    testWhen_08(2, 1)
//    testWhen_08(1, 1)

    testWhen_09("123")
    testWhen_09(1)

}

fun testWhen_01(a: Int) {
    when (a) {
        0 -> println("传入的参数是0")
        1 -> println("传入的参数是1")
        else -> println("传入的参数不是0也不是1")
    }
}

fun testWhen_02(x: Int): Boolean {
    val isZero = when (x) {
        Int.MAX_VALUE -> true
        Int.MIN_VALUE -> true
        else -> false
    }

    return isZero
}

fun testWhen_03(x: Int): Boolean {
    val isZero = when (x) {
        Int.MAX_VALUE, Int.MIN_VALUE -> true
        else -> false
    }

    return isZero
}

fun testWhen_04(x: Int): Boolean {
    return when (x) {
        Int.MAX_VALUE, Int.MIN_VALUE -> true
        else -> false
    }
}

fun testWhen_05(x: Int): Boolean {
    return when (x) {
        Math.abs(x) -> true
        else -> false
    }
}


fun testWhen_06(x: Int): Boolean {
    return when (x) {
        in -9..9 -> true
        else -> false
    }
}

fun testWhen_07(any: Any): Boolean {
    return when (any) {
        is String -> true
        else -> false
    }
}

fun testWhen_08(a: Int, b: Int) {
    when {
        a < b -> println("a < b")
        a > b -> println("a > b")
        else -> println("a = b")
    }
}

fun testWhen_09(a: Any) {
    when (a) {
        in 1..7 -> {
            println("传入的值在1到7之间")
        }

        10, 11, 12 -> {
            println("传入的值是 10， 11， 12的其中之一")
        }

        (20 / 3) -> {
            println("传入的值和  20/3 的结果相等")
        }

        is Int -> {
            println("传入的是 Int 值")
        }

        else -> println("传入的参数是 String")
    }
}

