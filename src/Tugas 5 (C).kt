fun main() {
    println("=== KALKULATOR SEDERHANA ===")
    println("Pilihan Operasi:")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")
    print("Pilih operasi (1-4): ")
    val pilihanOperasi: Int = readln().toInt()

    // Validasi pilihan menu
    if (pilihanOperasi !in 1..4) {
        println("\nPesan Kesalahan: Pilihan operasi tidak valid! Pilih angka 1 sampai 4.")
        return // Menghentikan eksekusi jika pilihan tidak valid
    }

    // Menerima input dua bilangan
    print("Masukkan bilangan pertama (a): ")
    val bilanganA: Double = readln().toDouble()

    print("Masukkan bilangan kedua (b)  : ")
    val bilanganB: Double = readln().toDouble()

    // Memproses perhitungan sesuai pilihan
    println("\n=== HASIL PERHITUNGAN ===")
    when (pilihanOperasi) {
        1 -> {
            val hasil = tambah(bilanganA, bilanganB)
            println("$bilanganA + $bilanganB = $hasil")
        }
        2 -> {
            val hasil = kurang(bilanganA, bilanganB)
            println("$bilanganA - $bilanganB = $hasil")
        }
        3 -> {
            val hasil = kali(bilanganA, bilanganB)
            println("$bilanganA × $bilanganB = $hasil")
        }
        4 -> {
            // Ketentuan tambahan: Cek apakah bilangan pembagi adalah nol
            if (bilanganB == 0.0) {
                println("Pesan Kesalahan: Tidak dapat melakukan pembagian dengan angka 0!")
            } else {
                val hasil = bagi(bilanganA, bilanganB)
                println("$bilanganA / $bilanganB = $hasil")
            }
        }
    }
}

// 1. Fungsi Penjumlahan: a + b
fun tambah(a: Double, b: Double): Double {
    return a + b
}

// 2. Fungsi Pengurangan: a - b
fun kurang(a: Double, b: Double): Double {
    return a - b
}

// 3. Fungsi Perkalian: a * b
fun kali(a: Double, b: Double): Double {
    return a * b
}

// 4. Fungsi Pembagian: a / b
fun bagi(a: Double, b: Double): Double {
    return a / b
}