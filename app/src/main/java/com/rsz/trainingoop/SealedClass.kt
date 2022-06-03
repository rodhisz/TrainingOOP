package com.rsz.trainingoop

/**
 * sama kyk abstract class
 *
 * tidak bisa dibuat object
 *
 * kyk abstract, open, interface
 */

sealed class Operation(val name : String)

class Plus : Operation("Add")
class Minus : Operation("Minus")

fun operation(value1 : Int, value2 : Int, operation: Operation) : Int {
    return when(operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}

fun main() {
    val plus = Plus()
    val minus = Minus()

    println(operation(12,13,plus))
    println(operation(12,13,minus))
}

