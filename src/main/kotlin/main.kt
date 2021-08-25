fun main() {
    val melodyMan = true
    val previousBuys = 1_200_00
    val currentBuy:Double = 500_00.0
    val startStandardDiscount = 1_000_00
    val startPercentDiscount = 10_001_00
    val standardDiscount = 100_00.0
    val totalPrice = if (previousBuys > startStandardDiscount && previousBuys < startPercentDiscount) {
        currentBuy - standardDiscount
    }
    else if (previousBuys >= startPercentDiscount) ((currentBuy - standardDiscount) * 95) / 100
    else currentBuy
    val result:Double = if (melodyMan) {
        (totalPrice * 99) / 100_00
    } else totalPrice / 100
    println("Итоговая цена: $result руб.")
}