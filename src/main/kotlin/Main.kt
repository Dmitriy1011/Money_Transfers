fun main() {

    //Задача 1

    val amount = 10_000
    val commissionSum: Int = (amount * 0.75 / 100).toInt()
    val commissionInRubles = if (commissionSum >= 35) commissionSum else "Минимальная комиссия 35 рублей"

    println("Коммиссия при переводе составит $commissionInRubles рублей")
    println()

    //Задача 2

    val likes = 25
    val preLast = likes % 100 / 10
    val remainderOfDevision = likes % 10

    println("preLast: $preLast")
    println("likes % 10: " + likes % 10)
    println()


    if (remainderOfDevision == 1 && preLast != 1) {
        println("Понравилось $likes человеку")
    } else if (remainderOfDevision == 1 && preLast == 1) {
        println(println("Понравилось $likes людям"))
    } else if (remainderOfDevision != 1) {
        println(println("Понравилось $likes людям"))
    }
    println()

    //Задача 3

    val purchaseAmount = 5000
    var discount = 0
    val isRegularCustomer = true
    val discountForRegulars = 0.01;

    if (purchaseAmount >= 0 && purchaseAmount < 1000) {
        println("Sum with discount = $purchaseAmount")
        if (isRegularCustomer) {
            println("Sum with regular customer discount: " + (purchaseAmount - (purchaseAmount * discountForRegulars)))
        }
    } else if (purchaseAmount >= 1001 && purchaseAmount < 10000) {
        discount += 100
        println("Sum with discount = " + (purchaseAmount - discount))
        if (isRegularCustomer) {
            println("Sum with regular customer discount: " + ((purchaseAmount - discount) - ((purchaseAmount - discount) * discountForRegulars)))
        }
    } else if (purchaseAmount > 10000) {
        discount = purchaseAmount * 5 / 100
        println("Sum with discount = " + (purchaseAmount - discount))
        if (isRegularCustomer) {
            println("Sum with regular customer discount: " + ((purchaseAmount - discount) - ((purchaseAmount - discount) * discountForRegulars)))
        }
    }
}
