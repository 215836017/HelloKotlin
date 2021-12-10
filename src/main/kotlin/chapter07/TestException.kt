package chapter07

import java.lang.NumberFormatException
import kotlin.Exception

// 学习 异常

fun testE1() {
    val s = "123"
    println(s.toInt())

    val s1 = "abc"
    println(s1.toInt()) //java.lang.NumberFormatException: For input string: "abc"
}

fun testE2(i: Int, str: String): Int {
    try {
        val a = 10 / i
        val s = str.toInt()
        return s
    } catch (e: Exception) {
        when (e) {
            is ArithmeticException -> println("除数不能为0")
            is NumberFormatException -> println("不是正确的数字格式")
            else -> println("未知错误")
        }

        return 0
    } finally {
        println("函数执行完毕")
    }
}


class MyException(msg: String) : Exception(msg) {}

fun testE3() {
    var userName = "xiaoMing"
    try {
        if (userName != "xiaoHong") {
            throw MyException("用户名错误")
        }
    } catch (e: Exception) {
        if (e is MyException) {
            println(e.message)
        }
    } finally {
        println("用户名判断完毕")
    }
}

fun errorAppear1(msg: String): Nothing {
    throw MyException(msg)
}

fun errorAppear2(msg: String) {
    throw MyException(msg)
}

fun main() {
//    testE1()

//    println("result1 = " + testE2(0, "123"))
//    println("result2 = " + testE2(0, "abc"))
//    println("result3 = " + testE2(2, "123"))
//    println("result4 = " + testE2(2, "abc"))

    testE3()
}