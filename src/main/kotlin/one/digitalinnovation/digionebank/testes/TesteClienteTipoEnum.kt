package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    //Dessa maneira, estamos printando os objetos dentro da nossa Enum
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }


    val pf  = ClienteTipo.PF
    println(pf.name + pf.descricao)

}