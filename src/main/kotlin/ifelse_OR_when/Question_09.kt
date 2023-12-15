

// count the Digit Of user number

package ifelse_OR_when
fun main(){
    print("Enter a number: ")
    var num = readln()?.toInt()
    var count =0
        for(i in 1..num!!){
            if(num!=0){
            num=num/10
            count++
            }
            else{
            break;
            }
}
    print("Total digits are: $count")
}