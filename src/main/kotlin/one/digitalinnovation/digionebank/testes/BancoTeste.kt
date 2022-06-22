package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.idNum)

    val banco2 = digiOneBank.copy("Itau", 23)

    println(banco2.nome)
    println(banco2.idNum)
}