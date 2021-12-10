// 学习枚举类

class PuTongClass {
    var num: Int = 5
    val name = "puTongClass"
    fun getNum() {
        println("获取类里面的属性：$num")
        println("只能通过定义类的实例对象，才能调用类的方法")
    }
}

fun test1() {
    val puTongClass = PuTongClass()
    puTongClass.getNum()
    println("puTongClass.name =  ${puTongClass.name}")
}

enum class EnumClass {
    weekday1, weekday2, weekday3;

    fun printWeekday(): Unit {
        println("枚举类的常量(成员变量)可以直接调用类里的方法")
    }
}

fun test2() {
    EnumClass.weekday3.printWeekday()
    // var weekday2 = EnumClass()  // 虽然是类，但是不能创建对象
}

class Famililer(var rank: Int) {

}

fun test3() {
    var father = Famililer(1)
    var mother = Famililer(2)
    var son = Famililer(3)
    var daugther = Famililer(4)
    println("排行：父亲：${father.rank}, 母亲：${mother.rank}, 儿子：${son.rank}, 女儿：${daugther.rank}")
}


enum class Familier2(var rank: Int) {
    father(1), mother(2), son(3), daugther(4)

}

fun test4() {
    println(
        "使用枚举类 -- 排行：父亲：${Familier2.father.rank}, 母亲：${Familier2.mother.rank}, 儿子：${Familier2.son.rank}" +
                ", 女儿：${Familier2.daugther.rank}"
    )
}

fun test5() {
    var a: Int = Familier2.mother.compareTo(Familier2.son)
    println("前者先声明，则返回 $a")

    var b: Int = Familier2.daugther.compareTo(Familier2.son)
    println("前者后声明，则返回 $b")

    var c: Int = Familier2.son.compareTo(Familier2.son)
    println("两者相同， 则返回 $c")

    var d: Int = Familier2.father.ordinal
    var e: Int = Familier2.daugther.ordinal
    println("ordinal() 函数的值 d = $d, e = $e")
}

fun test6() {
    var myClass = Familier2.son.declaringClass
    println("通过调用 declaringClass 函数获得枚举类：${myClass.name}")
}

data class Leaf1(var size: String, var color: String, var shape: String, var vein: Int)

fun test7() {
    var str1: String = Familier2.son.name
    println("枚举类的 name 函数， str1 = " + str1)

    var str2: String = Familier2.son.toString()
    println("枚举类的 toString 函数， str2 = " + str2)

    var leaf = Leaf1("20", "yellow", "circle", 30)
    println("数据类的 toString 函数：" + leaf.toString())
}

enum class Familier3(var rank: Int) {
    father(1), mother(2), son(3), daugther(4);

    override fun toString(): String {
        return "成员名称：" + this.name + "，成员排名：" + rank
    }
}

fun test8() {
    println("father =  ${Familier3.father}, monther = ${Familier3.mother}")
    println("toString() -- father = " + Familier3.father.toString() + ", monther " + Familier3.mother.toString())
    println("name() -- father = " + Familier3.father.name + ", monther " + Familier3.mother.name)
}

fun test9() {
    var lists: Array<Familier3> = Familier3.values()
    println("家庭成员：" + lists.size)

    for (list in lists) {
        println(list)
    }
}

fun test10() {
    var father = Familier3.valueOf("father")
    var mother = Familier3.valueOf("mother")
    var son = Familier3.valueOf("son")
    var daughter = Familier3.valueOf("daugther")

    var fatherMsg: String? = father.toString()
    var motherMsg: String? = mother.toString()
    var sonMsg: String? = son.toString()
    var daughterMsg: String? = daughter.toString()

    println("$fatherMsg \n$motherMsg \n$sonMsg \n$daughterMsg")
}

enum class Familier4(var rank: Int) {
    father(1), mother(2), son(3), daugther(4);

    override fun toString(): String {
        return "成员名称：" + this.name + "，成员排名：" + rank
    }

    fun favoriteFood(): Unit {
        when (this.name) {
            "father" -> println("father like apple")
            "mother" -> println("mother like banana")
            "son" -> println("son like watermelon")
            "daugther" -> println("daughter like peach")
            else -> println("Familier do not have this person")
        }
    }

    fun action() {
        println("wo all like sports")
    }
}

fun test11() {
    print("${Familier4.father.toString()} ")
    Familier4.father.favoriteFood()

    print("${Familier4.mother.toString()} ")
    Familier4.mother.favoriteFood()

    print("${Familier4.son.toString()} ")
    Familier4.son.favoriteFood()

    print("${Familier4.daugther.toString()} ")
    Familier4.daugther.favoriteFood()

    Familier4.mother.action()
    Familier4.daugther.action()
}

//class SubEnumClass : EnumClass(){}  // 编译报错
//
//enum class  SubEnumClass1: EnumClass(){} // 编译报错
//
//enum class  SubEnumClass2: Famililer(){} // 编译报错


interface OurFamily {
    fun getNumOfRank(): Int
    fun favoriteFood(): Unit

}

enum class Familier5() : OurFamily {
    father, mother, son;

    override fun getNumOfRank(): Int {
        return 2
    }

    override fun favoriteFood() {
        when (this.name) {
            "father" -> println("father like apple")
            "mother" -> println("mother like banana")
            "son" -> println("son like watermelon")
            else -> println("Familier do not have this person")
        }
    }
}

enum class Familier6(var rank: Int) : OurFamily {
    father(1), mother(2), son(3), daughter(4);

    override fun toString(): String {
        return "成员名称：" + this.name + "，成员排名：" + rank
    }

    override fun favoriteFood() {
        when (this.name) {
            "father" -> println("father like apple")
            "mother" -> println("mother like banana")
            "son" -> println("son like watermelon")
            "daugther" -> println("daughter like peach")
            else -> println("Familier do not have this person")
        }
    }

    fun action() {
        println("wo all like sports")
    }

    override fun getNumOfRank(): Int {
        return 1
    }
}

fun test12() {
    println("家庭1信息：家庭排名：${Familier5.father.getNumOfRank()}")
    print("${Familier5.father.name}  ")
    Familier5.father.favoriteFood()
    print("${Familier5.mother.name}  ")
    Familier5.mother.favoriteFood()
    print("${Familier5.son.name}  ")
    Familier5.son.favoriteFood()

    println("家庭2信息： 家庭排名： ${Familier6.daughter.getNumOfRank()}")
    print("${Familier6.father.toString()}  ")
    Familier6.father.favoriteFood()
    print("${Familier6.mother.toString()}  ")
    Familier6.mother.favoriteFood()
    print("${Familier6.son.toString()}  ")
    Familier6.son.favoriteFood()
    print("${Familier6.daughter.toString()}  ")
    Familier6.daughter.favoriteFood()

    print("家庭2共同爱好：")
    Familier6.daughter.action()
}

fun main(args: Array<String>) {

//    test1()
//
//    test2()
//
//    test3()
//
//    test4()
//
//    test5()
//
//    test6()
//
//    test7()
//
//    test8()
//
//    test9()
//
//    test10()
//
//    test11()
//
    test12()
}


