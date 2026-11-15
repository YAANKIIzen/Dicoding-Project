fun main() {
    var total = 0

    for (i in 1..10) {
        val nominal = i * 10000
        total += nominal
        println("Tabungan minggu ke-$i : Rp $total")
    }
    println("\nTotal tabungan selama 10 minggu: Rp. $total")
}

/*Tabungan minggu ke-1 : Rp 10000
Tabungan minggu ke-2 : Rp 30000
Tabungan minggu ke-3 : Rp 60000
Tabungan minggu ke-4 : Rp 100000
Tabungan minggu ke-5 : Rp 150000
Tabungan minggu ke-6 : Rp 210000
Tabungan minggu ke-7 : Rp 280000
Tabungan minggu ke-8 : Rp 360000
Tabungan minggu ke-9 : Rp 450000
Tabungan minggu ke-10 : Rp 550000

Total tabungan selama 10 minggu: Rp. 550000*/
