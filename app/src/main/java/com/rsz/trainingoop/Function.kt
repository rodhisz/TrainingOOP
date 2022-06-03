package com.rsz.trainingoop

class Function (val name : String) {

    //fun disini adalah behavior/method untuk object
    fun sayHello (yourName : String) {
        println("halo $yourName, saya $name")
    }

    fun berlari () {
        println("Murid dengan nama $name bisa berlari")
    }

}

fun main() {
    val name = Function("tio")
    name.sayHello("humam")
    name.berlari()
}

/**
 * function overloading adalah cara membuat nama function yang sama
 * caranya adalah dengan membedakan isi parameter dari masing masing function tersebut
 */