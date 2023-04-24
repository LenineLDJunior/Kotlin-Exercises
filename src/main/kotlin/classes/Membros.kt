package classes

class data (var dia:Int, var mes:Int, var ano:Int){
    fun formatar():String{
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nascimento: data = data(4,1,2000)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    println(nascimento.formatar())
    with(nascimento){
        println("$dia/$mes/$ano")
    }
}