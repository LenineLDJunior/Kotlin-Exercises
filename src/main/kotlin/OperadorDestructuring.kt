data class carro(val marca: String ,val model: String, val ano:Int)
fun main (){
    val (marca, model, ano:Int) = carro("Volvo","xc40",  2023)
    println("$marca $model $ano")

    val(_, _, teste4) = listOf("teste1", "teste2","testeOk")
    println("Testando puxar um local especifico $teste4")
}
