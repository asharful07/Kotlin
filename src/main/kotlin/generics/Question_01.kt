package generics
class Company<T> (text : T){
    var x = text
    init{
        println(x)
    }
}
fun main(args: Array<String>){
    var name: Company<String> = Company<String>("Hello generics")
    var rank: Company<Int> = Company<Int>(12)
}
