package array

// Traversing an array
fun main()
{
    val arrayname = arrayOf<Int>(10, 20, 30, 40, 50)
    for (i in 0..arrayname.size-1)
    {
        println(arrayname[i])
    }
}
