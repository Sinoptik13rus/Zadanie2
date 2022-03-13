fun main() {
    val summInRub = 10000
    val kopInRub = 100
    val amount = summInRub * kopInRub
    val minComissioninRub = 35
    val minComissionInCop = minComissioninRub * kopInRub
    val comissionPercent = 0.75
    val percentSumm = amount / 100 * comissionPercent

    if (percentSumm < minComissionInCop) {
        println("Total comission from the amount of $summInRub was $minComissionInCop kop.")
        println("Total comission from the amount of $summInRub was $minComissioninRub rub.")
    } else {
        println("Total comission from the amount of $summInRub was $percentSumm kop.")
        println("Total comission from the amount of $summInRub was ${percentSumm / 100} rub.")
    }


}