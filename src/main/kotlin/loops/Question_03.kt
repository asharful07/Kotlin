

//Calculate the Average of user five number's

package loops
fun main(){
    var sum=0.0F
    for (i in 1..5){
        print("Enter $i number: ")
        val i = readLine()?.toFloat()
        if(i!=null) {
            sum = (sum + i)
        }
    }
    sum = sum/5
    println("Avarage: $sum")
}