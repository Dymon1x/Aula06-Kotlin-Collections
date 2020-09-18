package br.com.digitalhouse.collections.exercicios.ex4

abstract class Peca(var marca: String, var modelo:String){
    abstract fun retirada(guardaVolumes: GuardaVolumes, id: Int)
}