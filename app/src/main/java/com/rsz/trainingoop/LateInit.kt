package com.rsz.trainingoop

/**
 * late init adalah menunda inisialisisi sebuah data
 */

class Televisi {
    lateinit var brand : String

    fun initTelevision() {
        brand = "Samsung"
    }

}

fun main() {
    val tv = Televisi()

    tv.initTelevision()
    println(tv.brand)
}