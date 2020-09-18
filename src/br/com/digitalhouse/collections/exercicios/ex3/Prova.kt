package br.com.digitalhouse.collections.exercicios.ex3

class Prova() {
    fun somaTotal(inteiros: List<Int>): Int {
        var soma = 0
        inteiros.forEach {
            soma += it
        }
        return soma
    }
}