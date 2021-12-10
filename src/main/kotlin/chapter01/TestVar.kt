package chapter01

fun main(args: Array<String>) {

//    testVar01();
    testVar02();
}

fun testVar02() {
    var age = 5
    var name = "name 123"
    println("age = " + age)
    println("name = " + name)

    age = 15
    // name = 345  // 变量 name 已经是字符串类型，修改时也只能还是字符串类型 --- kotlin 是强类型语音
    name = "name abc";
    println("age = " + age)
    println("name = " + name)
}

fun testVar01() {
    val str = "abcdefg"
    val 女朋友Count = 1
    val 工资 = 2000

    println("str: " + str)
    println("女朋友Count: " + 女朋友Count)
    println("工资: " + 工资)

    // str = "123";  // 再次赋值时编辑器提示错误
}