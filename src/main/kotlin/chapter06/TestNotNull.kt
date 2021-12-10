package chapter06

import kotlin.properties.Delegates

// 学习 委托中的 Delegates.notNull

class JudgeClass {
    var myName: String by Delegates.notNull<String>()
}

fun testNotNull1() {
    var judge = JudgeClass()
    // println("赋值前:")
    // println("judge.myName = ${judge.myName}") // 运行报错： java.lang.IllegalStateException: Property myName should be initialized before get

    judge.myName = ""
    println("赋值之后，但是赋值为空字符串:")
    println("judge.myName = ${judge.myName}")

    judge.myName = "Kotlin"
    println("赋值之后，赋值不是空字符串:")
    println("judge.myName = ${judge.myName}")
}

fun main() {
    testNotNull1()

}