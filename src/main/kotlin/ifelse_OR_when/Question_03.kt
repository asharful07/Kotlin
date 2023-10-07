package ifelse_OR_when
fun main(){
    print("Enter your age: ")
    val age = readLine()?.toInt()
    if (age != null) {
        when{
            age>17-> print("You are Eligible for vote ")
            else-> print("You are not Eligible for vote")
        }
    }
}
