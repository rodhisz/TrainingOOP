package com.rsz.trainingoop

abstract class Animal () {
    //ini abstract properties
    abstract val name : String
    //ini abstract function
    abstract fun run() : Unit
}

class Cat() : Animal(){
    override val name: String
        get() = "Miko"

    override fun run() {
        println("ayo $name lari!")
    }
}

/**
 * -----------------------------------
 */

abstract class Karyawan () {
    abstract val namaKaryawan : String
    abstract val jobKaryawan : String
    abstract fun sayHello() : String
    abstract fun sayGoodBye() : String

}

class Software(override val namaKaryawan: String, override val jobKaryawan: String, val umur : Int) : Karyawan(){

    override fun sayHello(): String {
        return "Halo semuanya saya $namaKaryawan, umur saya $umur dan saya adalah seorang $jobKaryawan"
    }

    override fun sayGoodBye(): String {
        return "Saya $namaKaryawan, pekerjaan saya $jobKaryawan, izin pamit"
    }
}

class Hardware(override val namaKaryawan: String, override val jobKaryawan: String) : Karyawan(){

    override fun sayHello(): String {
        return "Halo semuanya saya $namaKaryawan, saya adalah seorang $jobKaryawan"
    }

    override fun sayGoodBye(): String {
        return "Saya $namaKaryawan, pekerjaan saya $jobKaryawan, izin pamit"
    }
}

fun main() {
    //bikin object
    val cat = Cat()

    println(cat.name)
    cat.run()

    println("--------------------")

    val software = Software("Rizki", "Software Engineer",20)
    println(software.sayHello())
    println(software.sayGoodBye())

    println("--------------------")

    val hardware = Hardware("Bambang", "Hardware Engineer")
    println(hardware.sayHello())
    println(hardware.sayGoodBye())
}