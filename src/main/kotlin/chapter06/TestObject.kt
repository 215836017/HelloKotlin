// 对象表达式和对象声明

open class One(age: Int) {
    var age: Int = age
}

class Two : One(age = 10) {
    fun newAddFun() {
        println("我是子类新加的成员")
    }
}

fun testObject_1() {
    var two = Two()
    println("age = ${two.age}")
    two.newAddFun()
}

fun testObject_2() {
    var oneObj = object : One(20) {
        fun newAddFun2() {
            println("我是匿名类新加的成员")
        }
    }

    println("age = ${oneObj.age}")
    oneObj.newAddFun2()
}

var oneObj2 = object : One(20) {
    fun newAddFun2() {
        println("我是匿名类新加的成员")
    }
}

interface ObjInterface {
    fun interfaceFun()
}

open class ObjClass2(age: Int) {
    open var age: Int = age;
    open fun classFun() {
        println("ObjClass2() -- start")
    }
}

fun testObject_3() {
    var newObjClass2 = object : ObjClass2(20), ObjInterface {
        override fun interfaceFun() {
            println("var newObjClass2 --- interfaceFun() start")
        }

        override var age: Int = 30
        override fun classFun() {
            println("var newObjClass2 --- classFun() -- age = $age")
        }
    }

    println("testObject_3() -- newObjClass2.age = ${newObjClass2.age}")
    newObjClass2.classFun()
    newObjClass2.interfaceFun()
}

fun testObject_4() {
    var newObjClass3 = object {
        var name: String = "newObjClass3--name"
        fun subClassFu() {
            println("newObjClass3 -- subClassFu() start")
        }
    }

    println("testObject_4() -- newObjClass3.name = ${newObjClass3.name}")
    newObjClass3.subClassFu()
}

open class ObjClass4(name: String, age: Int) {
    var age: Int = age
    open var name: String = name
    open fun classFunction() {
        println("method in class ObjClass4")
    }
}

object newObjClass4 : ObjClass4("newObjClass4-name", 20) {
    var myName: String = "添加新的属性"
    fun myFunction() {
        print("添加新的方法 \n")
    }

    override fun classFunction() {
        print("覆盖父类中的方法 \n")
    }
}

fun testObject_5() {
    println("可以直接通过名词访问newObjClass4： ${newObjClass4.myName}")
    newObjClass4.myFunction()
    newObjClass4.classFunction()
}

class ObjClassKid(name: String, age: Int) {
    var name: String = name
    var age: Int = age

    fun kidAct() {
        println("Kid.class -- kidAct()")
    }

    companion object hand {
        var size: Int = 1
        fun action() {
            println("Kid.class -- hand.object -- action() ")
        }
    }
}

fun testObject_6() {
    val kid = ObjClassKid("kid", 1)
    println("testObject_6() -- kid.name = ${kid.name}, kid.age = ${kid.age}")
    kid.kidAct()

    // kid.hand // 调用不到，编译器报错
    println("Kid.hand.size = ${ObjClassKid.hand.size}")
    ObjClassKid.hand.action()
}

class ObjClassKid1(name: String, age: Int) {
    var name: String = name
    var age: Int = age

    fun kidAct() {
        println("ObjClassKid1.class -- kidAct()")
    }

    companion object {  // 写起来是方便了，看代码却更费脑了，尤其是代码量很多后。
        var size: Int = 1
        fun action() {
            println("ObjClassKid1.class -- hand.object -- action() ")
        }
    }
}

fun testObject_7() {
    println("Kid.hand.size = ${ObjClassKid1.Companion.size}")
    ObjClassKid1.Companion.action()
}

class ObjClassKid2() {
    fun action() {
        println("ObjClassKid2.class -- action()")
    }

    companion object hand {  // 写起来是方便了，看代码却更费脑了，尤其是代码量很多后。
        var size: Int = 1
        fun action() {
            println("ObjClassKid2.class -- hand.object -- action() ")
        }
    }
}

fun testObject_8() {
    ObjClassKid2.action()
    ObjClassKid2.hand.action()

    var kid2 = ObjClassKid2()
    kid2.action()
}


interface InterfaceHand {
    fun grow()
}

class ObjClassKid3(name: String, age: Int) {
    var name: String = name
    var age: Int = age

    fun kidAct() {
        println("Kid.class -- kidAct()")
    }

    companion object hand : InterfaceHand {
        var size: Int = 1
        fun action() {
            println("Kid.class -- hand.object -- action() ")
        }

        override fun grow() {
            println("Kid.class -- hand.object -- override method grow() in hands")
        }
    }
}

fun testObject_9() {
    println("Kid.hand.size = ${ObjClassKid3.hand.size}")
    ObjClassKid3.hand.action()
    ObjClassKid3.hand.grow()
}

fun main(args: Array<String>) {

//    testObject_1()
//    testObject_2()
//    println("oneObj2.age = ${oneObj2.age}")
//    testObject_3()
//    testObject_4()
//    testObject_5()
//    testObject_6()
//    testObject_7()
//    testObject_8()
    testObject_9()
}
