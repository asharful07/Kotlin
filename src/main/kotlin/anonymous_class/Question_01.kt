

//using anonymous class Create an abstract class A with method sum & display and Inherit a class B with override method sum

package anonymous_class
abstract class A{
    abstract fun sum()
    fun display(){
        println("Displaying...")
    }
}

class B:A(){
    override fun sum(){
        println("Declaration...")
    }
}

fun main() {
    val obj=B()
    obj.display()
    obj.sum()
    val obj1 = object : A(){
        override fun sum() {
            println("I am an anonymous class function... ")
        }

    }
    obj1.sum()
}