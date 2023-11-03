

// Anonymous class working

package anonymous_class
interface MainDetails
{
    fun Empdetail1()
    {
        val id:Int=41
        var name:String="Arun"
    }

}
fun main(args:Array<String>)
{
    var n:MainDetails=object:MainDetails
    {
        override fun Empdetail1()
        {
            val id:Int=42
            var name:String="Rahul"
            println("My name is $name with id $id")
        }

    }
    n.Empdetail1()

}