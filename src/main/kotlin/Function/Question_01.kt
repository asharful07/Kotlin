package Function

fun main(){
    print("Enter a number: ")
    val num = readLine()?.toInt()
     sum(num)
}
fun sum(num: Int?) {

    var sum=0
    if(num!=null)
    for(i in 1..num){
        sum+=i
    }
    print("The sum of 1 to $num is:$sum")
}