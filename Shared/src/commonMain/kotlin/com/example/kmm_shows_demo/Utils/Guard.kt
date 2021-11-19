package com.example.kmm_shows_demo.Utils.Utils

fun <T : Any> guard(vararg elements: T?): Array<T>? {
    if (null in elements) {
        return null
    }
    @Suppress("UNCHECKED_CAST")
    return elements as Array<T>
}