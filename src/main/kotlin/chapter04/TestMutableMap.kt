
// 学习 MutableMap

fun main() {
    testMMap01()
}

fun testMMap01() {
    val mMap1 = mutableMapOf<String, String>(
        Pair("key1", "value1"),
        Pair("key2", "value2"),
        Pair("k3", "V3"),
        Pair("k4", "V4")
    )

    val mMap2 = mutableMapOf<String, String>(
        Pair("keyA", "valueA"),
        Pair("keyB", "valueB")
    )
    val mMap3 = mutableMapOf<String, String>(
        Pair("keyC", "valueC"),
        Pair("keyD", "valueD")
    )
    print("添加键值对：")
    mMap1.put("k5", "V5")
    mMap1["k6"] = "V6"
    println(mMap1)

    print("添加其他的map，方法1：")
    mMap1.putAll(mMap2)
    println(mMap1)

    print("添加其他的map，方法2：")
    mMap1 += mMap3
    println(mMap1)

    print("移除键值对：")
    mMap1.remove("key2")
    println(mMap1)

    print("清空map：")
    mMap1.clear()
    println(mMap1)
}