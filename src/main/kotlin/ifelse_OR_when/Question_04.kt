package ifelse_OR_when
fun main(){
    print("Enter the day number: ")
    val day = readLine()?.toInt()
    if (day!=null){
        when(day){
            1-> print("Monday")
            2-> print("Tuesday")
            3-> print("Wednesday")
            4->print("Thursday")
            5-> print("Friday")
            6-> print("Saturday")
            7-> print("Sunday")
            else-> print("pls enter day number between 1 to 7")
        }
    }
}