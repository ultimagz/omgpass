package com.omg.pass

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform