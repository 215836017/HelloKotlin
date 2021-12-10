package chapter06

// 学习 委托中的 lazy

//val LazyShuXing:String by lazy {
//    println("表达式")
//    "结果1"
//}

val LazyShuXing:String by lazy {
    println("表达式")
    "结果1"
    "结果2"
    "结果3"
    "结果4"
}

fun testLazy01(){
    var i = 1
    while ( i < 5){
        i ++
        println("call shuXing -- start")
        print("$LazyShuXing \n")
        println("call shuXing -- end")
    }
}

fun main() {
    testLazy01()
}