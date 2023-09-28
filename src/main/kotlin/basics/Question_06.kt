
// WAP to enter  age and check you are old or younger or Too old or child

package basics
fun main(){
    print("Enter your age: ")
    val age = readLine()?.toInt()
    if (age != null) {
        if(age<17){
            println("You are a kid:")
        }
        else if(age>=18 && age<=40){
            println("You are a younger:")

        } else if(age>40 && age<61){
            println("You are old:")
        }
        else if (age>=60)
            println("Too old:")
    }
}
