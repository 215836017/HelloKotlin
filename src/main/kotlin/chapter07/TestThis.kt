package chapter07

class ThisPerson(name: String, age: Int) {
    val name: String = name
    val age: Int = age

    fun printPersonInfo() {
        println("ThisPerson -- printPersonInfo() -- name = ${this.name}, age = ${this.age}")
    }

    inner class ThisStudent(id: String) {
        val studentId = id
        val studentInfo: String
            get() = "id = ${this.studentId}, name = ${name}, age = ${age} "
    }
}

fun testThis() {
    val p = ThisPerson("person", 30)
    val s = p.ThisStudent("id-01")
    p.printPersonInfo()
    println(s.studentInfo)
}

class ThisPerson1(name: String, age: Int) {
    val name: String = name
    val age: Int = age

    fun printPersonInfo() {
        println("ThisPerson1 -- printPersonInfo() -- name = ${this.name}, age = ${this.age}")
    }

    inner class ThisStudent1(id: String, name: String, age: Int) {
        val studentId = id
        val name = name
        val age = age
        val studentInfo: String
            get() = "id = ${this.studentId}, name = ${name}, age = ${age} "
    }
}

fun testThis1() {
    val p1 = ThisPerson1("person", 30)
    val s1 = p1.ThisStudent1("id-01", "student", 18)
    p1.printPersonInfo()
    println(s1.studentInfo)
}

class ThisPerson2(name: String, age: Int) {
    val name: String = name
    val age: Int = age

    fun printPersonInfo() {
        println("ThisPerson2 -- printPersonInfo() -- name = ${this.name}, age = ${this.age}")
    }

    inner class ThisStudent2(id: String, name: String, age: Int) {
        val studentId = id
        val name = name
        val age = age
        val studentInfo: String
            get() = "id = ${this.studentId}, name = ${this.name}, age = ${this.age} "
    }
}

fun testThis2() {
    val p2 = ThisPerson2("person", 30)
    val s2 = p2.ThisStudent2("id-02", "student", 18)
    p2.printPersonInfo()
    println(s2.studentInfo)
}

class ThisPerson3(name: String, age: Int) {
    val name: String = name
    val age: Int = age

    fun printPersonInfo() {
        println("ThisPerson3 -- printPersonInfo() -- name = ${this.name}, age = ${this.age}")
    }

    inner class ThisStudent3(id: String, name: String, age: Int) {
        val studentId = id
        val name = name
        val age = age
        val studentInfo: String
            get() = "id = ${this.studentId}, name = ${this@ThisPerson3.name}, age = ${this@ThisPerson3.age} "
    }
}

fun testThis3() {
    val p3 = ThisPerson3("person", 30)
    val s3 = p3.ThisStudent3("id-02", "student", 18)
    p3.printPersonInfo()
    println(s3.studentInfo)
}


class ThisPerson4(name: String, age: Int) {
    val name: String = name
    val age: Int = age

    fun printPersonInfo() {
        println("ThisPerson4 -- printPersonInfo() -- name = ${this.name}, age = ${this.age}")
    }

    inner class ThisStudent4(id: String, name: String, p: ThisPerson4) {
        val studentId = id
        val name = name
        val person = p

        val studentInfo: String
            get() = "id = ${this.studentId}, name = ${name}, age = ${age} "

        fun ThisPerson4.sayHello() = println("hello, I'm ThisPerson4, name = ${this.name}")

        fun letPersonSayHello() {
            person.sayHello()
        }
    }
}

fun testThis4() {
    val p4 = ThisPerson4("person", 30)
    val s4 = p4.ThisStudent4("id-02", "student", p4)
    p4.printPersonInfo()
    println(s4.studentInfo)
    s4.letPersonSayHello()
}

class ThisPerson5(name: String, age: Int) {
    val name: String = name
    val age: Int = age

    fun printPersonInfo() {
        println("ThisPerson5 -- printPersonInfo() -- name = ${this.name}, age = ${this.age}")
    }

    inner class ThisStudent5(id: String, name: String) {
        val studentId = id
        val name = name

        val studentInfo: String
            get() = "id = ${this.studentId}, name = ${name}, age = ${age} "

        val nameAddingStr: (String) -> String = { str -> this.name + str }
    }
}

fun testThis5() {
    val p5 = ThisPerson5("person", 30)
    val s5 = p5.ThisStudent5("id-02", "student")
    p5.printPersonInfo()
    println(s5.studentInfo)
    println(s5.nameAddingStr("-s5"))
}

fun main() {
//    testThis()
//    testThis1()
//    testThis2()
//    testThis3()
//    testThis4()
    testThis5()
}