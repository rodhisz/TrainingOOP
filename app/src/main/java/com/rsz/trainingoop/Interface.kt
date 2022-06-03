package com.rsz.trainingoop

/**
 * interface sama kyk abstrac class, bedanya properties sama fun
 * didalamnya ga perlu dikasih abstract lagi
 *
 * dan kelebihannya interface juga bisa di tambahkan didalam 1 class child
 * (1 class bisa memiliki banyak interface)
 *
 * nama fun antar interface tidak boleh sama
 */

interface Volume {
    val panjang : Int
    val lebar : Int
    val tinggi : Int

    fun hitungVolume() : Int
}

interface Luas {
    fun hitungLuas() : Int
}

class Balok(override val panjang: Int, override val lebar: Int, override val tinggi: Int) : Volume,Luas {
    override fun hitungVolume(): Int {
        return panjang * lebar * tinggi
    }

    override fun hitungLuas(): Int {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi))
    }
}

fun main() {
    val balok = Balok(10,20,30)

    println("""
        Volume Balok adalah ${balok.hitungVolume()}cm
        Luas Balok adalah ${balok.hitungLuas()}cm
    """.trimIndent())
}
