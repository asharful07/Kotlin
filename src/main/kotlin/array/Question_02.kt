

// Print the sum of all Element in Given Array

package array
fun main(){
    val array = arrayOf( 10,20,30,40,50 )
    var sum=0
    for(i in array){
        sum+=i
    }
    println("The sum of all element in given array is: $sum")
}