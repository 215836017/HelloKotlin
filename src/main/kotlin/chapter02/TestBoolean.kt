
// 学习 Boolean 类型

fun main(args: Array<String>) {
    var vip = false
    println("vip = ${vip}")

    var isRed: Boolean
//    println("isRed = ${isRed}")  // 编译器报错，必须先要初始化

    isRed = true
    if (isRed) {
        println("通过了， 欢迎")
    } else {
        println("很遗憾，不合格。")
    }

    testB01()

}

fun testB01(){
    var addr: String? = "浙江省杭州市淘宝街"  // 不买东西时，地址可有可无
    var sex: Boolean?  // 不管买不买，性别都可以不用填写

    sex = false
    if(sex != null){
        if(sex == true){

        }
    }else{

    }
}