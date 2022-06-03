package com.rsz.trainingoop

/**
 * extensions fun
 */

class Student(val nameConst : String) {
    fun intro() : String {
        return "ini fun didalam class"
    }
}

//pakai this buat akses properties atau fun di dalam class extensionsnya
//ini extensions function
fun Student.sayHello(name : String) {
    println("Hello, my name is ${this.nameConst} and I am saying hello to $name dan ${this.intro()}" )
}

//selain functions, properties juga bisa dijadika extensions
//ini extensions properties
val Student.convertUppercaseName : String
get() = this.nameConst.uppercase()


fun main() {
    val student = Student("Tio")
    student.sayHello("Kotlin")

    println(student.convertUppercaseName)
}