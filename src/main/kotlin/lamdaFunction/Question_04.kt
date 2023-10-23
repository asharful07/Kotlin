package lamdaFunction

fun main(){
    val list = (1..20).toList()
    println("We have original list:${list.toMutableList()}")
    println("Mutable list element: ${list.greaterFive()}")
}

fun List<Int>.greaterFive():List<Int>{
    val list = mutableListOf<Int>()
    for (i in this){
        if(i>5)
            list.add(i)
    }
    return list
}
