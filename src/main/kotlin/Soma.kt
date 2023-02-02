fun main() {
    print("Digite um número: ") //Imprimi "Digite um número: "
    val primeiroNumero = readln().toDouble() //Aguarda o usuário inserir um número
    print("Digite outro número: ") //Imprimi "Digite outro número: "
    val segundoNumero = readln().toDouble() //Aguarda o usuário inserir um número
    val soma = String.format("%.2f",primeiroNumero + segundoNumero) // Realiza a formatação para duas casas depois da virgula do resultado da soma das duas variáveis acima,
    println("A soma de $primeiroNumero mais $segundoNumero é: $soma")

}