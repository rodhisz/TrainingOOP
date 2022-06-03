package com.rsz.trainingoop

/**
 * jika ada nama yang sama didalam fun dan tertutup oleh paramater
 * maka diberikan ${this}
 */

class ThisKeyword (val name : String) {

    fun sayHello (name : String) {
        println("halo $name, saya ${this.name}")
    }

    /**
     * contructer dan parameter memiliki nama yang sama, maka tambahkan this
     * supaya dapat mengakses contructer
     */

}