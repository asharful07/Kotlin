package Function
fun main(){
    print("Enter a number: ")
    val input = readLine()?.toInt()
    if(input!=null){
        if(input.isPrime()){
            println("$input Prime number")
        }
        else{
            println("$input Not a prime number")
        }
    }
}
fun Int.isPrime():Boolean{
    for(i in 2 until this -1){
        if(this %i==0)
            return false
    }
    return true
}