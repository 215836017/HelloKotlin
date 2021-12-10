package chapter06

// 学习 泛型

fun testCommon01(value: Int) {
    println("the value is $value")
}

fun testCommon01(value: Double) {
    println("the value is $value")
}

fun testCommon01(value: String) {
    println("the value is $value")
}

fun <T> testCommon02(value: T) {
    println("testCommon02() -- the value is $value")
}

class TestCommonData1<T>(value: T) {
    var v = value
    fun printInfo() = println("TestCommonData1<T>(value: T)  --- value = $v")
}

interface TestCommonInterface1<T> {
    fun printMsg(msg: T)
}

class TestCommonData2 : TestCommonInterface1<Int> {
    override fun printMsg(msg: Int) {
        println("TestCommonData2() -- msg = $msg")
    }
}

class TestCommonData3 : TestCommonInterface1<String> {
    override fun printMsg(msg: String) {
        println("TestCommonData3() -- msg = $msg")
    }
}

class TestCommonData4<T> : TestCommonInterface1<T> {
    override fun printMsg(msg: T) {
        println("TestCommonData3() -- msg = $msg")
    }
}

interface TestCommonInterface2<T> {
    fun create(): T
}

class CCC : TestCommonInterface2<String>{
    override fun create(): String {
        TODO("Not yet implemented")
    }
}

//fun change2(f: TestCommonInterface2<String>) {
//    val factoryAny: TestCommonInterface2<Any> = f  // 错误的写法
//}

interface TestCommonInterface3<out T> {
    fun create(): T
}

class AAA : TestCommonInterface3<String>{
    override fun create(): String {
      return "AAAAAAAAA"
    }
}
class BBB : TestCommonInterface3<Int>{
    override fun create(): Int {
        return 20
    }
}
fun change3(f: TestCommonInterface3<String>) {
    val factoryAny: TestCommonInterface3<Any> = f
}

fun main() {
//    testCommon01(10)
//    testCommon01(10.11)
//    testCommon01("11.01")

//    testCommon02(10)
//    testCommon02(10.11)
//    testCommon02("11.01")

//    val tc1_1 = TestCommonData1<Int>(100)
//    tc1_1.printInfo()
//    val tc1_2 = TestCommonData1<Double>(100.001)
//    tc1_2.printInfo()
//    val tc1_3 = TestCommonData1<String>("100-100")
//    tc1_3.printInfo()

//    val tc2 = TestCommonData2()
//    val tc3 = TestCommonData3()
//    tc2.printMsg(200)
//    tc3.printMsg("300-300")

    val tc4_1 = TestCommonData4<Int>()
    tc4_1.printMsg(40)
    val tc4_2 = TestCommonData4<Double>()
    tc4_2.printMsg(40.04)
    val tc4_3 = TestCommonData4<String>()
    tc4_3.printMsg("40-40")

}