fun smartCast(teste:Any){
    if(teste is String){
        println(teste.uppercase())
    } else if (teste is Int){
        println(teste.plus(10))
    }
}

fun smartCast2(teste1: Any){
    when(teste1){
        is String -> println(teste1.uppercase())
        is Int -> println(teste1.plus(10))
    }
}

//Operador Cast

fun conceitos(nota: Any){
    when(nota as? Int){
            10,9,8 -> println("Sua nota A")
            7,6,5 -> println("Sua nota B")
            4,3,2 -> println("Sua nota C")
            1,0 -> println("Sua nota D")
    }
}


fun main(){
    smartCast("Gabriella")
    smartCast2("Lenine")
    var notas = arrayOf(9.6,6.5,3.5,1.2)
    var reverse = notas.reversed()
    for (nota in reverse){
        conceitos(nota.toInt())
    }
}