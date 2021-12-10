package chapter06

// 学习 Kotlin 中的数据类

data class Leaf(val size: String, val color: String, val shape: String, val vein: Int)

fun testLeaf01() {
    val myLeaf = Leaf("30", "green", "circle", 56)
    // 第一种方式
    val mySize = myLeaf.size
    val myColor = myLeaf.color
    val myShape = myLeaf.shape
    val myVein = myLeaf.vein

    println("mySize = $mySize, myColor = $myColor, myShape = $myShape, meVein = $myVein")
}

fun testLeaf02() {
    val myLeaf = Leaf("30", "green", "circle", 56)

    // 第二种方式：用到了 componentN 函数群
    val (size1, color1, shape1, vein1) = myLeaf
    println("size1 = $size1, color1 = $color1, shape1 = $shape1, vein1 = $vein1")
}

fun testLeaf03() {
    val myLeaf = Leaf("30", "green", "circle", 56)
    val size = myLeaf.component1()
    val color = myLeaf.component2()
    val shape = myLeaf.component3()
    val vein = myLeaf.component4()
    println("size3 = $size, color3 = $color, shape3 = $shape, vein3 = $vein")
}

fun testLeaf04() {
    val myLeaf1 = Leaf("30", "green", "circle", 56)
    val myLeaf2 = myLeaf1.copy(size = "40")
    val myLeaf3 = myLeaf1.copy(color = "yellow")
    val myLeaf4 = myLeaf1.copy(vein = 40)
    println("myLeaf1: $myLeaf1")
    println("myLeaf2: $myLeaf2")
    println("myLeaf3: $myLeaf3")
    println("myLeaf4: $myLeaf4")
}

fun testLeaf05() {
    val myLeaf = Leaf("30", "green", "circle", 56)
    println("myLeaf = ${myLeaf.toString()}")
}

data class Leaf2(val size: String, val color: String, val shape: String, val vein: Int) {
    override fun toString(): String {
        var result = "size:${size} -- color:${color} -- shape:${shape} -- vein:${vein}"
        return result
    }
}

fun testLeaf06() {
    val myLeaf2 = Leaf2("30", "green", "circle", 56)
    println("myLeaf2 = ${myLeaf2.toString()}")
}

fun main(args: Array<String>) {
//    testLeaf01()
//    testLeaf02()
//    testLeaf03()
//    testLeaf04()
//    testLeaf05()
    testLeaf06()
}

