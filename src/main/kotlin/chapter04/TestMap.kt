
// 学习 Map

fun main() {
//    testMap01()
//    testMap02()
//    testMap03()
    testMap04()
}

fun testMap04() {
    val map3 = mapOf<String, String>(
        Pair("key1", "value1"),
        Pair("key2", "value2"),
        Pair("k3", "V3"),
        Pair("k4", "V4")
    )

    println(map3.toSortedMap())

    print("map3.toList() = ")
    println(map3.toList())

    print("map3.toMutableMap() = ")
    println(map3.toMutableMap())
}

fun testMap03() {
    val map3 = mapOf<String, String>(
        Pair("key1", "value1"),
        Pair("key2", "value2"),
        Pair("k3", "V3"),
        Pair("k4", "V4")
    )

    println(map3.map { "键：" + it.key + "-值：" + it.value })
    println(map3.mapKeys { "键：" + it.key })
    println(map3.mapValues { "值：" + it.value })

    print("最大值依据：")
    println(map3.maxByOrNull { it.value.length })
    print("最小值依据：")
    println(map3.minByOrNull { it.value.length })
}

fun testMap02() {
    // 筛选
    val map2 = mapOf<String, String>(
        Pair("key1", "value1"),
        Pair("key2", "value2"),
        Pair("k3", "V3"),
        Pair("k4", "V4")
    )
    print("map2.filter: ")
    println(map2.filter { it.value.contains("value2") })

    print("map2.filterKeys: ")
    println(map2.filterKeys { it.contains("key2") })

    print("map2.filterValues: ")
    println(map2.filterValues { it.contains("key2") })

    print("map2.filterNot: ")
    println(map2.filterNot { it.value.contains("V") })
}

fun testMap01() {
    val map1 = mapOf<String, String>(
        Pair("key1", "value1"),
        Pair("key2", "value2"),
        Pair("key3", "value3"),
        Pair("key4", "value4")
    )

    println(map1["key3"])
    println(map1.get("key2"))
    println(map1.getOrDefault("key6", "defaultValue"))

    println(map1.keys)
    println(map1.values)
    println(map1.entries)

    println(map1.containsKey("key3"))
    println(map1.containsValue("value5"))
}