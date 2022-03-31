fun main() {
    val regularCustomer = true
    val amountPurchase = 17500

    val discount = 0
    val regularDiscount = amountPurchase / 100
    val discount1 = 100
    val regularDiscount1 = (amountPurchase - discount1) / 100
    val discount2 = (amountPurchase / 100) * 5
    val regularDiscount2 = (amountPurchase - discount2) / 100
    var resultSumma = 0
    var resultVipSumma = 0
    var resultDiscount = 0


    if (amountPurchase >= 0 && amountPurchase <= 1000) {
        resultSumma = amountPurchase - discount
        resultVipSumma = resultSumma - regularDiscount
        resultDiscount = discount + regularDiscount
    } else if (amountPurchase >= 1001 && amountPurchase <= 10000) {
        resultSumma = amountPurchase - discount1
        resultVipSumma = resultSumma - regularDiscount1
        resultDiscount = discount1 + regularDiscount1
    } else {
        resultSumma = amountPurchase - discount2
        resultVipSumma = resultSumma - regularDiscount2
        resultDiscount = discount2 + regularDiscount2
    }

    var result = if (regularCustomer === false) resultSumma else resultVipSumma


    println("Сумма к оплате: $result руб. Скидка составила: $resultDiscount руб.")

}