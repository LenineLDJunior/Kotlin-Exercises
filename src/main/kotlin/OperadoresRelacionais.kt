import java.util.Date

fun main(){
    println("banana" === "banana")
    println(3 !== 2)
    println(3 < 2)
    println(3 <= 2)
    println(3 > 2)
    println(3 >= 2)

    val observacao1 = Date(0)
    val observacao2 = Date(0)
    //Igualdade Refencial
    println("Resultado com '==='${observacao1 === observacao2}")
    //Igualdade Estrutual (O resultado so retorna true nesta opção pois a igualdade estrutural analisa excluisvamente os elemnetos ou seja analisa o equals das vals
    println("Resultado com '=='${observacao1 == observacao2}")
}