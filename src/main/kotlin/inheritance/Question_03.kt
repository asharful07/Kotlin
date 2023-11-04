package inheritance

//base class
open class baseClass{
    val name = "Hello"
    fun A(){
        println("Base Class")
    }
}
//derived class
class derivedClass: baseClass() {
    fun B() {
        println(name)
        println("Derived class")
    }
}
fun main(args: Array<String>) {
    val derived = derivedClass()
    derived.A()
    derived.B()
}
