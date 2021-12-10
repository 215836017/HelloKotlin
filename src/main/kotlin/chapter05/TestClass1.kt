import java.io.FileReader

class Friend {
    // var name = ""
    // var name: String  //错误的写法
    var name: String = ""

    var age: Int = 0
    var sex: Boolean = false

    fun sayHello() {
        println("Hello, I'm ${name}")
    }
}

class Friend2(name: String, age: Int) {
    init {
        println("name: $name , age = $age")
    }

    var name: String = ""
    var age: Int = 0
}


//class Friend3(name: String, age: Int) {
//    var name: String = name
//    var age: Int = age
//
//    init {
//        println("name: $name , age = $age")
//    }
//
//    constructor(name: String, age: Int) {
//        this.name = name
//        this.age = age
//    }
//}

class Friend4 {
    var name: String = "null"
    var age: Int = 0

    init {
        println("name: $name , age = $age")
    }

    // 次构造函数
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}


class Friend5(name: String, age: Int) {
    var friend: Friend5? = null

    init {
        println("name = ${name}, age = ${age}")
    }

    constructor(name: String, age: Int, friend: Friend5) : this(name, age) {
        friend.friend = this
    }
}

class Person(name: String, age: Int) {

    val name: String = name
    val age: Int = age
    var parents = mutableListOf<Person>()
    var children = mutableListOf<Person>()

    // 次构造函数
    constructor(name: String, age: Int, parents: MutableList<Person>, children: MutableList<Person>) : this(name, age) {
        parents.forEach { it.children.add(this) }
        children.forEach { it.parents.add(this) }
        this.parents.addAll(parents)
        this.children.addAll(children)
    }

    fun showPersonInfo() = println("name = ${this.name}, age = ${this.age}")

    fun showChildrenInfo() = children.forEach { it.showPersonInfo() }

    fun showParentInfo() = parents.forEach { it.showPersonInfo() }
}

fun main() {
//    var friend = Friend()
//
//    println(friend.name)
//    println(friend.age)
//    println(friend.sex)
//
//    friend.sayHello()

//    val friend2 = Friend2("xiaoMing", 20)


//    val friend4 = Friend4("xiaoMing", 30)

//    var friend5_1 = Friend5("xiaoMing", 51)
//    var friend5_2 = Friend5("xiaoQiang", 52, friend5_1)


    val baby1 = Person("baby1", 3)
    val baby2 = Person("baby2", 4)
    val parent1 = Person("parent1", 40)
    val parent2 = Person("parent2", 50)
    val child1 = Person("child1", 20, mutableListOf(parent1, parent2), mutableListOf(baby1, baby2))

    baby1.showPersonInfo()

    parent1.showPersonInfo()
    parent1.showChildrenInfo()

    child1.showPersonInfo()
    child1.showChildrenInfo()
    child1.showParentInfo()
}