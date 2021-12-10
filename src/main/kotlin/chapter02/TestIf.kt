fun main(args: Array<String>) {

    var isLove = true

    if (isLove) {
        println("请深爱")
    } else {
        println("请走开")
    }

    println(if (isLove) "请深爱" else "请走开")


    var a = 9
    var b = 3
    var result = if (a > b) "a 大于 b" else b - a

    println("result: " + result)
}