package loops

fun main(args: Array<String>) {

    val planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")

    for (i in planets.indices) {
        println(planets[i])
    }
}
