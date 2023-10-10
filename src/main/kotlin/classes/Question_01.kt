
// Area of Rectangle

package classes
fun main(){
     val obj = Rectangle(5,5)
    println(obj.area())
}

class Rectangle(l:Int, b:Int){
    var length = 0
    var breadth = 0
    init {
        this.length  = l
        this.breadth = b
        println("Rectangle created with length = $length and breadth = $breadth")
    }
    fun area():Int{
        return this.length*this.breadth
    }
}