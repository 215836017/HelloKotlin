package chapter07

import java.io.File

// 学习 equals函数

fun testEqual1() {
    var file1 = File("E:/ab.txt")
    var file2 = File("E:/ab.txt")

    println("file1 == file2 : " + (file1 == file2))
    println("file1 === file2 : " + (file1 === file2))
}

class EqualPerson(name: String, age: Int) {
    var name = name
    var age = age

    override fun equals(other: Any?): Boolean {
        if (other != null && other is EqualPerson) {
            return (this.name == other.name) && this.age == other.age
        }
        return false
    }
}

fun testEqual2() {
    val p1 = EqualPerson("xiaoMing", 20)
    val p2 = EqualPerson("xiaoMing", 20)
    println("p1 == p2: " + (p1 == p2))
    println("p1 === p2: " + (p1 === p2))
}


data class StudentEquals(val name: String, val age: Int)

fun testEqual3() {
    val s1 = StudentEquals("s1", 20)
    val s2 = StudentEquals("s2", 20)
    val s3 = StudentEquals("s1", 10)
    val s4 = s1
    val s5 = StudentEquals("s1", 20)

    println("s1 -- s2 = ${s1.equals(s2)}")
    println("s1 -- s3 = ${s1.equals(s3)}")
    println("s1 -- s4 = ${s1.equals(s4)}")
    println("s1 -- s5 = ${s1.equals(s5)}")
}

fun testEqual4() {
    val s1 = "xiaoMing"
    val s2 = "xiaoMing"

    println("s1 == s2: ${s1 == s2}")
    println("s1 === s2: ${s1 === s2}")
    println("s1.equals(s2): ${s1.equals(s2)}")

}

fun main(args: Array<String>) {
//    testEqual1()
//    testEqual2()
//    testEqual3()
    testEqual4()
}

