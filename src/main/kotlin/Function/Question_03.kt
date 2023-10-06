
// Factorial of number

package Function
fun main(){
    print("Enter a number: ")
    val num = readLine()?.toInt()
    if (num!=null)
    println(fact(num))
}
fun fact(num:Int):Int{
    var result=1
    for(i in 1..num){
        result*=i
    }
    return result
}