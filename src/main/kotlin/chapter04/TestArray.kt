
// 学习 数组

fun main() {
//    testArray01()
//    testArray02()
//    testArray03()
//    testArray04()
//    testArray05()
//    testArray06()
//    testArray07()
//    testArray08()
//    testArray09()
//    testArray10()
    testArray11()
}

val arr = arrayOf("C/C++", "Java", "Kotlin", "Python", "北京", "上海", "杭州", "从北京到杭州再到上海")
val numbers = arrayOf(0, -99, 99, 30, 78, 11)

fun testArray11() {
    // (11) 最大和最小： max 和 min
    println("numbers.minOrNull() = " + numbers.minOrNull())
    println("numbers.maxOrNull() = " + numbers.maxOrNull())
}

fun testArray10() {
    // (10) 筛选器： filter
    var numTemp = numbers.sliceArray(0..numbers.size - 1)
    println("numTemp.filter = " + numTemp.filter { it > 20 })
}

val nameString = { msg: String -> "我是：" + msg }
val printString = { msg: String -> println(msg) }

fun testArray09() {
    // (9) 数组变形： map -- 可以把一种数组转换成另一种类型
    var arrTemp = arr.sliceArray(0..arr.size - 1)
    arrTemp.map(printString)

    arrTemp = arr.sliceArray(0..arr.size - 1)
    println("\n\narrTemp.map = " + arrTemp.map(nameString))

    var numTemp = numbers.sliceArray(0..numbers.size - 1)
    println("\n\nnumTemp.map = " + numTemp.map { it -> "数字：${it}" })
}

fun testArray08() {
    // (8) 数组排序：sortedArray 和 sortedArrayDescending， 加强版排序：sortedBy 和 sortedByDescending
    var numTemp = numbers.sliceArray(0..numbers.size - 1)
    println(numTemp.sort())
    println("numTemp.sort = " + numTemp.joinToString())

    numTemp = numbers.sliceArray(0..numbers.size - 1)
    println("\nnumTemp.sortedArray = " + numTemp.sortedArray().joinToString())

    numTemp = numbers.sliceArray(0..numbers.size - 1)
    println("\nnumTemp.sortedArrayDescending = " + numTemp.sortedArrayDescending().joinToString())

    var arrTemp = arr.sliceArray(0..arr.size - 1)
    println("\n\narrTemp.sortedBy 11 = " + arrTemp.sortedBy { s -> s.length })
    println("arrTemp.sortedBy 22 = " + arrTemp.sortedBy { it.length })

    arrTemp = arr.sliceArray(0..arr.size - 1)
    println("\n\narrTemp.sortedByDescending 11 = " + arrTemp.sortedByDescending { s -> s.length })
    println("arrTemp.sortedByDescending 22 = " + arrTemp.sortedByDescending { it.length })
}

fun testArray07() {
    // (7) 反转数组：reverse
    var arrTemp = arr.sliceArray(0..arr.size - 1)
    println("arrTemp.reverse = " + arrTemp.reverse())
    println("arrTemp = " + arrTemp.joinToString())
    println("arr = " + arr.joinToString())

    arrTemp = arr.sliceArray(0..arr.size - 1)
    println("\n\narrTemp.reverse(x,y) = " + arrTemp.reverse(2, 5))
    println("arrTemp = " + arrTemp.joinToString())
    println("arr = " + arr.joinToString())

    arrTemp = arr.sliceArray(0..arr.size - 1)
    println("\n\narrTemp.reversed = " + arrTemp.reversed())
    println("arr = " + arr.joinToString())

    arrTemp = arr.sliceArray(0..arr.size - 1)
    println("\n\narrTemp.reversedArray = " + arrTemp.reversedArray().joinToString())
    println("arr = " + arr.joinToString())
}

fun testArray06() {
    // (6) 切割数组：sliceArray
    println("arr.sliceArray = " + arr.sliceArray(2..5).joinToString())
    println("arr = " + arr.joinToString())
}

fun testArray05() {
    // (5) 取出元素系列：take， takeLast 和 drop， dropLast
    println("arr.take = " + arr.take(3))
    println("arr.takeLast = " + arr.takeLast(3))
    println("arr.drop = " + arr.drop(3))
    println("arr.dropLast = " + arr.dropLast(3))

    println("arr.get(3) = " + arr.get(3))
    println("arr = " + arr.joinToString())
}

fun testArray04() {
    // (4) 把整个数组中的元素中间加逗号输出：joinToString， 当然也可以加以定制
    println(arr.joinToString())

    println(arr.joinToString { "选项：${it}" })
}

fun testArray03() {
    // (3) 查找模式： find
    println(arr.find { it.contains("o") })
    println(arr.findLast { it.contains("o") })
}

fun testArray02() {
    // (2) 丢弃元素系列：drop， dropWhile 和 dropLast， dropLastWhile
    var arrTemp = arr;
    println("arrTemp.drop = " + arrTemp.drop(3))
    println("arr = " + arr.joinToString())

    arrTemp = arr
    println("arr1.dropLast = " + arrTemp.dropLast(3))
    println("arr = " + arr.joinToString())

    arrTemp = arr
    println("arrTemp.dropWhile = " + (arrTemp.dropWhile { it == "C/C++" || it.contains("Java") }))
    println("arr = " + arr.joinToString())

    arrTemp = arr
    println("arrTemp.dropLastWhile = " + (arrTemp.dropLastWhile { it == "从北京到杭州再到上海" || it == "杭州" }))
    println("arr = " + arr.joinToString())
}

fun testArray01() {
    // (1) 检查包含是否某个元素: contains方法
    println(arr.contains("Kotlin"))
    println(arr.contains("上海"))
}
