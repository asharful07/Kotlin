

//Checking a number is positive or negative

package ifelse_OR_when
fun main(){
    print("Enter a number: ")
    val num = readln()?.toInt()
    if(num!=null)
    if (num>=0){
        println("Positive number:")
    }
    else{
        println("Negative Number:")
    }
}