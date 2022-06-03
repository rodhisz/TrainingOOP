package com.rsz.trainingoop

/**
 * inhetitance adalah Penurunan sifat
 * pakai "open" untuk bikin class tersebut menjadi parent (dapat diturunkan)
 */

/**
 * function overriding adalah membuat ulang function di child class (jika ingin custom function
 * dan tidak mengikuti function parent)
 *
 * dengan menambahkan open didalam fun parent
 */

/**
 * Final Override function
 *
 * sebenernya sebuah class child bisa dijadikan parent dengan hanya menambahkan open di classnya
 * dan jika sebuah class child dijadikan parent maka function didalamnya auto menjadi open juga
 * maka tambahkan final supaya funtion tidak dapat dirubah
 */

open class Employee (val name : String, val job : String) {
    open fun sayHello(name : String) {
        println("hello $name, my name is ${this.name}")
    }

    open fun jenisPekerjaan () {
        println("Jenis pekerjaannya adalah $job")
    }
}

open class Manager (name : String, job : String) : Employee(name, job) {
    //dibawah ini adalah contoh function overriding
    //ditambahkan final
    final override fun sayHello(name: String) {
        println("ini adalah function override ")
    }
}
class VicePresiden (name: String, umur : Int,job : String) : Manager(name,job)

fun main() {
    val dzaky = Manager("Dzaky","software enginer")
    dzaky.sayHello("Humam")
    dzaky.jenisPekerjaan()

    val rodhi = VicePresiden("Rodhi", 20, "ceo")
    rodhi.sayHello("Tio")
    rodhi.jenisPekerjaan()
}