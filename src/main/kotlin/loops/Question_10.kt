

//Traverse an array without using index property:

package loops
fun main(args: Array<String>) {
    val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)

    for (num in numbers){
        if(num%2 == 0){
            print("$num ")
        }
    }
}
