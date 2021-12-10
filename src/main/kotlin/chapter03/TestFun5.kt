import java.nio.file.Files
import java.nio.file.Paths

// 学习 函数

fun main() {
//    testNoApply()

//    testWithApply()

//    println(myLet())

//    testWith()

//    testRun()

//    testRepeat()

//    testRequire(2)
//    testRequire(0)

//    var array = arrayOf(1, 3, 4, -9)
//    var array = arrayOf(1.1f, 3.001f, 4.1f, -9f)
//    var array = arrayOf(0x11, 0x22, 0x33, 0x44)
    var array = arrayOf(1.1, 2.2, 3.3, 4.4)
    println("${array.joinToString()}" + "中最大的值是 ${array.biggest()}")
}


fun testNoApply() {
    val task = Runnable { println("Runnable 在运行中...") }
    Thread(task).apply { isDaemon = true }.start()
}

fun testWithApply() {
    val task = Runnable { println("Runnable running...") }
    val thread = Thread(task)
    thread.isDaemon = true
    thread.start()
}

fun myLet(): Int {
    "myLet".let {
        println(it)
        return 100
    }
}

fun testWith() {
    with(ArrayList<String>()) {
        add("testWith aaaa")
        add("testWith bbbb")
        add("testWith 123")
        println("this = " + this)
    }.let { println(it) }
}

fun testRun() {
    ArrayList<String>().run {
        add("testRun aaaa")
        add("testRun bbbb")
        add("testRun 123")
        println("this = " + this.joinToString())
    }
}

fun testUse() {
    val input = Files.newInputStream(Paths.get("input.txt"))
    val byte = input.use { input.read() }
}

fun testRepeat() {
    repeat(5, { println("测试 repeat 语句") })
}

fun testRequire(x: Int) {
    require(x > 0, { "参数必须大于0" })
    println("testRequire -- x = " + x)
}

fun <T> sum(a: T, b: T, c: T): String {
    return "$a, $b, $c"
}

fun <T> Array<T>.biggest(): T where T : Number, T : Comparable<T> {
    var biggest = this[0]
    for (i in 1..lastIndex) {
        val e = this[i]
        if (e > biggest) {
            biggest = e
        }
    }
    return biggest
}