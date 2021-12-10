fun main() {

//    testNumberCompution();
//    testPerson2()
//    testPerson3()
    testPerson4()

}

fun testPerson4() {
    println("testPerson4 start... ")
    var person4 = Person4(25)
    println(person4.isAudlt)
    person4.age = 20
    println(person4.isAudlt)
    person4.addAge = 10
    println(person4.isAudlt)
}

class Person4(age: Int) {

    var isAudlt = false
        private set

    var age: Int = age
        set(value) {
            field = value
            if (age >= 18) {
                isAudlt = true
            }
        }

    var addAge: Int = 0
        set(value) {
            age += value
        }
}

fun testPerson3() {
    var person3 = Person3(26)
    println(person3.isAudlt)
    person3.age = 20
    println(person3.isAudlt)
    person3.addAge = 10
    println(person3.isAudlt)
//    person3.isAudlt = false  // 编辑器直接报红线了
}

class Person3(age: Int) {
    var age: Int = age
    var isAudlt: Boolean = false
        private set

    var addAge: Int = 0
        set(value) {
            age += value
            if (age >= 18) {
                isAudlt = true
            }
        }
}

fun testPerson2() {
    var person2 = Person2(16)
    println("isAudlt: " + person2.isAudlt)

    person2.addAge = 20
    println("isAudlt: " + person2.isAudlt)
}

class Person2(age: Int) {
    var age = age
    val isAudlt: Boolean
        get() = age >= 18

    var addAge: Int
        get() = 0
        set(value) {
            age += value
        }
}

class CustomType {
    var nameA = "nameA"
    val nameB = "nameB"
}

fun testNumberCompution() {
    val numComp = NumberCompution(10, 20, { x, y -> x + y })
    numComp.operation()
    numComp.operator = { x, y -> x * y }  // 给属性变量重新赋值
    numComp.operation()
}

class NumberCompution(val num1: Int, val num2: Int, var operator: (Int, Int) -> Int) {

    fun operation() {
        println("Operation Result: ${operator(num1, num2)}")
    }
}

