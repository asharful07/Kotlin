
// Take two input number's &  2nd number is power of 1st number find the result

package loops
fun main(){
    print("Enter 1st number: ")
    val a = readLine()?.toInt()
    print("Enter 2nd number: ")
    val b = readLine()?.toInt()
    var i=b
    var flag=1
    if(a!=null && b!=null){
        if (i != null) {
            while (i>0){
                flag=flag*a
                i--
            }
            println("First number: $a")
            println("second number: $b")
            println("$b to the  power of $a is: $flag ")
        }

}
}