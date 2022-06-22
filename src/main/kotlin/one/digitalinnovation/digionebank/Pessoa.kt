package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Joao";
    var cpf:String = "559.010.390-92";

    //Classe Interna (Inner Class)
    inner class Endereco{
        var rua:String = "Rua das Rosas"
    }
}

fun main(){
    val joao = Pessoa();
    println(joao.nome);
    println(joao.cpf);
    println(joao.Endereco().rua)
}