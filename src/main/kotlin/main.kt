fun main() {
    val likesNumber = 105
    val remainder = likesNumber % 10

    if (remainder == 1) {
        println("Понравилось $likesNumber человеку")
    } else {
        println("Понравилось $likesNumber людям")
    }
}