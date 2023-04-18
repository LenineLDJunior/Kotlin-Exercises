fun main (){
    val(valor1,valor2,valor3,valor4)=listOf(3,5,1,15)
    val somar =  valor1 + valor2 + valor3 + valor4
    val subtração = valor2 - valor1
    val divisao = valor4 / valor1
    val multiplicacao = valor1 * valor2
    //no modulo mostra o resto da divisão
    val modulo = valor2 % valor1
    println("$somar , $subtração , $divisao , $multiplicacao ,$modulo")

}