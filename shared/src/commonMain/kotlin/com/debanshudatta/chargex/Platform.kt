package com.debanshudatta.chargex

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform