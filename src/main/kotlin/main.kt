fun main() {
    val summInRub = 10000
    val kopInRub = 100
    val amount = summInRub * kopInRub
    val minComissioninRub = 35
    val minComissionInCop = minComissioninRub * kopInRub
    val comissionPercent = 0.75
    val percentSumm = amount / 100 * comissionPercent
    var result = if (percentSumm < minComissionInCop) minComissionInCop else percentSumm.toInt()

    println("Total comission from the amount of $summInRub rub was $result kop.")



}