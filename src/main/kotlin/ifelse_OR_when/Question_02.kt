
// Check even or Odd number

package ifelse_OR_when
fun main(){
    print("Enter a number: ")
    val num = readLine()?.toInt()
    if(num!=null){
    when(num%2){
        0-> {
            print("Even number")
        }
        else->{
            print("odd number: ")
        }
    }
}
}