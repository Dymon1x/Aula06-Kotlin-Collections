package br.com.digitalhouse.collections.exercicios.ex4

abstract class Roupa(marca: String, modelo: String): Peca(marca, modelo) {
    override fun retirada(guardaVolumes: GuardaVolumes, id: Int) {
//        guardaVolumes.retirarPeca(id)
    }
}