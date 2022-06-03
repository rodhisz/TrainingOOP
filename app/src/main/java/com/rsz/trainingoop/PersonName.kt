package com.rsz.trainingoop

/**
 * secondary constructor (bikin object dengan pilihan cons lain)
 */

/**
 * klo mau bikin properties dalam constructor tinggal tambahin var/val di constructornya
 */
class PersonName (val firstNameParam : String, val middleNameParam : String?, val lastNameParam : String){
    //cara bikin constructor baru
    constructor(firstName : String, lastName : String) : this(firstName, null, lastName)
    constructor(firstName : String) : this(firstName, "")

    //klo bikin constructor baru lagi "this"nya tinggal ambil dari atasnya aja

    init {
        println("""
            nama saya $firstNameParam $middleNameParam $lastNameParam
        """.trimIndent())
    }

    //ini adalah properties
    //klo di contructor udh ada var/val ini ga kepake lagi
//    var firstName = firstNameParam
//    var middleName = middleNameParam
//    var lastName = lastNameParam


}

fun main() {
    val name1 = PersonName("Rizki", "Saputra")
    val name2 = PersonName("Juan", "Saputra", "Sireger")
    val name3 = PersonName("Tio")

    println(name1.firstNameParam)
    println(name2.firstNameParam)
    println(name3.firstNameParam)
}