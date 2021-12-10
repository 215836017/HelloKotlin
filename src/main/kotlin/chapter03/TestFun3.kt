
// 学习 函数

open class Particle()

class Electron : Particle()

open class Element(val name: String) {
    open fun Particle.react(name: String): Unit {
        println("$name 与粒子发生反应")
    }

    open fun Electron.react(name: String): Unit {
        println("$name 与电子发生反应生成同位素")
    }

    fun react(particle: Particle): Unit {
        particle.react(name)
    }
}

class NobleGas(name: String) : Element(name) {
    override fun Particle.react(name: String): Unit {
        println("$name 是稀有气体，不与粒子发生反应")
    }

    override fun Electron.react(name: String): Unit {
        println("$name 是稀有气体，不与电子发生反应")
    }

    fun react(particle: Electron): Unit {
        particle.react(name)
    }
}

fun main() {
//    val al = Element("铝")
//    al.react(Particle())
//    al.react(Electron())
//
//    val neon = NobleGas("氩")
//    neon.react(Particle())
//    neon.react(Electron())

    testInfix()

    val str1 = "北京" 到 ("上海")
    val str2 = "北京" 到 "上海"
    println(str1)
    println(str2)
}

fun testInfix() {
    val train = "北京" to "上海"
    println(train.first)
    println(train.second)
}

infix fun String.到(destination: String): String {
    return "这是从 -" + this + "- 开往 -" + destination + "- 的火车"
}