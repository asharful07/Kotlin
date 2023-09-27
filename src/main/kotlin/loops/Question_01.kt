
// Take a user input number and print in Decreasing Order

package loops
fun main(){
    print("Enter a number: ")
    var num = readLine()?.toInt()

    if(num!=null){
    while (num>=0){
        println(num)
        num--
    }
}
}