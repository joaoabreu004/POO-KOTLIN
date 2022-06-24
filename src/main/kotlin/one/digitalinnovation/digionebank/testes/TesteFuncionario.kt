package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val joao = Funcionario("Joao Vitor de Abreu", "333333", 2300.0);
//   joao.cpf = "534.434.433-39"
    println(joao.nome);
    println(joao.cpf);
}