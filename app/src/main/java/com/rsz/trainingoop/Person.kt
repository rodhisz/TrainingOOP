package com.rsz.trainingoop

/** 1 */
//menambah constructor ke class
class Person {

    //variable dalam class itu properties
    var age : Int = 0
    var address : String = ""
}

/** 2 */
//menambah constructor ke class
class Person2 (consName : String, consAge : Int, consAddress : String) {

    init {
        println("Nama Saya $consName")
        println("---------------")
    }

    //ini adalah properties
    var name : String = consName
    var age : Int = consAge
    var address : String = consAddress
}

fun main() {

    //variable dalam fun itu object atau instance
    val udin = Person()
    val udin2 = Person2("Udin", 20, "Jakarta")
    val tio = Person2("tio", 18, "Cirebon")

    val result = """
        Nama : ${udin2.name}
        Umur : ${udin2.age}
        Alamat : ${udin2.address}
    """.trimIndent()

    println(result)

    println("---------------")

    //manipulasi object
    udin2.age = 50

    println("Manipulasi object udin")

    val result2 = """
        Nama : ${udin2.name}
        Umur : ${udin2.age}
        Alamat : ${udin2.address}
    """.trimIndent()

    println(result2)

    println("---------------")

    val result3 = """
        Nama : ${tio.name}
        Umur : ${tio.age}
        Alamat : ${tio.address}
    """.trimIndent()

    println(result3)


}

/**
 * Parameter itu untuk fun
 * Constructor itu parameter untuk class
 * */