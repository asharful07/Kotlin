
//Product of List element using extension Function

package Function
fun main(){
    val  list= listOf<Int>(10,2,3,9,5)
    println(list.product())
}
fun List<Int>.product(): Int{
    var flag=1
    for(i in this )
        flag*=i
    return flag
}