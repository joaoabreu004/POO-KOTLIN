package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: Double,
) : Pessoa(nome, cpf){

    //TIPO RETORNO
    protected abstract fun calculaBonificacao(): Double;
}