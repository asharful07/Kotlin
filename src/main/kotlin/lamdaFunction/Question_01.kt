

// create a list and calculate the all even number's of the list using lambda function
package lamdaFunction
fun main() {
    var list=(1..30).toList()
    list=list.filter { it%2==0 }
    println(list)
}