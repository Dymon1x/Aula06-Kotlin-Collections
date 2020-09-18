package br.com.digitalhouse.collections.exercicios

fun main() {
    val lista = mutableListOf<Int>() //o listOf ACEITA valores repetidos
    lista.addAll(listOf(1, 5, 5, 6, 7, 8, 8, 8))
    println(lista)

    val lista2 = mutableSetOf<Int>()// ja o setOF NÃO ACEITA valores repetidos
    lista2.addAll(listOf(1, 5, 5, 6, 7, 8, 8, 8))
    println(lista2)

}