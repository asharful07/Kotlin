


// create a list and calculate the sum of all odd number's of the list
package lamdaFunction
fun main() {
    var sum =0
    var list=(1..5).toList()
    list=list.filter { it % 2==1 }
    for (i in list){
        sum+=i
    }
    println("The sum of all odd number is: $sum")
}