package chapter06

import kotlin.reflect.KProperty

// 学习 委托

interface Shangji {
    fun getTask()
}

class Me(name: String) : Shangji {
    var name = name

    override fun getTask() {
        println("上级的任务给${name}, 但是要委托给别人")
    }
}

class AnotherOne(one: Shangji) : Shangji by one

fun testBy1() {
    var me = Me("xiaoMing")
    AnotherOne(me).getTask()
}

open class ByClass1 {
    open fun testByFun() {}
}

class ByClass2(name: String) : ByClass1() {
    override fun testByFun() {
        println("ByClass2 -- testByFun()")
    }
}

// 继承开放类的方法不能委托给另一个对象执行。
//class AnotherByClass(one:ByClass1):ByClass1 by one  // 编译器报错了


interface InterfaceBy2 {
    fun getTask()
}

class ByClass3(name: String) : InterfaceBy2 {
    var name = name

    override fun getTask() {
        println("ByClass3 -- getTask()  ")
    }
}

class ByClass4(one: InterfaceBy2) : InterfaceBy2 by one {
    override fun getTask() {
        println("ByClass4 -- getTask()  ")
    }
}

fun testBy2() {

    var byClass3 = ByClass3("xiaoMing")
    byClass3.getTask()

    ByClass4(byClass3).getTask()
}


class Oueself(mynameSX: String){
    var mynameSX: String = mynameSX
    var weituoSX: String by AnotherClass()
}

class AnotherClass{
    operator fun getValue(duiXiang: Any?, myShuxing: KProperty<*>): String{
        return " $duiXiang 委托了 ${myShuxing.name} 属性给 ${this@AnotherClass}"
    }

    operator fun setValue(duiXiang: Any?, myShuxing: KProperty<*>, value: String){
        println("$duiXiang 的 ${myShuxing.name} 属性被我赋值为 $value")
    }
}

fun testBy3() {
    val example = Oueself("xiaoHong")
    println("未被委托的属性： ${example.mynameSX}")
    println("被委托的属性： " + example.weituoSX)
    example.weituoSX = "abcdefg"
    println("被委托的属性： " + example.weituoSX)
}

fun main() {
//    testBy1()
//    testBy2()
    testBy3()
}