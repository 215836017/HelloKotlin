package chapter08

// 学习 操作符重载

class OperatePerson(name: String, age: Int) {
    val name = name
    val age = age
}

//operator fun OperatePerson.unaryPlus() = OperatePerson(this.name, this.age + 1)
operator fun OperatePerson.unaryPlus() = OperatePerson(this.name, this.age + 3)
operator fun OperatePerson.unaryMinus() = OperatePerson(this.name, this.age - 3)

fun testOperate1() {
    val p = OperatePerson("xiaoMing", 20)
    println((+p).age)

    val p1 = OperatePerson("xiaoMing", 20)
    println((-p1).age)
}

class OperatePerson1(name: String, age: Int) : Comparable<OperatePerson1> {
    val name = name
    val age = age

    override fun compareTo(other: OperatePerson1): Int {
        return if (this.age > other.age) {
            1
        } else if (this.age < other.age) {
            -1
        } else {
            0
        }
    }
}

fun testOperate2() {
    val p1 = OperatePerson1("xiaoMing", 20)
    val p2 = OperatePerson1("xiaoHong", 21)

    if (p1 > p2) {
        println("${p1.name}  年龄大于 ${p2.name}")

    } else if (p1 < p2) {
        println("${p1.name}  年龄小于于 ${p2.name}")
    } else {
        println("${p1.name}  年龄和 ${p2.name} 相等")
    }
}

fun main() {
//    testOperate1()
    testOperate2()
}