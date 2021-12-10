package chapter06

import kotlin.properties.Delegates

// 学习 委托中的可观察属性

class Watchable {
    var value: String by Delegates.observable("初始值") { prop, old, new ->
        println("old:${old}, new: ${new}")
    }
}

fun testObservable1() {
    val watchable = Watchable()
    watchable.value = "新的赋值"
    watchable.value = "再次新的赋值"
}

fun main() {
    testObservable1()
}