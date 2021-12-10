
// 学习 类的继承

fun main() {
//    testStudent2()
//    testStudent3()
    testStudent4()
}

open class Parent4{
    open val str: String  = "Parent4"
}
class Child4(override val str: String = "Child4"):Parent4(){}


// 第一种情况
open class Parent1 {
    open var str = "str"
}

class Child1 : Parent1() {
    override var str = "str_child"
}

// 第二种情况
open class Parent2 {
    open val str = "str"
}

class Child2_1 : Parent2() {
    override val str = "str_child"
}

class Child2_2 : Parent2() {
    override var str = "str_child"
}

// 第三种情况
class Child3 : Parent1() {
//    override val str = "str_child"  // 编辑器直接报红了
}

fun testStudent4() {
    val student4 = Student4("st4", 20, "st4_schoolName");
    student4.printInfo()
}

open class Person8 {
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    var name: String = ""
    var age: Int = 0

    open fun printInfo() =
        println("name: " + name + " age: " + age)
}

class Student4 : Person8 {
    constructor(name: String, age: Int, schoolName: String)
            : super(name, age) {
        this.schoolName = schoolName
    }

    var schoolName: String = ""

    override fun printInfo() {
        println("name: ${name}, schoolName: ${schoolName}")
    }
}

fun testStudent3() {
    val student3 = Student3("xiaoming", 20, 185, "pingguo", 30, "xiaoming-school")
    student3.printInfo()
}

class Student3(name: String, age: Int, height: Int, likeFood: String, constByMonth: Int, schoolName: String) :
    Person7(name, age, height, likeFood, constByMonth) {
    val schoolName: String = schoolName;

    override fun printInfo() =
        println("name: " + name + " age: " + age + " height: " + height + " likeFood: " + likeFood + " constByMonth: " + constByMonth + " schoolName: " + schoolName)
}

open class Person7(name: String, age: Int, height: Int, likeFood: String, constByMonth: Int) {
    val name: String = name
    val age: Int = age
    val height: Int = height
    val likeFood: String = likeFood
    val constByMonth: Int = constByMonth

    open fun printInfo() =
        println("name: " + name + " age: " + age + " height: " + height + " likeFood: " + likeFood + " constByMonth: " + constByMonth)
}

fun testStudent2() {
    val student2 = Student2("xiaoming", 20, 185, "pingguo", 30, "xiaoming-school")
    student2.printInfo()
    val worker = Worker("worker", 21, 190, "shupian", 40, "worker-factory", 8000)
    worker.printInfo()
}

open class Person6(name: String, age: Int, height: Int, likeFood: String, constByMonth: Int) {
    val name: String = name
    val age: Int = age
    val height: Int = height
    val likeFood: String = likeFood
    val constByMonth: Int = constByMonth

    fun printInfo() =
        println("name: " + name + " age: " + age + " height: " + height + " likeFood: " + likeFood + " constByMonth: " + constByMonth)
}

class Student2(
    name: String, age: Int, height: Int, likeFood: String, constByMonth: Int, schoolName: String
) : Person6(name, age, height, likeFood, constByMonth) {
    val schoolName: String = schoolName;
}

class Worker(
    name: String, age: Int, height: Int,
    likeFood: String, constByMonth: Int, nameOfFactory: String, salary: Int
) : Person6(name, age, height, likeFood, constByMonth) {
    val nameOfFactory: String = nameOfFactory
    val salary: Int = salary
}

open class Person5 {
    var name = ""
    var age = 0
}

class Student1 : Person5() {
    var schoolName = ""
    var studentId = 0
}