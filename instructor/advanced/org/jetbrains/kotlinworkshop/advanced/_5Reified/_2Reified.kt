package org.jetbrains.kotlinworkshop.advanced._5Reified

inline fun <reified T> isA(value: Any) = value is T

fun main() {
    println(isA<String>("abc"))
    println(isA<String>(123))
}