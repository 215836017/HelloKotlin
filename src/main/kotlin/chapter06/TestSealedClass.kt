package chapter06

// 学习密封类

open class FruitForSealed {}

class AppleForSealed : FruitForSealed() {
    fun operate() = println("我是一个苹果")
}

class BananaForSealed : FruitForSealed() {
    fun operate() = println("我是一个香蕉")
}

class WaterMelonForSealed : FruitForSealed() {
    fun operate() = println("我是一块西瓜")
}

fun testFruitForSealed(fruit: FruitForSealed) {
    when (fruit) {
        is AppleForSealed -> fruit.operate()
        is BananaForSealed -> fruit.operate()
        is WaterMelonForSealed -> fruit.operate()
        else -> null
    }
}

sealed class FruitForSealed1 {
    class Apple : FruitForSealed1() {
        fun operate() = println("this is apple")
    }

    class Banana : FruitForSealed1() {
        fun operate() = println("this is banana")
    }

    class Pair : FruitForSealed1() {
        fun operate() = println("this is pair")
    }
}

fun testFruitForSealed01() {

    val fruit1 = FruitForSealed1.Apple()
    fruit1.operate()

    val fruit2 = FruitForSealed1.Banana()
    fruit2.operate()
}

fun testFruitOperate1(fruit: FruitForSealed1) = when (fruit) {
    is FruitForSealed1.Apple -> fruit.operate()
    is FruitForSealed1.Banana -> fruit.operate()
    is FruitForSealed1.Pair -> fruit.operate()
}

sealed class FruitForSealed2 {}

class AppleForSealed2 : FruitForSealed2() {
    fun operate() = println("我是一个 AppleForSealed2")
}

class BananaForSealed2 : FruitForSealed2() {
    fun operate() = println("我是一个 BananaForSealed2")
}

class WaterMelonForSealed2 : FruitForSealed2() {
    fun operate() = println("我是一块 WaterMelonForSealed2")
}

fun main() {

//    val f = BananaForSealed()
//    testFruitForSealed(f)

//    testFruitForSealed01()

    val f = FruitForSealed1.Pair()
    testFruitOperate1(f)
}