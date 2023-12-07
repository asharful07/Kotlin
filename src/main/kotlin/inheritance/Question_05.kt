package inheritance

//base class

open class B1Class{
    val name = "GeeksforGeeks"
    fun A(){
        println("Base Class")
    }
}
//derived class

class C1Class: B1Class() {
    fun B() {
        println("Derived class")
    }
}
fun main(args: Array<String>) {
    val derived = derivedClass()
    derived.A()		 // inheriting the base class function
    derived.B()		 // calling derived class function
}
