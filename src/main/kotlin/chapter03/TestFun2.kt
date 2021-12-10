
// 学习 函数

fun main() {
//    testOperator()

//    testOperator2()

//    testOperator3()

    testOperator4()
}

class MyNumber(var k: Int) {
    private fun Int.triple() = this * this * this  // Int.triple() 只能在MyNumber类之内生效，之外是无法使用的

    fun addFactor(p: Int) {
        k += p.triple()
    }
}

class Student(val age: Int) {
    operator fun compareTo(other: Student): Int {
        return when {
            age > other.age -> 1
            age < other.age -> -1
            else -> 0
        }
    }
}

fun testOperator4() {
    val s1 = Student(15)
    val s2 = Student(14)
    val s3 = Student(15)
    println("testOperator4 -------- 2222")
    println(s1 < s2)
    println(s1 <= s2)
    println(s1 == s2)  // 这里是在判断两个对象的地址是否相等
    println(s1 > s2)
    println(s1 >= s2)

    println("testOperator4 -------- 3333")
    println(s1 < s3)
    println(s1 <= s3)
    println(s1 == s3) // 这里是在判断两个对象的地址是否相等
    println(s1 > s3)
    println(s1 >= s3)
}

object MinValue {
    operator fun invoke(a: Int, b: Int) = if (a > b) a else b
    operator fun invoke(x: Int, y: Int, z: Int) = invoke(invoke(x, y), z)
}

fun testOperator3() {
    println(MinValue(30, 20))
    println(MinValue(1, 2, 3))
}

class Matrix(var a: Int, var b: Int, var c: Int, var d: Int) {
    operator fun plus(m: Matrix): Matrix {
        return Matrix(a + m.a, b + m.b, c + m.c, d + m.d)
    }

    operator fun get(horizontal: Int, vertical: Int): Int {
        val point = Pair(horizontal, vertical)
        when (point) {
            Pair(0, 0) -> return a
            Pair(0, 1) -> return b
            Pair(1, 0) -> return c
            Pair(1, 1) -> return d
            else -> return 0
        }
    }

    operator fun set(horizontal: Int, vertical: Int, value: Int) {
        val point = Pair(horizontal, vertical)
        when (point) {
            Pair(0, 0) -> this.a = value
            Pair(0, 1) -> this.b = value
            Pair(1, 0) -> this.c = value
            Pair(1, 1) -> this.d = value
            else -> {
                return
            }
        }
    }
}

fun testOperator2() {
    val m = Matrix(8, 8, 8, 8)
    println("m[0, 0] = " + m[0, 0])

    m[0, 1] = 10
    println("m.b = " + m.b)
}

fun testOperator() {
    val m = Matrix(1, 2, 3, 4)
    val n = Matrix(8, 8, 8, 8)
    val mn1 = m.plus(n)
    val mn2 = m + n // 操作符重载了，m.plus(n) 等价于 m +n

    println("mn1 = " + mn1.a)
    println("mn2 = " + mn2.a)
}

