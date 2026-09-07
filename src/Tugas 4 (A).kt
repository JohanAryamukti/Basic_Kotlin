// 1. Deklarasi konstanta PI
const val PI: Double = 3.14159

fun main() {
    println("=== PROGRAM LUAS & KELILING LINGKARAN ===")

    // 2. Menerima masukan jari-jari dari pengguna menggunakan readln()
    print("Masukkan jari-jari lingkaran (r): ")
    val jariJari: Double = readln().toDouble()

    // 3. Memproses perhitungan menggunakan fungsi terpisah
    val luasLingkaran: Double = hitungLuasLingkaran(jariJari)
    val kelilingLingkaran: Double = hitungKelilingLingkaran(jariJari)

    // 4. Menampilkan hasil perhitungan
    println("\n=== HASIL PERHITUNGAN ===")
    println("Jari-jari (r)      : $jariJari")
    println("Luas Lingkaran     : $luasLingkaran")
    println("Keliling Lingkaran : $kelilingLingkaran")
}

// Fungsi untuk menghitung luas lingkaran: PI × r × r
fun hitungLuasLingkaran(r: Double): Double {
    return PI * r * r
}

// Fungsi untuk menghitung keliling lingkaran: 2 × PI × r
fun hitungKelilingLingkaran(r: Double): Double {
    return 2 * PI * r
}