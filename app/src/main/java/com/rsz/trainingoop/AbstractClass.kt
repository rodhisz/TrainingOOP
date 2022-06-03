package com.rsz.trainingoop

/**
 * abstract class adlah class parent yang tidak bisa dibuat object/instance
 */

abstract class Employee2 (name : String, job : String)
class Manager2 (name: String, job: String) : Employee2(name, job)

fun main() {
//    val employee2 = Employee2("Jojo", "Guru") // --> kode ini error karna abstract class ga bisa digunakan
    val manager2 = Manager2("tio", "SEO")
}