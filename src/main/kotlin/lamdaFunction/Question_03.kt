


// create a list and calculate the sum of all odd number's of the list using lambda function

package lamdaFunction
fun main() {
    var sum =0
    val list=(1..5).toList()
    sum=list.customSum{ it % 2==1 }
    println(sum)


}


fun List<Int>.customSum(filterFunction:(Int)->(Boolean)):Int{
    var result = 0
    for(element in this){
        if(filterFunction(element)){
            result+=element
        }
    }
    return result
}

