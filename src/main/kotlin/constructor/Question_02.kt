

//Calculate the area and circumference of the  circle using constructor

package constructor
class Circle(r:Float){
    var radius = r
    val pi = 3.141f
    init {
        println("A circle is created with radius = $radius")
    }
    fun circumference():Float{
        return 2*pi*radius
    }
    fun area():Float{
        return pi*radius*radius
    }
}

fun main(){
    print("Enter radius of circle: ")
    val radius = readLine()?.toFloat()
    if(radius!=null){
        val obj = Circle(radius)
        println("Area of circle is: ${obj.area()}")
        println("circumference of circle is: ${obj.circumference()}")
    }
}