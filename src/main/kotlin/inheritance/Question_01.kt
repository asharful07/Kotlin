

// Create a class Audi which is Inherit by base class Car and BMW class is Inherit by Audi

package inheritance
open class Car(var name: String){
    init {
        println("$name is created")
    }
    fun changeName(str: String){
        name = str
    }
}
class Audi: Car("Audi"){
}
class Bmw:Car("BMW"){
}

fun main() {
    val obj=Bmw()
    val obj1=Audi()
    obj1.changeName("newCar")
}