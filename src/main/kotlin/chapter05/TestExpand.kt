
// 学习 类的扩展

class TestExpand1 {
    fun sayHi() = println("Hi!")
    fun sayBye() = println("Bye!")
}

fun TestExpand1.sayGreat() = println("Great!")
fun TestExpand1.sayHi() = println("Hi -- KuoZhang")

fun Int.sayHi() = println("Hi, I am Int fun")

open class TestExpand2 {}
class TestExpand3 : TestExpand2() {}

fun TestExpand2.printHello() = println("Hello, TestExpand2")
fun TestExpand3.printHello() = println("Hi, TestExpand3")

class TestExpand4 {
    var name: String = ""
}

fun TestExpand4?.printInfo() {
    if (null == this) {
        println("sorry, this object is null")
    } else {
        println("name = ${this.name}")
    }
}

fun testExpand4() {
    var t4A: TestExpand4? = null
    t4A.printInfo()

    var t4B: TestExpand4? = TestExpand4();
    t4B?.name = "t4B"
    t4B?.printInfo()
}


class TestExpand5 {
    var name: String = ""
}
//var TestExpand5.age = 0
//var TestExpand5.type = "type"

val TestExpand5.age: Int
    get() = 10


class TestExpand6 {
    var name: String = ""

    var _age: Int = 0
    var _type: String = ""
}

var TestExpand6.age: Int
    get() = this._age
    set(value) {
        this._age = value
    }
var TestExpand6.type: String
    get() = this._type
    set(value) {
        this._type = value
    }

fun testExpand6() {
    var t6 = TestExpand6()
    t6.name = "t6"
    t6.age = 20
    t6.type = "t6-type"
    println("name = ${t6.name}, age = ${t6.age}, t6.type = ${t6.type}")
}

fun main() {
//    var e1 = TestExpand1()
//    e1.sayHi()
//    e1.sayBye()
//    e1.sayGreat()
//
//    var i = 10
//    i.sayHi()

//    var t2: TestExpand2 = TestExpand3()
//    t2.printHello()

//    testExpand4()
    testExpand6()
}