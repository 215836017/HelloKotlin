package chapter07

class TestTypealiasClass(name: String, age: Int) {
    var name = name
    var age = age
}

typealias MyTypealias = TestTypealiasClass

fun testTypealias1() {
    var t1 = TestTypealiasClass("t1", 10)
    var t2 = MyTypealias("t2", 10)

    println("name = ${t1.name}, age = ${t1.age}")
    println("name = ${t2.name}, age = ${t2.age}")
}


class MyType<U, T>(a: U, b: T) {
    val a: U = a
    val b: T = b
}

fun testTypealias2() {
    val t: MyType<String, Int> = MyType("shen", 20)
    val m: MyType<String, Int> = MyType("zhou", 22)
    val n: MyType<String, Int> = MyType("wang", 15)
}

typealias UType = MyType<String, Int>

fun testTypealias2_1() {
    val t: UType = MyType("shen", 20)
    val m: UType = MyType("shen", 20)
    val n: UType = MyType("shen", 20)
}

typealias UType1<U> = MyType<U, Int>

fun testTypealias2_2() {
    val t: UType1<String> = MyType("shen", 20)
    val m: UType1<Int> = MyType(12, 20)
    val n: UType1<Double> = MyType(13.13, 20)
}


fun testTypealiasOperate(function: (Int, Int) -> Unit, a: Int, b: Int) {
    function(a, b)
}

typealias myFun = (Int, Int) -> Unit

fun testTypealiasOperate2(function: myFun, a: Int, b: Int) {
    function(a, b)
}


typealias myFun2<T, U> = (T, U) -> Unit

fun <T, U> testTypealiasOperate23(function: myFun2<T, U>, a: T, b: U) {
    function(a, b)
}


class TypealiasPerson {
    inner class TypealiasPersonStudent {}
}

typealias InStudent = TypealiasPerson.TypealiasPersonStudent

fun testTypealiasOperate3() {
    val p = TypealiasPerson()
    val s1: TypealiasPerson.TypealiasPersonStudent = p.TypealiasPersonStudent()
    val s2: InStudent = p.TypealiasPersonStudent()
}

fun main() {
    testTypealias1()
}