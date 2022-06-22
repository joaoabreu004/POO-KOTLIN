package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Joao";
    var cpf:String = "559.010.390-92";
}

 fun main(){
    val joao = Pessoa();
    println(joao.nome);
    println(joao.cpf);
 }