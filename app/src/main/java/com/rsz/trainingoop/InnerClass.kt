package com.rsz.trainingoop

/**
 * membuat class dalam class
 */

class Boss (val name : String) {

    //tambahin inner untuk membuat class dalam class
    inner class Employee(val name : String) {
        fun hi() {
            println("Hi, I'm $name, and my boss is ${this@Boss.name}")
        }
    }
}

fun main() {
    val boss = Boss("Tio")

    val joko = boss.Employee("Bagus")
    joko.hi()

    val budi = boss.Employee("Bagus")
    budi.hi()
}