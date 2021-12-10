
// 学习 接口

fun main() {
    testChildInterface1()
}

class ChildInterface2 : CommonInterface3{
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var age: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override val width: Double
        get() = TODO("Not yet implemented")
    override val height: Double
        get() = TODO("Not yet implemented")

    fun getPros(){
        println("age1 = ${age1}, width1 = ${width1}")
    }
}
interface CommonInterface3 {
    var name: String
    var age: Int
    val width: Double
    val height: Double

    //var name1: String   // 声明 var 时，编译器直接报错。
    //    get() = "name1"
    val age1: Int
        get() = 10
    val width1: Double
        get() = 0.1
}

fun testChildInterface1() {
    var c1 = ChildInterface1()
    c1.printInfo()

}

class ChildInterface1 : CommonInterface1, CommonInterface2 {
    override fun add() {
        TODO("Not yet implemented")
    }

    override fun subtract() {
        TODO("Not yet implemented")
    }

    override fun printInfo() {
        TODO("Not yet implemented")
    }

    override fun getName() {
        super<CommonInterface1>.getName()
        super<CommonInterface2>.getName()
        super.printType("123")
    }

}

interface CommonInterface2 {
    fun printInfo()
    fun getName() {
        println("name is CommonInterface2")
    }
}

interface CommonInterface1 {
    fun add()
    fun subtract()

    fun printInfo() {
        println("the method-body is in the interface1")
    }

    fun getName() {
        println("name is CommonInterface1")
    }

    fun printType(msg: String) {
        println("interface -- CommonInterface1")
    }
}