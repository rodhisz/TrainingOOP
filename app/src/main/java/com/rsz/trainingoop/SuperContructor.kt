package com.rsz.trainingoop

open class shape2(val name : String, val shape : String, val color : String){
    constructor(name : String, shape : String) : this(name,shape,"")
    constructor(name : String) : this(name, "")

    fun cekKondisi() {
        if (color == "" && shape == ""){
            println("ini cons 3")
        } else if (color == "") {
            println("ini cons 2")
        } else {
            println("ini cons 1")
        }
    }

}

class rectangle2 : shape2 {
    constructor(name: String, shape: String,color: String) : super(name,color,shape)
    constructor(name: String, shape: String) : super(name, shape)
    constructor(name: String) : super(name)
}

fun main() {
    val shape = rectangle2("meja", "kursi","hijau")
    val shape2 = rectangle2("meja", "kursi")
    val shape3 = rectangle2("meja")


    shape.cekKondisi()
    shape2.cekKondisi()
    shape3.cekKondisi()
}