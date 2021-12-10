// 学习嵌套类

package chapter06

class Big {
    var name: String = "big_name"
    val size: Int = 20

    fun showInfo() {
        println("Big() -- name = $name, size = $size")
    }

    class Small {
        val size: Int = 10
        val addr: String = "small_addr"
        fun showMsg() {
            // println("Small() -- name = $name, size = $size") // 编译报错
            println("Small() -- addr = $addr, size = $size")
        }
    }
}

fun testBig() {
    val big = Big()
    val small = Big.Small()
    big.showInfo()
    small.showMsg()

    println("name = ${big.name}")
    println("size = ${big.size}")
    // println("addr = ${big.addr}") // 编译报错
    println("addr = ${small.addr}")
    println("size = ${small.size}")
    // println("name = ${small.name}") // 编译报错, 是正确的，因为 Small() 类里面没有这个属性，而且也没有继承 Big() 类
}

class Big1 {
    var name: String = "big_name"
    val size: Int = 20

    fun showInfo() {
        println("Big1() -- name = $name, size = $size")
    }

    inner class Small {
        val size: Int = 10
        val addr: String = "small_addr"

        fun showMsg() {
            println("Small1() -- name = $name, size = $size") // 编译通过
            println("Small1() -- addr = $addr, size = $size")
        }
    }
}

fun testBig1() {
    val big = Big1()
    val small = Big1().Small()  // 创建对象时：通过 Big1 的对象 创建 Small 的对象
    big.showInfo()
    small.showMsg()

    println("testBig1() -- name = ${big.name}")
    println("testBig1() -- size = ${big.size}")
    // println("addr = ${big.addr}") // 编译报错
    println("testBig1() -- addr = ${small.addr}")
    println("testBig1() -- size = ${small.size}")
    // println("name = ${small.name}") // 编译报错, 是正确的，因为 Small() 类里面没有这个属性，而且也没有继承 Big() 类
}

class Big2 {
    var name: String = "big_name"
    val size: Int = 20

    fun getSizeInBig2_1() {
        println("getSizeInBig1 --- size = " + size)
    }

    fun getSizeInBig2_2() {
        println("getSizeInBig2 --- size = " + this.size)
    }

    fun getSizeInBig2_3() {
        println("getSizeInBig3 --- size = " + this@Big2.size)
    }

    fun getSizeInBig2_4() {
        //  println("getSizeInBig4 --- size = " + this@Small.size)  // 编译报错
    }

    inner class Small {
        val size: Int = 10
        val addr: String = "small_addr"

        fun printInSmall() {
            println("name = $name, addr = " + addr)
        }

        fun getSizeInSmall_1() {
            println("getSizeInSmall1() --- size = " + size)
        }

        fun getSizeInSmall_2() {
            println("getSizeInSmall2() --- size = " + this.size)
        }

        fun getSizeInSmall_3() {
            println("getSizeInSmall3() --- size = " + this@Big2.size)
        }

        fun getSizeInSmall_4() {
            println("getSizeInSmall4() --- size = " + this@Small.size)
        }
    }
}

fun testBig2() {
    val big = Big2()
    val small = Big2().Small()

    println("in big")
    big.getSizeInBig2_1()
    big.getSizeInBig2_2()
    big.getSizeInBig2_3()
    println("in small")
    small.printInSmall()
    small.getSizeInSmall_1()
    small.getSizeInSmall_2()
    small.getSizeInSmall_3()
    small.getSizeInSmall_4()
}

fun main(args: Array<String>) {

//    testBig()
//    testBig1()
    testBig2()
}
