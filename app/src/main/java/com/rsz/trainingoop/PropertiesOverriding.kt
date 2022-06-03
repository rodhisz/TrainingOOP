package com.rsz.trainingoop

open class shape () {
    open  val corner = -1
}

class rectangle : shape () {
    override val corner: Int
        get() = super.corner
}