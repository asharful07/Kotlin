
// print Even Element of an array

package array
fun main()
{
    val array = Array(5, { i -> i * 2 })
    for (element in array)
    {
        println(element)
    }
}
