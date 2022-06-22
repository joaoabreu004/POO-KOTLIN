package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Joao"
    private set
    var cpf:String = "559.010.390-92"
    private set

    constructor()

    //Function
    fun uneNomeCpf() = "$nome e $cpf"
}

fun main(){
    val joao = Pessoa();
//   joao.cpf = "534.434.433-39"
    println(joao.nome);
    println(joao.cpf);
    println(joao.uneNomeCpf())
}