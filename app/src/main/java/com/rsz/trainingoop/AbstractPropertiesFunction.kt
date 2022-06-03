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
}

class Software() : Karyawan(){
    override val namaKaryawan: String
        get() = "Tio"
    override val jobKaryawan: String
        get() = "Software"
}

class Hardware() : Karyawan(){
    override val namaKaryawan: String
        get() = "Humam"
    override val jobKaryawan: String
        get() = "Hardware"
}

fun main() {
    //bikin object
    val cat = Cat()

    println(cat.name)
    cat.run()

    println("--------------------")

    val software = Software()
    println("${software.namaKaryawan} adalah seorang ${software.jobKaryawan}")

    val hardware = Hardware()
    println("${hardware.namaKaryawan} adalah seorang ${hardware.jobKaryawan}")
}