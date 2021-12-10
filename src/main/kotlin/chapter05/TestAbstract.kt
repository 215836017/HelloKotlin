
// 学习 抽象类

fun main() {

//    testAbstract2()

    testOverrideTest2()
}

fun testOverrideTest2() {
    var o1 = OverrideTest1()
    o1.printMsg("msg1")
    o1.printMsg("msg1", "tag1")

    var o2 = OverrideTest2()
    o2.printMsg("msg2")
}

open class OverrideTest1 {
    open fun printMsg(msg: String) = println(msg)
    fun printMsg(msg: String, tag: String) = println(msg)
}

class OverrideTest2 : OverrideTest1() {
    override fun printMsg(msg: String) = println("print msg in Child: ${msg}")
}

fun testAbstract2() {
    var a2 = AbstractClass2()
    a2.content = "testAbstract2"
    println("a2.content = ${a2.content}")
    println("a2.getLenOfContent() = ${a2.getLenOfContent()}")
}

class AbstractClass2 : AbstractClass1() {
    override var content: String = ""
        set(value) {
            field = value
        }

    override fun getLenOfContent(): Int = content.length
}

abstract class AbstractClass1 {
    var name = "name";
    abstract var content: String
    abstract fun getLenOfContent(): Int
}