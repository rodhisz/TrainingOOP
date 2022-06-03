package com.rsz.trainingoop

class BigNote(val title : String) {

    var bigTitle : String = title
    get() = field.uppercase()

    set(value) {
        if(value.isNotBlank()){
            field = value
        } else{
            field = "ini kosong"
        }
    }
}

fun main() {
    val note = BigNote("First Note")
    println(note.bigTitle)

    note.bigTitle = ""
    println(note.bigTitle)
}