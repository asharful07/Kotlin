

// Create a base class(Myparentclass) and inherit (Mychildclass) with a method

package inheritance
open class MyParentClass {
    val x = 50
}

// derived class
class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x)
    }
}

fun main() {
    val myObj = MyChildClass()
    myObj.myFunction()
}