/* Crie uma função que recebe dois valores inteiros e imprima o maior deles. Considere
que não serão informados dois valores iguais.*/

fun exercise1(a: Int, b: Int) {
    if (a > b) {
        println("o maior numero é $a")
    } else {
        println("o maior numero é $b")
    }

}

/* Faça uma alteração na função do exercício acima e considere que pode haver dois
valores informados iguais. Caso isso aconteça, imprima “Valores iguais.”.*/

fun exercise2(a: Int, b: Int) {
    if (a > b) {
        println("o maior numero é $a")
    } else if (b > a) {
        println("o maior numero é $b")
    } else {
        println("Os valores são iguais")
    }

}

/*Considere que um abacaxi custa 3 reais quando comprados em quantidade menor que
10. Se for comprado 10 ou mais abacaxis, o valor cai para 2 reais a unidade.
Escreva uma função capaz de receber a quantidade de abacaxis comprados e o valor total
da compra.*/

fun exercise3(pineapple: Int) {
    if (pineapple > 10) {
        println("O abacaxi custa 2$ a unidade e você comprou $pineapple o valor da sua compra foi de ${pineapple * 2}")
    } else {
        println("O abacaxi custa 3$ a unidade e você comprou $pineapple o valor da sua compra foi de ${pineapple * 3}")
    }
}

/*Lutadores de boxe são classificados em categorias de acordo com o peso. Escreva um
programa usando o comando when que receba a descrição da categoria e informe o
intervalo de peso usando println.
Pena: menos de 57 kg
Leve: mais de 57 kg e menos de 61 kg
Médio: mais de 61 kg e menos de 73 kg
Pesado: igual ao acima de 73 kg*/

fun exercise4(weight: Int) {
    when {
        weight < 57 -> {
            println("Sua categoria é Pena e falta leve para você subir de categoria")
        }

        weight < 61 && weight > 57 -> {
            println("Sua categoria é Leve e falta leve para você subir de categoria")
        }

        weight < 73 && weight > 61 -> {
            println("Sua categoria é Medio e falta leve para você subir de categoria")
        }

        else -> {
            println("Sua categoria é pesado e não temos categoria superior a está.")
        }
    }
}

fun main(args: Array<String>) {
    println(exercise1(15, 10))
    println(exercise2(10, 10))
    println(exercise3(8))
    println(exercise4(40))
}