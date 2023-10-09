package Function
fun main(){
  val number=  sum(10,20,30,40,50,60,70,70,90,100)
    println(number)
}
 fun sum(vararg numbers: Int): Int {
     var sum=0
        for(i in 0.. numbers.size-2 step 2 )
            sum= sum+numbers[i]-numbers[i+1]
     return sum

 }