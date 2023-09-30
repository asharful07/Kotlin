
// Enter user five number and print in list


package loops
fun main(){
    val list = mutableListOf<Int>()
    for(i in 1..5){
        print("Enter $i number: ")
        val x = readLine()?.toInt()
        if(x!=null) {
            list.add(x)
        }
    }
    println(list.reversed())
}