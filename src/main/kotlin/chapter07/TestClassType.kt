package chapter07

// 学习 类型转换

open class TypePerson(name: String, age: Int) {
    val name = name
    val age = age
    fun printPersonInfo() {
        println("printPersonInfo() -- name = $name, age = $age")
    }
}

class TypeStudent(name: String, age: Int, grade: Double) : TypePerson(name, age) {
    val grade = grade
    fun printStudentInfo() {
        println("printStudentInfo() -- name = $name, age = $age, grade = $grade")
    }
}

class TypeWorker(name: String, age: Int, salary: Double) : TypePerson(name, age) {
    val salary = salary
    fun printWorkerInfo() {
        println("printWorkerInfo() -- name = $name, age = $age, grade = $salary")
    }
}

fun testType1(p: TypePerson) {
    if (p is TypePerson) {
        p.printPersonInfo()
    } else if (p is TypeStudent) {
        p.printStudentInfo()
    } else if (p is TypeWorker) {
        p.printWorkerInfo()
    }
}

fun testType2(p: TypePerson) {
    if (p is TypeWorker) {
        p.printWorkerInfo()
    } else if (p is TypeStudent) {
        p.printStudentInfo()
    } else if (p is TypePerson) {
        p.printPersonInfo()
    }
}


fun testType3() {
    var w: TypePerson = TypeWorker("worker", 45, 300.0)
    val w1 = w as TypeWorker
    w1.printWorkerInfo()
}

fun testType4() {
    val s: String = ""
    val s1 = s as TypeStudent
    s1.printStudentInfo() //  java.lang.ClassCastException: class java.lang.String cannot be cast to class chapter07.TypeStudent
}

fun testType5() {
    val w: TypeWorker? = TypeWorker("xiaoMing", 30, 400.0)
    val w1 = w as TypeWorker
    w1.printWorkerInfo()
}

fun testType6() {
    val w: TypeWorker? = null
    val w1 = w as TypeWorker
    w1.printWorkerInfo() // java.lang.NullPointerException: null cannot be cast to non-null type chapter07.TypeWorker
}

fun testType7() {
    val w: TypeWorker? = null
    val w1: TypeWorker? = w
    w1?.printWorkerInfo()
}

fun main() {
//    var p1 = TypePerson("person", 20)
//    var p2 = TypeStudent("student", 20, 80.8)
//    var p3 = TypeWorker("worker", 30, 6000.0)
//    testType1(p1)
//    testType1(p2)
//    testType1(p3)
//    testType2(p1)
//    testType2(p2)
//    testType2(p3)

//    testType3()
//    testType4()
//    testType5()
//    testType6()
    testType7()

}