package chapter08

import kotlin.reflect.KClass

class ReflexPeople(name: String, age: Int) {
    val name: String = name
    val age: Int = age

    fun printInfo() {
        println("this is the method in ReflexPeople.class")
    }
}

fun testReflex1() {
    val c = ReflexPeople::class
    println(c)

    val p: KClass<ReflexPeople> = ReflexPeople::class
    println("p.simpleName = ${p.simpleName}")  // 打印类的名称
    println("p.isAbstract = ${p.isAbstract}")  // 打印当前类型是否为抽象类型

    val p1 = ReflexPeople("xiaoMing", 20)
    println("p.isInstance(p1) = ${p.isInstance(p1)}")   // 判断参数是否是当前类型的实例
}

fun testReflex2() {
    val p = ReflexPeople("name", 18)
    val c = p::class
    val name = p::name
    println(name)
    println(c)
    println(c.isInstance(p))
}

fun <T> compute(compution_function: (T, T) -> Unit, a: T, b: T) {
    compution_function(a, b)
}

fun addCompution(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

fun addCompution(a: Int) {
    println("$a + 1 = ${a + 1}")
}

fun testReflex3() {
    // compute(addCompution, 2, 3) // ①编译报错：因为 addCompution 只是一个函数名称，并不是一个 (Int, Int)->Unit 的函数实例。
    compute(::addCompution, 2, 3) // ②
    // compute(::addCompution, 2) // 编译器报错
}

class MyCompute<T>(compution: ((T, T) -> Unit, T, T) -> Unit) {
    val compution: ((T, T) -> Unit, T, T) -> Unit = compution
}

fun testReflex4() {
    val mc = MyCompute<Int>(::compute)
    mc.compution(::addCompution, 20, 3)
}

fun sayHello(str: String) {
    println("hello, $str")
}

fun testReflex5() {
    // ::sayHello("Kotlin") // ① 编译器报错
    ::sayHello.call("kotlin")
}

fun testReflex6() {
    val p1 = ReflexPeople("Kotlin-reflect", 30)
    // 第一种方式
    p1::printInfo.call()

    // 第二种方式
    ReflexPeople::printInfo.call(p1)
}

val x = 12
var y = 23

fun testReflex7() {
    println(::x.get())
    ::y.set(123)
    println(::y.get())
}

class ReflexPeople1(name: String, age: Int) {
    val name: String = name
    val age: Int = age

    val name_len: Int
        get() = name.length

    var address: String = ""
        get() = "addresss"
        set(value) {
            field = value
        }
}

fun testReflex8() {
    val p = ReflexPeople1("Kotlin-reflect", 30)
    println(p::name.get())
    println(p::name_len.get())
    p::address.set("reflect_set")
    println(p::address.get())
}

class ReflexPeople2(name: String, age: Int) {
    val name: String = name
    val age: Int = age

    fun printInfo() = println("name = $name, age = $age")
}

fun testReflex9(create: (String, Int) -> ReflexPeople2, name: String, age: Int) {
    val test = create(name, age)
    test.printInfo()
}

fun main() {
//    testReflex1()
//    testReflex2()
//    testReflex3()
//    testReflex4()
//    testReflex5()
//    testReflex6()
//    testReflex7()
//    testReflex8()
    testReflex9(::ReflexPeople2, "kotlin-constructor", 20)
}
