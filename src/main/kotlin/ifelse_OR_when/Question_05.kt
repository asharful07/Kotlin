package ifelse_OR_when
fun main() {
    val a = 30
    val b = 40

    // here if-else returns a value which
    // is to be stored in max variable

    val max = if(a > b){
        print("Greater number is: ")
        a
    }
    else{
        print("Greater number is:")
        b
    }
    print(max)
}
