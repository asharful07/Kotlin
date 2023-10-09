package Function
 fun main(){
     val list =  mutableListOf(10,20,30,40,50,60,70)
     println(list)
     print("Search a number in Given list: ")
     val num = readLine()?.toInt()
     if(num!=null) {
         println("The index of $num is ${find(num, list)}")
     }
 }
fun find(num:Int?,list: List<Int> ): Int {
    var result=-1
    for(i in list) {
        if (num == i)
            result = list.indexOf(i)
    }
    return result

}



