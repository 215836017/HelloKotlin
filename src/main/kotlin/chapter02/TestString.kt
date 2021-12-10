
// 学习 String

fun main() {

//    testString_01()

//    testString_02()

//    testString_03()

    testString_04()
}

fun testString_04() {
    val me = '我'
    val five = '5'

    println(me.isLetter())  // 是否是文字
    println(five.isDigit()) // 是否是数字

    println(five - 1)  // 字符的上一个
    println(five + 1) // 字符的下一个
    println(me + 1)
    println(me - 1)

    // 获取字符的编码
    println("获取字符的编码: " + me.toInt())

    // 两个字符的区间
    println("两个字符的区间")
    println(me.until('你'))
    println(me.until('他'))
}

fun testString_03() {
    var str = """
        第一行内容: "双引号里面的内容"
        第二行内容: 'a', 'b' 
        第三行内容: \n, /t
    """
    println(str)
}


fun testString_02() {
    var str = "学习Kotlin，Kotlin是一门比较新的编程语言。hello world, hello kotlin"
    var str2 = "学习Kotlin，Kotlin是一门比较新的编程语言。hello world, hello kotlin"
    var str3 = "学习Kotlin，Kotlin是一门比较新的编程语言。hello world"

    // 获得指定位置的字符
    println("获得指定位置的字符")
    println(str.get(3))
    println(str[3])
    println(str.elementAt(3))

    // 截取一段字符串
    println("截取一段字符串")
    println(str.substring(5))
    println(str.substring(3, 8))

    // 使用索引
    println("使用索引")
    println(str.indexOf("K"))
    println(str.indexOf('K'))
    println(str.substring(str.indexOf("一")))
    println(str.substring(str.indexOf("一"), str.length - 3))
    println("str.indices = " + str.indices)

    // 是否包含某个字符或字符串：contains
    println("是否包含某个字符或字符串")
    println(str.contains('K'))
    println(str.contains("hello"))

    // 判断两个字符串的内容是否相同
    println("判断两个字符串的内容是否相同")
    println("str == str2: " + (str == str2))
    println("str.contentEquals(str2): " + str.contentEquals(str2))
    println("str == str3: " + (str == str3))
    println("str.contentEquals(str3): " + str.contentEquals(str3))

    // 舍弃子字符串
    println("舍弃子字符串")
    println("舍弃前6个字符：" + str2.drop(6))
    println("舍弃后7个字符：" + str3.dropLast(7))
    var str4 = "   两头有空格 的 字 符 串 -- 哈 哈 哈  "
    var str5 = str4
    val st6 = str5.dropWhile { it.isWhitespace() }
    println("去掉前面的空格： " + st6)
    // 去掉前面的空格，并把字符串从尾部开始所有含有“哈”或空格的字符串去掉
    var str7 = str4;
    val str8 = str7.dropWhile { it.isWhitespace() }.dropLastWhile { it == '哈' || it.isWhitespace() }
    println("去掉空格和 哈 的结果：" + str8)

    // 获取子字符串
    println("获取子字符串： take")
    println("str.take(7) = " + str.take(7))  // 获取前面7个
    println("str.takeLast(7) = " + str.takeLast(7)) // 获取后面7个

    // 替换功能
    println("替换功能")
    var str9 = str
    var str9_1 = str9.replace("hello", "你好")
    var str10 = str;
    var str10_1 = str10.replace('h', 'H')
    println("替换 hello 的结果：" + str9_1)
    println("替换 h 的结果：" + str10_1)
    /*
    替换有跟多细致的方法，比如把所有的数字/字母替换掉，替换限定在某段范围内，替换限定在某个字符/字符串的前/后面
    只替换第一次或最后一次出现的字符等。
     */
}

fun testString_01() {
    var str = "学习Kotlin"
    println(str.isEmpty())
    println(str.count())
    println(str.length)
}