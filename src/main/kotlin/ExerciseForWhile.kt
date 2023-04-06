/* 1. Imprima os números pares de 100 a 200.*/

fun exeForWhile1() {
    for (numbers in 100..200 step 2) {
        print("$numbers ")
    }
}

/*Faça uma função capaz de receber uma String e fazer a inversão.
Valor do parâmetro: Teste
Resultado esperado: etseT*/

fun exeForWhile2() {
    var name = "Teste"
    var reverse = name.reversed()
    println(reverse)
}

/* Faça uma função que receba dois números e mostre todos os números entre eles. Além dos
dois números, permita receber um terceiro parâmetro que diz se os números serão impressos de
forma crescente ou decrescente.
Considere que sempre o primeiro valor será menor que o segundo.
Ex:
a = 10, b = 15, Crescente -> 10, 11, 12, 13, 14, 15
a = 10, b = 15, Decrescente -> 15, 14, 13, 12, 11, 10
*/
fun exeForWhile3(number1: Int, number2: Int) {

    for (numbers in number1..number2) {
        println("Crescente $numbers ")
        if (number1 != number2) {
            continue
        }
    }
    for (numbers in number2 downTo number1) {
        println("Decrecente $numbers")
        if (number1 != number2) {
            continue
        }
    }
}

/* Considere uma escada de tamanho n = 4:
#
##
###
####
Perceba que o número de linhas é igual o número do tamanho N da escada. Perceba também que
a quantidade de # é igual ao tamanho N da escada na última linha.
Escreva um algoritmo que seja capaz de receber um valor inteiro N e escrever essa escada de
tamanho N.*/
fun exeForWhile4(step:Int){
    for(n in 1..step){
        for(i in 1..n){
            println("#")
        }
        println("$n ")
    }
}

fun main() {
    exeForWhile1()
    exeForWhile2()
    exeForWhile3(10, 15 )
    exeForWhile4(5)
}