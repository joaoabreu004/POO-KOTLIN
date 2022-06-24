package one.digitalinnovation.digionebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double) : Funcionario(nome, cpf, salario) {

    //SOBREESCRITA
    override fun calculaBonificacao() = salario * 0.1
}