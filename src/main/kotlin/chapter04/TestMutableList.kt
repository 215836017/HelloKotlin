
// 学习 MutableList

fun main() {
//    testML01()
//    testML02()
//    testML03()
//    testML05()
//    testML06()
    testML07()
}

fun testML07() {
    //(7). 清空： clear 或 removeAll
    val arrML1 = mutableListOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    val arrML2 = mutableListOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    val arrML3 = mutableListOf("C/C++", "杭州", "从北京到杭州再到上海")
    println(arrML1.clear())
    println(arrML1)

    println(arrML2.removeAll(arrML3))
    println(arrML2)
}

fun testML06() {
    // (6). 取子列表： subList
    val arrML = mutableListOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    println(arrML.subList(2, 4))
}

fun testML05() {
    // (5). 替换指定位置的元素： set 或 下表方法
    val arrML = mutableListOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    arrML.set(1, "Java-java")
    arrML[2] = "Kotlin-Kotlin"
    println("arrMl = " + arrML)
}

fun testML03() {
    // (3). 移出一个元素: remove
    // (4). 移除指定位置的元素：removeAt
    val arrML = mutableListOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    arrML.removeAt(0)
    println("arrMl 111 = " + arrML)

    arrML.remove("Python")
    println("arrMl 222 = " + arrML)
}

fun testML02() {
    // (2). 添加另一个List， Array，Set等有序集合： addAll
    val arrML = mutableListOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    val arrML2 = mutableListOf("你好", "他好", "我好", "大家好")
    val numbersML = mutableListOf(0, -99, 99, 30, 78, 11)

    arrML.addAll(arrML2)
    println("arrMl = " + arrML)
}

fun testML01() {
    // (1). 往末尾添加元素： add
    val arrML = mutableListOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")

    println("arrML 111 = " + arrML.joinToString())
    println("arrML.add = " + arrML.add("深圳"))
    println("arrML 222 = " + arrML.joinToString())
    println("arrML.add = " + arrML.add(2, "黑龙江"))
    println("arrML 333 = " + arrML.joinToString())
}



