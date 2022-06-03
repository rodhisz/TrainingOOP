package com.rsz.trainingoop

import com.rsz.trainingoop.Laptop as Laptop

/**
 * setiap class yang ga punya class parent auto jadi class any
 */

class Laptop (val brand : String) : Any() {

    override fun toString(): String {
        return "ini adalah brand $brand"
    }

    override fun equals(other: Any?): Boolean {
        return when (other){
            !is Laptop -> {
                println("ini ga sama")
                false
            } else -> {
                println("ini sama")
                true
            }
        }
    }
}

fun main() {
    val laptop = Laptop("Asus")
    val laptop2 = Laptop("Acer")
    println(laptop.toString())

    println("-----------------------")

    println(laptop.equals("contoh"))
    println(laptop.equals(laptop2))
}