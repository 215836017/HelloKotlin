
// 学习 MutableSet

fun main() {
//    testMSet01()
    testMSet02()
}

fun testMSet02() {
    val mSet1 = mutableSetOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    val mSet2 = mutableSetOf("你好", "他好", "我好", "大家好")
    val mSet3 = mutableSetOf("Python", "北京", "上海")

    mSet1.add("天津")
    println("add：${mSet1}")

    mSet1.addAll(mSet2)
    println("addAll: ${mSet1}")

    mSet1.remove("Java")
    println("remove: ${mSet1}")

    mSet1.removeAll(mSet3)
    println("removeAll: ${mSet1}")
}

fun testMSet01() {
    val set1 = setOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
    val mSet = set1.toMutableSet()

    println(mSet)
}