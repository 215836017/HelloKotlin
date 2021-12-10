
// 学习 Set

fun main() {

//    testSet01()
//    testSet02()
//    testSet03()
//    testSet04()
    testSet05()
}

fun testSet05() {
    // 补集：Kotlin 中并没有补集的方法，可以通过逻辑运算得到
    val set1 = setOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    val set2 = setOf("Python", "北京", "上海")
    val set3 = setOf("你好", "他好", "我好", "大家好")

    println(set1.union(set3) - set1.subtract(set2))
}

fun testSet04() {
    // 并集
    val set1 = setOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    val set2 = setOf("你好", "他好", "我好", "大家好")
    val set3 = setOf("1111", "2222", "333", "3333")
    println(set1.union(set2).union(set3))
}

fun testSet03() {
    // 差集
    val set1 = setOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    val set2 = setOf("Python", "北京", "上海")
    val set3 = setOf("你好", "他好", "我好", "大家好")

    println(set1.subtract(set2))
    println(set1.subtract(set3))
}

fun testSet02() {
    // 交集
    val set1 = setOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    val set2 = setOf("Python", "北京", "上海")
    val set3 = setOf("你好", "他好", "我好", "大家好")

    println(set1.intersect(set2))
    println(set1.intersect(set3))
}

fun testSet01() {
    // 包含关系
    val set1 = setOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    val set2 = setOf("Python", "北京", "上海")
    val set3 = setOf("你好", "他好", "我好", "大家好")

    println(set1.containsAll(set2))
    println(set2.containsAll(set1))
    println(set1.containsAll(set3))
}