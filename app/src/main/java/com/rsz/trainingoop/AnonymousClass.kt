package com.rsz.trainingoop


/**
 * cara mekakses result dalam fun main adalah dengan memanggil fun fireaction yang dimana
 * fireaction berisi akses menuju interface yang berisi result
 */

interface Action {
    fun result() : Unit
}

fun fireAction(action: Action) {
    action.result()
}

fun main() {
    fireAction(object : Action{
        override fun result() {
            println("actions one")
        }
    })

    fireAction(object : Action{
        override fun result() {
            println("actions one")
        }

    })
}