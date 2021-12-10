package chapter06

// 学习 委托中的 map

fun testPuTongMap1() {
    val oneMap: Map<String, String> = mapOf<String, String>(
        "key1" to "value1",
        "key2" to "value2",
        "key3" to "value3"
    )

    println("start print oneMap")
    println("key1 = ${oneMap.get("key1")}")
    println("key2 = ${oneMap["key2"]}")
    println("key3 = ${oneMap["key3"]}")
}


class MapObject(val map: Map<String, String>) {
    val key1: String by map
    val key2: String by map
    val key3: String by map
}

fun testMapObject1() {
    val oneMap = MapObject(
        mapOf(
            "key1" to "value1",
            "key2" to "value2",
            "key3" to "value3"
        )
    )

    println("start print oneMap")
    println("testMapObject1() -- key1 = ${oneMap.key1}")
    println("testMapObject1() -- key2 = ${oneMap.key2}")
    println("testMapObject1() -- key3 = ${oneMap.key3}")
}

class MapObject2(val map: MutableMap<String, String>) {
    val key1: String by map
    val key2: String by map
    val key3: String by map
}

fun testMapObject2() {
    var map: MutableMap<String, String> = mutableMapOf<String, String>(
        "key1" to "value1",
        "key2" to "value2",
        "key3" to "value3"
    )
    val oneMap = MapObject2(map)

    println("start print oneMap")
    println("testMapObject2() -- key1 = ${oneMap.key1}")
    println("testMapObject2() -- key2 = ${oneMap.key2}")
    println("testMapObject2() -- key3 = ${oneMap.key3}")

    println("修改 oneMap 之后：")
    map.put("key1", "v1")
    map.put("key2", "v2")
    map.put("key3", "v3")
    println("testMapObject2() -- key1 = ${oneMap.key1}")
    println("testMapObject2() -- key2 = ${oneMap.key2}")
    println("testMapObject2() -- key3 = ${oneMap.key3}")

}

fun main() {
//    testPuTongMap1()
//    testMapObject1()
    testMapObject2()
}