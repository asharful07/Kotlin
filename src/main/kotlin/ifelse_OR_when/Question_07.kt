
// check greater number between three number

package ifelse_OR_when
fun main(){
    print("Enter a first number: ")
    val num1 = readln()?.toInt()
    print("Enter a second number: ")
    val num2 = readln()?.toInt()
    print("Enter a third number: ")
    val num3 = readln()?.toInt()
    if (num1!=null && num2!=null && num3!=null)
        if(num1>num2){
            println("$num1 is greater ")
        }
    else if (num2>num3){
            println("$num2 is greater ")
        }
    else if (num3>num2 && num3>num1){
            println("$num3 is greater number")
        }
    else{
            println("All numbers are equal")
        }

}