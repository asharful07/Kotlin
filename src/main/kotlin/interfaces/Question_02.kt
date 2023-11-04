package interfaces
interface Vehicle {
    fun start()
    fun stop()
}

class Car : Vehicle {
    override fun start()
    {
        println("Car started")
    }

    override fun stop()
    {
        println("Car stopped")
    }
}

fun main()
{
    val obj = Car()
    obj.start()
    obj.stop()
}
