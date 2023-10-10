
// Area and Parameter of Triangle

package classes
import kotlin.math.sqrt
fun main(){
    val myTriangle = Triangle(2.0,3.0,4.0)
    println("Area of Triangle is ${myTriangle.area()}")
    println("Perimeter of Triangle is ${myTriangle.perimeter()}")
}

class Triangle(val sideA : Double, val sideB : Double, val sideC : Double){
    init {
        println("Triangle is created with a = $sideA, b = $sideB and c = $sideC")
    }
     val s = perimeter()/2
    fun perimeter():Double{
        return sideA+sideB+sideC
    }

    fun area():Double{
        return sqrt(s*(s-sideA)*(s-sideB)*(s-sideC))
    }
}
