fun sum(price: Double, discount: Double): Double {
    val result = price * (discount / 100)
    return price - result
}

fun main() {
    val price = 200000.0
    val discount = 15.0
    val final_price = sum(price, discount)
    println("Harga awal: $price")
    println("Diskon: $discount%")
    println("Harga setelah diskon: $final_price")
}

/*
Harga awal: 200000.0
Diskon: 15.0%
Harga setelah diskon: 170000.0
*/
