fun main() {
    val regularCustomer = true
    val amountPurchase = 17500

    val discount = 0
    val regularDiscount = amountPurchase/100
    val discount1 = 100
    val regularDiscount1 = (amountPurchase - discount1)/100
    val discount2 = (amountPurchase/100)*5
    val regularDiscount2 = (amountPurchase - discount2)/100


    if (amountPurchase >= 0 && amountPurchase <= 1000) {
        if (regularCustomer === false) {
            println("Сумма к оплате: ${amountPurchase - discount} руб. Скидка составила: $discount руб.")
        } else println("Сумма к оплате: ${amountPurchase - discount - regularDiscount} руб. Скидка составила: ${discount + regularDiscount} руб.")
    } else if (amountPurchase >= 1001 && amountPurchase <= 10000) {
        if (regularCustomer === false) {
            println("Сумма к оплате: ${amountPurchase - discount1} руб. Скидка составила: $discount1")
        } else println("Сумма к оплате: ${(amountPurchase - discount1) - regularDiscount1} руб. Скидка составила: ${discount1 + regularDiscount1} руб.")
    } else if (regularCustomer === false) {
        println("Сумма к оплате: ${amountPurchase - discount2} руб. Скидка составила: $discount2")
    } else println("Сумма к оплате: ${(amountPurchase - discount2) - regularDiscount2} руб. Скидка составила: ${discount2 + regularDiscount2} руб.")

}