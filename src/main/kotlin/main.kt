fun main() {
    val likesNumber = 61
    val remainder = likesNumber % 10
    val result = if (likesNumber % 100 == 11 || likesNumber % 10 != 1) "людям" else "человеку"
    println("Понравилось $likesNumber $result")

}