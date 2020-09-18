package br.com.digitalhouse.collections

fun main(){
    //MutableMapOf
    val numbers = mutableMapOf("one" to 1, "two" to 2)
    println(numbers)
    numbers.put("three", 3) // adiciona mais uma key no mutableMapOf
    println(numbers)
    numbers["one"] = 14
    println(numbers)
}