fun main() {
    // 1. Menerima masukan panjang dan lebar menggunakan readln()
    print("Masukkan panjang: ")
    val panjangInput: Double = readln().toDouble()

    print("Masukkan lebar  : ")
    val lebarInput: Double = readln().toDouble()

    // 2. Memanggil fungsi hitungLuas untuk memproses perhitungan
    val luasHasil: Double = hitungLuas(panjangInput, lebarInput)

    // 3. Menampilkan hasil sesuai format contoh keluaran
    println("\nPanjang : ${formatNilai(panjangInput)}")
    println("Lebar   : ${formatNilai(lebarInput)}")
    println("Luas    : ${formatNilai(luasHasil)}")
}

// Fungsi dengan tipe kembalian Double untuk menghitung luas: panjang × lebar
fun hitungLuas(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}

// Fungsi pembantu agar angka bulat tidak memunculkan .0
fun formatNilai(nilai: Double): String {
    return if (nilai % 1.0 == 0.0) {
        nilai.toLong().toString()
    } else {
        nilai.toString()
    }
}