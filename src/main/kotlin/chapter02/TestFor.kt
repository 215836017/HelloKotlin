
// 学习 for 循环

fun main(args: Array<String>) {

//    testFor_01()
    testFor_02()
}

fun testFor_01() {
    val list = listOf(2, 3, 5, 6, 8)
    for (k in list) {
        print("  " + k)
    }

    println()
    val set = setOf(1, 2, 3, 4)
    for (k in set) {
        print("  ${k}")
    }
}

fun testFor_02() {
    val str = "努力学习Kotlin"
    for (item in str) {
        print(item + " ")
    }

    println()
    val arr = arrayOf(1, 2, 3, 4, 5, 6)
    for (item in arr) {
        print("  " + item)
    }
}