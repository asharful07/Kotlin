

//Calculate the sum of all given different arguments in constructor

package constructor
class Sum{
    var num1=0
    var num2=0
    var num3=0
    var num4=0
    constructor(n1: Int,n2: Int,n3: Int,n4:Int){
        num1=n1
        num2=n2
        num3=n3
        num4=n4
    }
    constructor(n1:Int,n2:Int,n3:Int){
        num1=n1
        num2=n2
        num3=n3
    }
    constructor(n1: Int,n2: Int){
        num1=n1
        num2=n2
    }
    fun result():Int{
        return num1+num2+num3+num4
    }
}
fun main() {
    val obj1= Sum(1,2,3,4)
    val obj2 = Sum(1,2,3)
    val obj3= Sum(1,2)


    println(obj1.result())
    println(obj2.result())
    println(obj3.result())
}