package Function
fun main(){
    print("Enter a power number: ")
    val num1 = readLine()?.toInt()
    print("Enter a power of this number:")
    val num2 = readLine()?.toInt()
    if (num2 != null && num1!=null) {
        pow(num1,num2)
    }
}
fun pow(num1:Int,num2:Int){
    var result=1
    for(i in 1..num2){
        result*=num1
    }
    print("$num1 power of $num2 is: $result")
}
