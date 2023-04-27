package classes

class cliente {
    constructor(nome:String){
        this.nome = nome
    }
    var nome: String
        get() =  "Meu nome é ${field}"
        set(value){
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main() {
    val clienteTeste = cliente("")
    println(clienteTeste.nome)
}