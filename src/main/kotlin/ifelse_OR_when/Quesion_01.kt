package ifelse_OR_when
fun main() {
    print("Enter the country name: ")
    when(readLine()){
            "india"-> print("Namaste")
            "usa"-> print("Hello")
            "canada"-> print("Hi")
            "germany"-> print("Hey")
            else -> print("please Enter given Country name")
        }

}